/**
 */
package oscar.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import oscar.OscarFactory;
import oscar.Subscribe;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subscribe</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubscribeTest extends TestCase {

	/**
	 * The fixture for this Subscribe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Subscribe fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubscribeTest.class);
	}

	/**
	 * Constructs a new Subscribe test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Subscribe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Subscribe fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Subscribe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Subscribe getFixture() {
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
		setFixture(OscarFactory.eINSTANCE.createSubscribe());
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

} //SubscribeTest
