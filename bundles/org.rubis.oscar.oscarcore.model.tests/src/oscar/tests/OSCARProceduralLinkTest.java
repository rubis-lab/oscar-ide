/**
 */
package oscar.tests;

import junit.textui.TestRunner;

import oscar.OSCARProceduralLink;
import oscar.OscarFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OSCAR Procedural Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSCARProceduralLinkTest extends OSCARLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OSCARProceduralLinkTest.class);
	}

	/**
	 * Constructs a new OSCAR Procedural Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARProceduralLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OSCAR Procedural Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OSCARProceduralLink getFixture() {
		return (OSCARProceduralLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OscarFactory.eINSTANCE.createOSCARProceduralLink());
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

} //OSCARProceduralLinkTest
