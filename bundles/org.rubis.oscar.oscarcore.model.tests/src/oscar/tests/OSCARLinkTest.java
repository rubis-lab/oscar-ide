/**
 */
package oscar.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import oscar.OSCARLink;
import oscar.OscarFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OSCAR Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSCARLinkTest extends TestCase {

	/**
	 * The fixture for this OSCAR Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSCARLink fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OSCARLinkTest.class);
	}

	/**
	 * Constructs a new OSCAR Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARLinkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this OSCAR Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OSCARLink fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this OSCAR Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSCARLink getFixture() {
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
		setFixture(OscarFactory.eINSTANCE.createOSCARLink());
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

} //OSCARLinkTest
