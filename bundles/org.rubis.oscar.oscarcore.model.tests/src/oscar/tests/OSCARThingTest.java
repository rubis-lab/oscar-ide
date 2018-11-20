/**
 */
package oscar.tests;

import junit.textui.TestRunner;

import oscar.OSCARThing;
import oscar.OscarFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OSCAR Thing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSCARThingTest extends OSCARNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OSCARThingTest.class);
	}

	/**
	 * Constructs a new OSCAR Thing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARThingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OSCAR Thing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OSCARThing getFixture() {
		return (OSCARThing)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OscarFactory.eINSTANCE.createOSCARThing());
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

} //OSCARThingTest
