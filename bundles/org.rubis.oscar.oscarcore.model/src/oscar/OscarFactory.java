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
	 * Returns a new object of class '<em>OSCAR Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSCAR Container</em>'.
	 * @generated
	 */
	OSCARContainer createOSCARContainer();

	/**
	 * Returns a new object of class '<em>OSCAR Object Process Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSCAR Object Process Diagram</em>'.
	 * @generated
	 */
	OSCARObjectProcessDiagram createOSCARObjectProcessDiagram();

	/**
	 * Returns a new object of class '<em>OSCAR Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSCAR Node</em>'.
	 * @generated
	 */
	OSCARNode createOSCARNode();

	/**
	 * Returns a new object of class '<em>OSCAR Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSCAR Thing</em>'.
	 * @generated
	 */
	OSCARThing createOSCARThing();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic</em>'.
	 * @generated
	 */
	Topic createTopic();

	/**
	 * Returns a new object of class '<em>OSCAR Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSCAR Link</em>'.
	 * @generated
	 */
	OSCARLink createOSCARLink();

	/**
	 * Returns a new object of class '<em>OSCAR Procedural Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSCAR Procedural Link</em>'.
	 * @generated
	 */
	OSCARProceduralLink createOSCARProceduralLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OscarPackage getOscarPackage();

} //OscarFactory
