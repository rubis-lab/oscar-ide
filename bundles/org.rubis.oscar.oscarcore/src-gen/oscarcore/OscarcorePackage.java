/**
 */
package oscarcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see oscarcore.OscarcoreFactory
 * @model kind="package"
 * @generated
 */
public interface OscarcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oscarcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/oscarcore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oscarcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OscarcorePackage eINSTANCE = oscarcore.impl.OscarcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link oscarcore.impl.ModuleInputImpl <em>Module Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscarcore.impl.ModuleInputImpl
	 * @see oscarcore.impl.OscarcorePackageImpl#getModuleInput()
	 * @generated
	 */
	int MODULE_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INPUT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Module Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Module Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oscarcore.impl.ModuleOutputImpl <em>Module Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscarcore.impl.ModuleOutputImpl
	 * @see oscarcore.impl.OscarcorePackageImpl#getModuleOutput()
	 * @generated
	 */
	int MODULE_OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OUTPUT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Module Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OUTPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Module Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OUTPUT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link oscarcore.ModuleInput <em>Module Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Input</em>'.
	 * @see oscarcore.ModuleInput
	 * @generated
	 */
	EClass getModuleInput();

	/**
	 * Returns the meta object for the attribute '{@link oscarcore.ModuleInput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oscarcore.ModuleInput#getName()
	 * @see #getModuleInput()
	 * @generated
	 */
	EAttribute getModuleInput_Name();

	/**
	 * Returns the meta object for class '{@link oscarcore.ModuleOutput <em>Module Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Output</em>'.
	 * @see oscarcore.ModuleOutput
	 * @generated
	 */
	EClass getModuleOutput();

	/**
	 * Returns the meta object for the attribute '{@link oscarcore.ModuleOutput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oscarcore.ModuleOutput#getName()
	 * @see #getModuleOutput()
	 * @generated
	 */
	EAttribute getModuleOutput_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OscarcoreFactory getOscarcoreFactory();

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
		 * The meta object literal for the '{@link oscarcore.impl.ModuleInputImpl <em>Module Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscarcore.impl.ModuleInputImpl
		 * @see oscarcore.impl.OscarcorePackageImpl#getModuleInput()
		 * @generated
		 */
		EClass MODULE_INPUT = eINSTANCE.getModuleInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_INPUT__NAME = eINSTANCE.getModuleInput_Name();

		/**
		 * The meta object literal for the '{@link oscarcore.impl.ModuleOutputImpl <em>Module Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscarcore.impl.ModuleOutputImpl
		 * @see oscarcore.impl.OscarcorePackageImpl#getModuleOutput()
		 * @generated
		 */
		EClass MODULE_OUTPUT = eINSTANCE.getModuleOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_OUTPUT__NAME = eINSTANCE.getModuleOutput_Name();

	}

} //OscarcorePackage
