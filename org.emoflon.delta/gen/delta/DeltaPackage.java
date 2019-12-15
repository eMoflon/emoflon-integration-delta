/**
 */
package delta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * TODO: Add documentation for delta. Hint: You may copy this element in the Ecore editor to add documentation to EClasses, EOperations, ...
 * <!-- end-model-doc -->
 * @see delta.DeltaFactory
 * @model kind="package"
 * @generated
 */
public interface DeltaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "delta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.emoflon.delta/model/Delta.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.emoflon.delta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeltaPackage eINSTANCE = delta.impl.DeltaPackageImpl.init();

	/**
	 * The meta object id for the '{@link delta.impl.AttributeDeltaImpl <em>Attribute Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delta.impl.AttributeDeltaImpl
	 * @see delta.impl.DeltaPackageImpl#getAttributeDelta()
	 * @generated
	 */
	int ATTRIBUTE_DELTA = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DELTA__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DELTA__OBJECT = 1;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DELTA__NEW_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Attribute Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DELTA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DELTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link delta.impl.StructuralDeltaImpl <em>Structural Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delta.impl.StructuralDeltaImpl
	 * @see delta.impl.DeltaPackageImpl#getStructuralDelta()
	 * @generated
	 */
	int STRUCTURAL_DELTA = 1;

	/**
	 * The feature id for the '<em><b>Created Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DELTA__CREATED_OBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Deleted Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DELTA__DELETED_OBJECTS = 1;

	/**
	 * The feature id for the '<em><b>Created Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DELTA__CREATED_LINKS = 2;

	/**
	 * The feature id for the '<em><b>Deleted Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DELTA__DELETED_LINKS = 3;

	/**
	 * The number of structural features of the '<em>Structural Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DELTA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Structural Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DELTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link delta.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delta.impl.LinkImpl
	 * @see delta.impl.DeltaPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SRC = 1;

	/**
	 * The feature id for the '<em><b>Trg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TRG = 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link delta.impl.DeltaImpl <em>Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delta.impl.DeltaImpl
	 * @see delta.impl.DeltaPackageImpl#getDelta()
	 * @generated
	 */
	int DELTA = 3;

	/**
	 * The feature id for the '<em><b>Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA__ATOMIC = 0;

	/**
	 * The feature id for the '<em><b>Attribute Deltas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA__ATTRIBUTE_DELTAS = 1;

	/**
	 * The feature id for the '<em><b>Structural Delta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA__STRUCTURAL_DELTA = 2;

	/**
	 * The number of structural features of the '<em>Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link delta.impl.DeltaContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see delta.impl.DeltaContainerImpl
	 * @see delta.impl.DeltaPackageImpl#getDeltaContainer()
	 * @generated
	 */
	int DELTA_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Deltas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_CONTAINER__DELTAS = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link delta.AttributeDelta <em>Attribute Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Delta</em>'.
	 * @see delta.AttributeDelta
	 * @generated
	 */
	EClass getAttributeDelta();

	/**
	 * Returns the meta object for the reference '{@link delta.AttributeDelta#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see delta.AttributeDelta#getAttribute()
	 * @see #getAttributeDelta()
	 * @generated
	 */
	EReference getAttributeDelta_Attribute();

	/**
	 * Returns the meta object for the reference '{@link delta.AttributeDelta#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see delta.AttributeDelta#getObject()
	 * @see #getAttributeDelta()
	 * @generated
	 */
	EReference getAttributeDelta_Object();

	/**
	 * Returns the meta object for the attribute '{@link delta.AttributeDelta#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see delta.AttributeDelta#getNewValue()
	 * @see #getAttributeDelta()
	 * @generated
	 */
	EAttribute getAttributeDelta_NewValue();

	/**
	 * Returns the meta object for class '{@link delta.StructuralDelta <em>Structural Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Delta</em>'.
	 * @see delta.StructuralDelta
	 * @generated
	 */
	EClass getStructuralDelta();

	/**
	 * Returns the meta object for the containment reference list '{@link delta.StructuralDelta#getCreatedObjects <em>Created Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Created Objects</em>'.
	 * @see delta.StructuralDelta#getCreatedObjects()
	 * @see #getStructuralDelta()
	 * @generated
	 */
	EReference getStructuralDelta_CreatedObjects();

	/**
	 * Returns the meta object for the reference list '{@link delta.StructuralDelta#getDeletedObjects <em>Deleted Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deleted Objects</em>'.
	 * @see delta.StructuralDelta#getDeletedObjects()
	 * @see #getStructuralDelta()
	 * @generated
	 */
	EReference getStructuralDelta_DeletedObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link delta.StructuralDelta#getCreatedLinks <em>Created Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Created Links</em>'.
	 * @see delta.StructuralDelta#getCreatedLinks()
	 * @see #getStructuralDelta()
	 * @generated
	 */
	EReference getStructuralDelta_CreatedLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link delta.StructuralDelta#getDeletedLinks <em>Deleted Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deleted Links</em>'.
	 * @see delta.StructuralDelta#getDeletedLinks()
	 * @see #getStructuralDelta()
	 * @generated
	 */
	EReference getStructuralDelta_DeletedLinks();

	/**
	 * Returns the meta object for class '{@link delta.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see delta.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link delta.Link#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see delta.Link#getType()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Type();

	/**
	 * Returns the meta object for the reference '{@link delta.Link#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see delta.Link#getSrc()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Src();

	/**
	 * Returns the meta object for the reference '{@link delta.Link#getTrg <em>Trg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trg</em>'.
	 * @see delta.Link#getTrg()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Trg();

	/**
	 * Returns the meta object for class '{@link delta.Delta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delta</em>'.
	 * @see delta.Delta
	 * @generated
	 */
	EClass getDelta();

	/**
	 * Returns the meta object for the attribute '{@link delta.Delta#isAtomic <em>Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Atomic</em>'.
	 * @see delta.Delta#isAtomic()
	 * @see #getDelta()
	 * @generated
	 */
	EAttribute getDelta_Atomic();

	/**
	 * Returns the meta object for the containment reference list '{@link delta.Delta#getAttributeDeltas <em>Attribute Deltas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Deltas</em>'.
	 * @see delta.Delta#getAttributeDeltas()
	 * @see #getDelta()
	 * @generated
	 */
	EReference getDelta_AttributeDeltas();

	/**
	 * Returns the meta object for the containment reference '{@link delta.Delta#getStructuralDelta <em>Structural Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structural Delta</em>'.
	 * @see delta.Delta#getStructuralDelta()
	 * @see #getDelta()
	 * @generated
	 */
	EReference getDelta_StructuralDelta();

	/**
	 * Returns the meta object for class '{@link delta.DeltaContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see delta.DeltaContainer
	 * @generated
	 */
	EClass getDeltaContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link delta.DeltaContainer#getDeltas <em>Deltas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deltas</em>'.
	 * @see delta.DeltaContainer#getDeltas()
	 * @see #getDeltaContainer()
	 * @generated
	 */
	EReference getDeltaContainer_Deltas();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeltaFactory getDeltaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link delta.impl.AttributeDeltaImpl <em>Attribute Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delta.impl.AttributeDeltaImpl
		 * @see delta.impl.DeltaPackageImpl#getAttributeDelta()
		 * @generated
		 */
		EClass ATTRIBUTE_DELTA = eINSTANCE.getAttributeDelta();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DELTA__ATTRIBUTE = eINSTANCE.getAttributeDelta_Attribute();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DELTA__OBJECT = eINSTANCE.getAttributeDelta_Object();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DELTA__NEW_VALUE = eINSTANCE.getAttributeDelta_NewValue();

		/**
		 * The meta object literal for the '{@link delta.impl.StructuralDeltaImpl <em>Structural Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delta.impl.StructuralDeltaImpl
		 * @see delta.impl.DeltaPackageImpl#getStructuralDelta()
		 * @generated
		 */
		EClass STRUCTURAL_DELTA = eINSTANCE.getStructuralDelta();

		/**
		 * The meta object literal for the '<em><b>Created Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_DELTA__CREATED_OBJECTS = eINSTANCE.getStructuralDelta_CreatedObjects();

		/**
		 * The meta object literal for the '<em><b>Deleted Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_DELTA__DELETED_OBJECTS = eINSTANCE.getStructuralDelta_DeletedObjects();

		/**
		 * The meta object literal for the '<em><b>Created Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_DELTA__CREATED_LINKS = eINSTANCE.getStructuralDelta_CreatedLinks();

		/**
		 * The meta object literal for the '<em><b>Deleted Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_DELTA__DELETED_LINKS = eINSTANCE.getStructuralDelta_DeletedLinks();

		/**
		 * The meta object literal for the '{@link delta.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delta.impl.LinkImpl
		 * @see delta.impl.DeltaPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TYPE = eINSTANCE.getLink_Type();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SRC = eINSTANCE.getLink_Src();

		/**
		 * The meta object literal for the '<em><b>Trg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TRG = eINSTANCE.getLink_Trg();

		/**
		 * The meta object literal for the '{@link delta.impl.DeltaImpl <em>Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delta.impl.DeltaImpl
		 * @see delta.impl.DeltaPackageImpl#getDelta()
		 * @generated
		 */
		EClass DELTA = eINSTANCE.getDelta();

		/**
		 * The meta object literal for the '<em><b>Atomic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELTA__ATOMIC = eINSTANCE.getDelta_Atomic();

		/**
		 * The meta object literal for the '<em><b>Attribute Deltas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELTA__ATTRIBUTE_DELTAS = eINSTANCE.getDelta_AttributeDeltas();

		/**
		 * The meta object literal for the '<em><b>Structural Delta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELTA__STRUCTURAL_DELTA = eINSTANCE.getDelta_StructuralDelta();

		/**
		 * The meta object literal for the '{@link delta.impl.DeltaContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see delta.impl.DeltaContainerImpl
		 * @see delta.impl.DeltaPackageImpl#getDeltaContainer()
		 * @generated
		 */
		EClass DELTA_CONTAINER = eINSTANCE.getDeltaContainer();

		/**
		 * The meta object literal for the '<em><b>Deltas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELTA_CONTAINER__DELTAS = eINSTANCE.getDeltaContainer_Deltas();

	}

} //DeltaPackage
