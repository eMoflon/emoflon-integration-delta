package org.emoflon.delta.application;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.delta.validation.DeltaValidator;
import org.emoflon.delta.validation.InvalidDeltaException;
import org.emoflon.ibex.common.emf.EMFEdge;
import org.emoflon.ibex.common.emf.EMFManipulationUtils;

import delta.AttributeDelta;
import delta.Delta;
import delta.Link;
import delta.StructuralDelta;

public class DeltaApplication {

	public static void applyDelta(Delta delta) throws InvalidDeltaException {
		DeltaValidator.validate(delta);
		DeltaApplication.apply(delta);
	}

	private static void apply(Delta delta) {
		delta.getAttributeDeltas().forEach(attrDelta -> applyAttributeDelta(attrDelta));
		StructuralDelta strDelta = delta.getStructuralDelta();
		if (strDelta != null)
			applyStructuralDelta(strDelta);
	}

	private static void applyAttributeDelta(AttributeDelta attrDelta) {
		attrDelta.getObject().eSet(attrDelta.getAttribute(), attrDelta.getNewValue());
	}

	private static void applyStructuralDelta(StructuralDelta strDelta) {
		strDelta.getDeletedObjects().forEach(obj -> deleteElement(obj, false));
		strDelta.getDeletedLinks().forEach(link -> deleteEdge(createEMFEdgeFromLink(link)));

		// if there are any problems with Democles, try create containment edges first
		strDelta.getCreatedLinks().forEach(link -> createEdge(createEMFEdgeFromLink(link)));
	}

	private static EMFEdge createEMFEdgeFromLink(Link link) {
		return new EMFEdge(link.getSrc(), link.getTrg(), link.getType());
	}

	private static boolean isDangling(EObject object) {
		return object.eResource() == null;
	}

	@SuppressWarnings("unchecked")
	public static void createEdge(EMFEdge edge) {
		if (edge.getSource() == null || edge.getTarget() == null)
			return;

		if (edge.getType().isMany()) {
			Collection<EObject> value = (Collection<EObject>) edge.getSource().eGet(edge.getType());
			value.add(edge.getTarget());
		} else
			edge.getSource().eSet(edge.getType(), edge.getTarget());
	}

	@SuppressWarnings("unchecked")
	public static void deleteEdge(EMFEdge edge) {
		if (edge.getSource() == null || edge.getTarget() == null)
			return;

		// for containments: delete edge, but keep target object in resource, if resource is accessible
		if (edge.getType().isContainment()) {
			Resource res = edge.getTarget().eResource();
			if (res != null) {
				res.getContents().add(edge.getTarget());
				return;
			}
		}

		// for references and dangling nodes: just delete edge
		if (edge.getType().isMany()) {
			Collection<EObject> value = (Collection<EObject>) edge.getSource().eGet(edge.getType());
			value.remove(edge.getTarget());
		} else
			edge.getSource().eSet(edge.getType(), null);
	}

	@SuppressWarnings("unchecked")
	public static void deleteElement(EObject element, boolean deleteContainedChildren) {
		if (isDangling(element))
			return;

		Set<EObject> nodesToDelete = new HashSet<>();
		nodesToDelete.add(element);

		if (deleteContainedChildren) {
			// this will only work with Democles if deletion is performed using a trash resource!
			EMFManipulationUtils.delete(nodesToDelete, Collections.EMPTY_SET, true, true);
		} else {
			element.eClass().getEAllContainments().forEach(feature -> {
				Object content = element.eGet(feature);
				if (content instanceof Collection) {
					Collection<EObject> contentList = (Collection<EObject>) content;
					element.eResource().getContents().addAll(contentList);
					contentList.clear();
				} else if (content instanceof EObject) {
					element.eResource().getContents().add((EObject) content);
					element.eSet(feature, null);
				}
			});
			EMFManipulationUtils.delete(nodesToDelete, Collections.EMPTY_SET, false, true);
		}
	}
}
