/**
 */
package delta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.emoflon.delta.validation.InvalidDeltaException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delta.Delta#isAtomic <em>Atomic</em>}</li>
 *   <li>{@link delta.Delta#getAttributeDeltas <em>Attribute Deltas</em>}</li>
 *   <li>{@link delta.Delta#getStructuralDelta <em>Structural Delta</em>}</li>
 *   <li>{@link delta.Delta#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see delta.DeltaPackage#getDelta()
 * @model
 * @generated
 */
public interface Delta extends EObject {
	/**
	 * Returns the value of the '<em><b>Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomic</em>' attribute.
	 * @see #setAtomic(boolean)
	 * @see delta.DeltaPackage#getDelta_Atomic()
	 * @model
	 * @generated
	 */
	boolean isAtomic();

	/**
	 * Sets the value of the '{@link delta.Delta#isAtomic <em>Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atomic</em>' attribute.
	 * @see #isAtomic()
	 * @generated
	 */
	void setAtomic(boolean value);

	/**
	 * Returns the value of the '<em><b>Attribute Deltas</b></em>' containment reference list.
	 * The list contents are of type {@link delta.AttributeDelta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Deltas</em>' containment reference list.
	 * @see delta.DeltaPackage#getDelta_AttributeDeltas()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDelta> getAttributeDeltas();

	/**
	 * Returns the value of the '<em><b>Structural Delta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Delta</em>' containment reference.
	 * @see #setStructuralDelta(StructuralDelta)
	 * @see delta.DeltaPackage#getDelta_StructuralDelta()
	 * @model containment="true"
	 * @generated
	 */
	StructuralDelta getStructuralDelta();

	/**
	 * Sets the value of the '{@link delta.Delta#getStructuralDelta <em>Structural Delta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Delta</em>' containment reference.
	 * @see #getStructuralDelta()
	 * @generated
	 */
	void setStructuralDelta(StructuralDelta value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link delta.DeltaContainer#getDeltas <em>Deltas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(DeltaContainer)
	 * @see delta.DeltaPackage#getDelta_Container()
	 * @see delta.DeltaContainer#getDeltas
	 * @model opposite="deltas" transient="false"
	 * @generated
	 */
	DeltaContainer getContainer();

	/**
	 * Sets the value of the '{@link delta.Delta#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(DeltaContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="delta.EInvalidDeltaException"
	 * @generated
	 */
	void apply() throws InvalidDeltaException;

} // Delta
