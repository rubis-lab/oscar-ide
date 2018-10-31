/**
 */
package oscarcore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import oscarcore.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OscarcoreFactoryImpl extends EFactoryImpl implements OscarcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OscarcoreFactory init() {
		try {
			OscarcoreFactory theOscarcoreFactory = (OscarcoreFactory) EPackage.Registry.INSTANCE
					.getEFactory(OscarcorePackage.eNS_URI);
			if (theOscarcoreFactory != null) {
				return theOscarcoreFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OscarcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscarcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case OscarcorePackage.MODULE_INPUT:
			return createModuleInput();
		case OscarcorePackage.MODULE_OUTPUT:
			return createModuleOutput();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleInput createModuleInput() {
		ModuleInputImpl moduleInput = new ModuleInputImpl();
		return moduleInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleOutput createModuleOutput() {
		ModuleOutputImpl moduleOutput = new ModuleOutputImpl();
		return moduleOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscarcorePackage getOscarcorePackage() {
		return (OscarcorePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OscarcorePackage getPackage() {
		return OscarcorePackage.eINSTANCE;
	}

} //OscarcoreFactoryImpl
