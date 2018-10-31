/**
 */
package oscar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see oscar.OscarPackage
 * @generated
 */
public interface OscarFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OscarFactory eINSTANCE = oscar.impl.OscarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Input</em>'.
	 * @generated
	 */
	ModuleInput createModuleInput();

	/**
	 * Returns a new object of class '<em>Module Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Output</em>'.
	 * @generated
	 */
	ModuleOutput createModuleOutput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OscarPackage getOscarPackage();

} //OscarFactory