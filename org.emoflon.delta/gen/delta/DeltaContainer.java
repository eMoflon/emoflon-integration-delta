/**
 */
package delta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delta.DeltaContainer#getDeltas <em>Deltas</em>}</li>
 * </ul>
 *
 * @see delta.DeltaPackage#getDeltaContainer()
 * @model
 * @generated
 */
public interface DeltaContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Deltas</b></em>' containment reference list.
	 * The list contents are of type {@link delta.Delta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deltas</em>' containment reference list.
	 * @see delta.DeltaPackage#getDeltaContainer_Deltas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Delta> getDeltas();

} // DeltaContainer
