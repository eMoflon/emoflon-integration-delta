/**
 */
package delta.impl;

import delta.Delta;
import delta.DeltaContainer;
import delta.DeltaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link delta.impl.DeltaContainerImpl#getDeltas <em>Deltas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeltaContainerImpl extends EObjectImpl implements DeltaContainer {
	/**
	 * The cached value of the '{@link #getDeltas() <em>Deltas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltas()
	 * @generated
	 * @ordered
	 */
	protected EList<Delta> deltas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeltaContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeltaPackage.Literals.DELTA_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Delta> getDeltas() {
		if (deltas == null) {
			deltas = new EObjectContainmentEList<Delta>(Delta.class, this, DeltaPackage.DELTA_CONTAINER__DELTAS);
		}
		return deltas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeltaPackage.DELTA_CONTAINER__DELTAS:
			return ((InternalEList<?>) getDeltas()).basicRemove(otherEnd, msgs);
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
		case DeltaPackage.DELTA_CONTAINER__DELTAS:
			return getDeltas();
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
		case DeltaPackage.DELTA_CONTAINER__DELTAS:
			getDeltas().clear();
			getDeltas().addAll((Collection<? extends Delta>) newValue);
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
		case DeltaPackage.DELTA_CONTAINER__DELTAS:
			getDeltas().clear();
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
		case DeltaPackage.DELTA_CONTAINER__DELTAS:
			return deltas != null && !deltas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeltaContainerImpl
