package org.emoflon.delta.validation;

import org.eclipse.emf.ecore.EObject;

import delta.AttributeDelta;
import delta.Delta;
import delta.DeltaContainer;
import delta.Link;
import delta.StructuralDelta;

public class DeltaValidator {

	private static final String DANGLING_NODE_MSG = "Created object is not part of the containment hierachy: ";
	private static final String NULL_REF_ATTRDELTA_ATTR = "Value 'attribute' is not specified: ";
	private static final String NULL_REF_ATTRDELTA_OBJ = "Value 'object' is not specified: ";
	private static final String NULL_REF_ATTRDELTA_NEWVAL = "Value 'newValue' is not specified: ";

	private static final String NULL_REF_LINK_SRC = "Value 'src' is not specified: ";
	private static final String NULL_REF_LINK_TRG = "Value 'trg' is not specified: ";
	private static final String NULL_REF_LINK_TYPE = "Value 'type' is not specified: ";

	/**
	 * Checks deltas for invalid constructs.
	 * 
	 * @param deltas
	 * @throws InvalidDeltaException if a delta has an invalid construct
	 */
	public static void validate(DeltaContainer deltas) throws InvalidDeltaException {
		for (Delta delta : deltas.getDeltas()) {
			checkForNullRefs(delta);
			checkForCreatedDanglingNodes(delta);
			// adrianm: if there are any problems,
			// maybe check for created-deleted pairs of elements or edges
		}
	}

	private static void checkForNullRefs(Delta delta) throws InvalidDeltaException {
		for (AttributeDelta attrDelta : delta.getAttributeDeltas()) {
			if (attrDelta.getAttribute() == null)
				throw new InvalidDeltaException(NULL_REF_ATTRDELTA_ATTR + attrDelta.toString());
			if (attrDelta.getObject() == null)
				throw new InvalidDeltaException(NULL_REF_ATTRDELTA_OBJ + attrDelta.toString());
			if (attrDelta.getNewValue() == null)
				throw new InvalidDeltaException(NULL_REF_ATTRDELTA_NEWVAL + attrDelta.toString());
		}

		StructuralDelta strDelta = delta.getStructuralDelta();
		if (strDelta != null) {
			for (Link link : strDelta.getCreatedLinks()) {
				checkForNullRefs(link);
			}
			for (Link link : strDelta.getDeletedLinks()) {
				checkForNullRefs(link);
			}
		}
	}

	private static void checkForNullRefs(Link link) throws InvalidDeltaException {
		if (link.getSrc() == null)
			throw new InvalidDeltaException(NULL_REF_LINK_SRC + link.toString());
		if (link.getTrg() == null)
			throw new InvalidDeltaException(NULL_REF_LINK_TRG + link.toString());
		if (link.getType() == null)
			throw new InvalidDeltaException(NULL_REF_LINK_TYPE + link.toString());
	}

	private static void checkForCreatedDanglingNodes(Delta delta) throws InvalidDeltaException {
		StructuralDelta strDelta = delta.getStructuralDelta();
		if (strDelta != null) {
			for (EObject obj : strDelta.getCreatedObjects()) {
				boolean isDangling = true;
				for (Link link : strDelta.getCreatedLinks()) {
					if (!link.getType().isContainment())
						continue;

					if (obj.equals(link.getTrg())) {
						isDangling = false;
						break;
					}
				}
				if (isDangling)
					throw new InvalidDeltaException(DANGLING_NODE_MSG + obj.toString());
			}

		}
	}

}
