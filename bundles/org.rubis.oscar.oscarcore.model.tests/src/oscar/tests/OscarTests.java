/**
 */
package oscar.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>oscar</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OscarTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OscarTests("oscar Tests");
		suite.addTestSuite(OSCARNodeTest.class);
		suite.addTestSuite(OSCARThingTest.class);
		suite.addTestSuite(NodeTest.class);
		suite.addTestSuite(TopicTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscarTests(String name) {
		super(name);
	}

} //OscarTests
