/**
 */
package delta.impl;

import delta.DeltaPackage;
import delta.Link;
import delta.StructuralDelta;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Delta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link delta.impl.StructuralDeltaImpl#getCreatedObjects <em>Created Objects</em>}</li>
 *   <li>{@link delta.impl.StructuralDeltaImpl#getDeletedObjects <em>Deleted Objects</em>}</li>
 *   <li>{@link delta.impl.StructuralDeltaImpl#getCreatedLinks <em>Created Links</em>}</li>
 *   <li>{@link delta.impl.StructuralDeltaImpl#getDeletedLinks <em>Deleted Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuralDeltaImpl extends EObjectImpl implements StructuralDelta {
	/**
	 * The cached value of the '{@link #getCreatedObjects() <em>Created Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> createdObjects;

	/**
	 * The cached value of the '{@link #getDeletedObjects() <em>Deleted Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> deletedObjects;

	/**
	 * The cached value of the '{@link #getCreatedLinks() <em>Created Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> createdLinks;

	/**
	 * The cached value of the '{@link #getDeletedLinks() <em>Deleted Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> deletedLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralDeltaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeltaPackage.Literals.STRUCTURAL_DELTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getCreatedObjects() {
		if (createdObjects == null) {
			createdObjects = new EObjectContainmentEList<EObject>(EObject.class, this,
					DeltaPackage.STRUCTURAL_DELTA__CREATED_OBJECTS);
		}
		return createdObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getDeletedObjects() {
		if (deletedObjects == null) {
			deletedObjects = new EObjectResolvingEList<EObject>(EObject.class, this,
					DeltaPackage.STRUCTURAL_DELTA__DELETED_OBJECTS);
		}
		return deletedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getCreatedLinks() {
		if (createdLinks == null) {
			createdLinks = new EObjectContainmentEList<Link>(Link.class, this,
					DeltaPackage.STRUCTURAL_DELTA__CREATED_LINKS);
		}
		return createdLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getDeletedLinks() {
		if (deletedLinks == null) {
			deletedLinks = new EObjectContainmentEList<Link>(Link.class, this,
					DeltaPackage.STRUCTURAL_DELTA__DELETED_LINKS);
		}
		return deletedLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeltaPackage.STRUCTURAL_DELTA__CREATED_OBJECTS:
			return ((InternalEList<?>) getCreatedObjects()).basicRemove(otherEnd, msgs);
		case DeltaPackage.STRUCTURAL_DELTA__CREATED_LINKS:
			return ((InternalEList<?>) getCreatedLinks()).basicRemove(otherEnd, msgs);
		case DeltaPackage.STRUCTURAL_DELTA__DELETED_LINKS:
			return ((InternalEList<?>) getDeletedLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeltaPackage.STRUCTURAL_DELTA__CREATED_OBJECTS:
			return getCreatedObjects();
		case DeltaPackage.STRUCTURAL_DELTA__DELETED_OBJECTS:
			return getDeletedObjects();
		case DeltaPackage.STRUCTURAL_DELTA__CREATED_LINKS:
			return getCreatedLinks();
		case DeltaPackage.STRUCTURAL_DELTA__DELETED_LINKS:
			return getDeletedLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DeltaPackage.STRUCTURAL_DELTA__CREATED_OBJECTS:
			getCreatedObjects().clear();
			getCreatedObjects().addAll((Collection<? extends EObject>) newValue);
			return;
		case DeltaPackage.STRUCTURAL_DELTA__DELETED_OBJECTS:
			getDeletedObjects().clear();
			getDeletedObjects().addAll((Collection<? extends EObject>) newValue);
			return;
		case DeltaPackage.STRUCTURAL_DELTA__CREATED_LINKS:
			getCreatedLinks().clear();
			getCreatedLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case DeltaPackage.STRUCTURAL_DELTA__DELETED_LINKS:
			getDeletedLinks().clear();
			getDeletedLinks().addAll((Collection<? extends Link>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DeltaPackage.STRUCTURAL_DELTA__CREATED_OBJECTS:
			getCreatedObjects().clear();
			return;
		case DeltaPackage.STRUCTURAL_DELTA__DELETED_OBJECTS:
			getDeletedObjects().clear();
			return;
		case DeltaPackage.STRUCTURAL_DELTA__CREATED_LINKS:
			getCreatedLinks().clear();
			return;
		case DeltaPackage.STRUCTURAL_DELTA__DELETED_LINKS:
			getDeletedLinks().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DeltaPackage.STRUCTURAL_DELTA__CREATED_OBJECTS:
			return createdObjects != null && !createdObjects.isEmpty();
		case DeltaPackage.STRUCTURAL_DELTA__DELETED_OBJECTS:
			return deletedObjects != null && !deletedObjects.isEmpty();
		case DeltaPackage.STRUCTURAL_DELTA__CREATED_LINKS:
			return createdLinks != null && !createdLinks.isEmpty();
		case DeltaPackage.STRUCTURAL_DELTA__DELETED_LINKS:
			return deletedLinks != null && !deletedLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuralDeltaImpl
