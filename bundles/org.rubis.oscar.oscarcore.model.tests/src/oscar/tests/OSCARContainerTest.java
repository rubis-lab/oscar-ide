/**
 */
package oscar.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import oscar.OSCARContainer;
import oscar.OscarFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OSCAR Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSCARContainerTest extends TestCase {

	/**
	 * The fixture for this OSCAR Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSCARContainer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OSCARContainerTest.class);
	}

	/**
	 * Constructs a new OSCAR Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARContainerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this OSCAR Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OSCARContainer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this OSCAR Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSCARContainer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OscarFactory.eINSTANCE.createOSCARContainer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //OSCARContainerTest
