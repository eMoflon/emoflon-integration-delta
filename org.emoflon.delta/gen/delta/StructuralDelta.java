/**
 */
package delta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Delta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delta.StructuralDelta#getCreatedObjects <em>Created Objects</em>}</li>
 *   <li>{@link delta.StructuralDelta#getDeletedObjects <em>Deleted Objects</em>}</li>
 *   <li>{@link delta.StructuralDelta#getCreatedLinks <em>Created Links</em>}</li>
 *   <li>{@link delta.StructuralDelta#getDeletedLinks <em>Deleted Links</em>}</li>
 * </ul>
 *
 * @see delta.DeltaPackage#getStructuralDelta()
 * @model
 * @generated
 */
public interface StructuralDelta extends EObject {
	/**
	 * Returns the value of the '<em><b>Created Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Objects</em>' containment reference list.
	 * @see delta.DeltaPackage#getStructuralDelta_CreatedObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getCreatedObjects();

	/**
	 * Returns the value of the '<em><b>Deleted Objects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted Objects</em>' reference list.
	 * @see delta.DeltaPackage#getStructuralDelta_DeletedObjects()
	 * @model
	 * @generated
	 */
	EList<EObject> getDeletedObjects();

	/**
	 * Returns the value of the '<em><b>Created Links</b></em>' containment reference list.
	 * The list contents are of type {@link delta.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Links</em>' containment reference list.
	 * @see delta.DeltaPackage#getStructuralDelta_CreatedLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getCreatedLinks();

	/**
	 * Returns the value of the '<em><b>Deleted Links</b></em>' containment reference list.
	 * The list contents are of type {@link delta.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted Links</em>' containment reference list.
	 * @see delta.DeltaPackage#getStructuralDelta_DeletedLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getDeletedLinks();

} // StructuralDelta
