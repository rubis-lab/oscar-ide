/**
 */
package oscar;

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
 * @see oscar.OscarFactory
 * @model kind="package"
 * @generated
 */
public interface OscarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oscar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "rubis.snu.ac.kr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oscar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OscarPackage eINSTANCE = oscar.impl.OscarPackageImpl.init();

	/**
	 * The meta object id for the '{@link oscar.impl.ModuleInputImpl <em>Module Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.ModuleInputImpl
	 * @see oscar.impl.OscarPackageImpl#getModuleInput()
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
	 * The meta object id for the '{@link oscar.impl.ModuleOutputImpl <em>Module Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.ModuleOutputImpl
	 * @see oscar.impl.OscarPackageImpl#getModuleOutput()
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
	 * The meta object id for the '{@link oscar.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.ModuleImpl
	 * @see oscar.impl.OscarPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oscar.impl.PublishImpl <em>Publish</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.PublishImpl
	 * @see oscar.impl.OscarPackageImpl#getPublish()
	 * @generated
	 */
	int PUBLISH = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH__NAME = 0;

	/**
	 * The number of structural features of the '<em>Publish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Publish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oscar.impl.SubscribeImpl <em>Subscribe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.SubscribeImpl
	 * @see oscar.impl.OscarPackageImpl#getSubscribe()
	 * @generated
	 */
	int SUBSCRIBE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oscar.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.TopicImpl
	 * @see oscar.impl.OscarPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = 0;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link oscar.ModuleInput <em>Module Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Input</em>'.
	 * @see oscar.ModuleInput
	 * @generated
	 */
	EClass getModuleInput();

	/**
	 * Returns the meta object for the attribute '{@link oscar.ModuleInput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oscar.ModuleInput#getName()
	 * @see #getModuleInput()
	 * @generated
	 */
	EAttribute getModuleInput_Name();

	/**
	 * Returns the meta object for class '{@link oscar.ModuleOutput <em>Module Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Output</em>'.
	 * @see oscar.ModuleOutput
	 * @generated
	 */
	EClass getModuleOutput();

	/**
	 * Returns the meta object for the attribute '{@link oscar.ModuleOutput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oscar.ModuleOutput#getName()
	 * @see #getModuleOutput()
	 * @generated
	 */
	EAttribute getModuleOutput_Name();

	/**
	 * Returns the meta object for class '{@link oscar.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see oscar.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link oscar.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oscar.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for class '{@link oscar.Publish <em>Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publish</em>'.
	 * @see oscar.Publish
	 * @generated
	 */
	EClass getPublish();

	/**
	 * Returns the meta object for the attribute '{@link oscar.Publish#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oscar.Publish#getName()
	 * @see #getPublish()
	 * @generated
	 */
	EAttribute getPublish_Name();

	/**
	 * Returns the meta object for class '{@link oscar.Subscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscribe</em>'.
	 * @see oscar.Subscribe
	 * @generated
	 */
	EClass getSubscribe();

	/**
	 * Returns the meta object for the attribute '{@link oscar.Subscribe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oscar.Subscribe#getName()
	 * @see #getSubscribe()
	 * @generated
	 */
	EAttribute getSubscribe_Name();

	/**
	 * Returns the meta object for class '{@link oscar.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see oscar.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link oscar.Topic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oscar.Topic#getName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OscarFactory getOscarFactory();

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
		 * The meta object literal for the '{@link oscar.impl.ModuleInputImpl <em>Module Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.ModuleInputImpl
		 * @see oscar.impl.OscarPackageImpl#getModuleInput()
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
		 * The meta object literal for the '{@link oscar.impl.ModuleOutputImpl <em>Module Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.ModuleOutputImpl
		 * @see oscar.impl.OscarPackageImpl#getModuleOutput()
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

		/**
		 * The meta object literal for the '{@link oscar.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.ModuleImpl
		 * @see oscar.impl.OscarPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '{@link oscar.impl.PublishImpl <em>Publish</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.PublishImpl
		 * @see oscar.impl.OscarPackageImpl#getPublish()
		 * @generated
		 */
		EClass PUBLISH = eINSTANCE.getPublish();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISH__NAME = eINSTANCE.getPublish_Name();

		/**
		 * The meta object literal for the '{@link oscar.impl.SubscribeImpl <em>Subscribe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.SubscribeImpl
		 * @see oscar.impl.OscarPackageImpl#getSubscribe()
		 * @generated
		 */
		EClass SUBSCRIBE = eINSTANCE.getSubscribe();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBE__NAME = eINSTANCE.getSubscribe_Name();

		/**
		 * The meta object literal for the '{@link oscar.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.TopicImpl
		 * @see oscar.impl.OscarPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__NAME = eINSTANCE.getTopic_Name();

	}

} //OscarPackage
