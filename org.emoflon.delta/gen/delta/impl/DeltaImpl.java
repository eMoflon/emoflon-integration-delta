/**
 */
package delta.impl;

import delta.AttributeDelta;
import delta.Delta;
import delta.DeltaPackage;
import delta.StructuralDelta;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link delta.impl.DeltaImpl#isAtomic <em>Atomic</em>}</li>
 *   <li>{@link delta.impl.DeltaImpl#getAttributeDeltas <em>Attribute Deltas</em>}</li>
 *   <li>{@link delta.impl.DeltaImpl#getStructuralDelta <em>Structural Delta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeltaImpl extends EObjectImpl implements Delta {
	/**
	 * The default value of the '{@link #isAtomic() <em>Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtomic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATOMIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAtomic() <em>Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtomic()
	 * @generated
	 * @ordered
	 */
	protected boolean atomic = ATOMIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeDeltas() <em>Attribute Deltas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDeltas()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDelta> attributeDeltas;

	/**
	 * The cached value of the '{@link #getStructuralDelta() <em>Structural Delta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralDelta()
	 * @generated
	 * @ordered
	 */
	protected StructuralDelta structuralDelta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeltaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeltaPackage.Literals.DELTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAtomic() {
		return atomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAtomic(boolean newAtomic) {
		boolean oldAtomic = atomic;
		atomic = newAtomic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeltaPackage.DELTA__ATOMIC, oldAtomic, atomic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeDelta> getAttributeDeltas() {
		if (attributeDeltas == null) {
			attributeDeltas = new EObjectContainmentEList<AttributeDelta>(AttributeDelta.class, this,
					DeltaPackage.DELTA__ATTRIBUTE_DELTAS);
		}
		return attributeDeltas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralDelta getStructuralDelta() {
		return structuralDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralDelta(StructuralDelta newStructuralDelta, NotificationChain msgs) {
		StructuralDelta oldStructuralDelta = structuralDelta;
		structuralDelta = newStructuralDelta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DeltaPackage.DELTA__STRUCTURAL_DELTA, oldStructuralDelta, newStructuralDelta);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStructuralDelta(StructuralDelta newStructuralDelta) {
		if (newStructuralDelta != structuralDelta) {
			NotificationChain msgs = null;
			if (structuralDelta != null)
				msgs = ((InternalEObject) structuralDelta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DeltaPackage.DELTA__STRUCTURAL_DELTA, null, msgs);
			if (newStructuralDelta != null)
				msgs = ((InternalEObject) newStructuralDelta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DeltaPackage.DELTA__STRUCTURAL_DELTA, null, msgs);
			msgs = basicSetStructuralDelta(newStructuralDelta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeltaPackage.DELTA__STRUCTURAL_DELTA,
					newStructuralDelta, newStructuralDelta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeltaPackage.DELTA__ATTRIBUTE_DELTAS:
			return ((InternalEList<?>) getAttributeDeltas()).basicRemove(otherEnd, msgs);
		case DeltaPackage.DELTA__STRUCTURAL_DELTA:
			return basicSetStructuralDelta(null, msgs);
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
		case DeltaPackage.DELTA__ATOMIC:
			return isAtomic();
		case DeltaPackage.DELTA__ATTRIBUTE_DELTAS:
			return getAttributeDeltas();
		case DeltaPackage.DELTA__STRUCTURAL_DELTA:
			return getStructuralDelta();
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
		case DeltaPackage.DELTA__ATOMIC:
			setAtomic((Boolean) newValue);
			return;
		case DeltaPackage.DELTA__ATTRIBUTE_DELTAS:
			getAttributeDeltas().clear();
			getAttributeDeltas().addAll((Collection<? extends AttributeDelta>) newValue);
			return;
		case DeltaPackage.DELTA__STRUCTURAL_DELTA:
			setStructuralDelta((StructuralDelta) newValue);
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
		case DeltaPackage.DELTA__ATOMIC:
			setAtomic(ATOMIC_EDEFAULT);
			return;
		case DeltaPackage.DELTA__ATTRIBUTE_DELTAS:
			getAttributeDeltas().clear();
			return;
		case DeltaPackage.DELTA__STRUCTURAL_DELTA:
			setStructuralDelta((StructuralDelta) null);
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
		case DeltaPackage.DELTA__ATOMIC:
			return atomic != ATOMIC_EDEFAULT;
		case DeltaPackage.DELTA__ATTRIBUTE_DELTAS:
			return attributeDeltas != null && !attributeDeltas.isEmpty();
		case DeltaPackage.DELTA__STRUCTURAL_DELTA:
			return structuralDelta != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (atomic: ");
		result.append(atomic);
		result.append(')');
		return result.toString();
	}

} //DeltaImpl
