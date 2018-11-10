/**
 */
package oscar.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import oscar.OscarFactory;
import oscar.Publish;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Publish</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PublishTest extends TestCase {

	/**
	 * The fixture for this Publish test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Publish fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PublishTest.class);
	}

	/**
	 * Constructs a new Publish test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Publish test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Publish fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Publish test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Publish getFixture() {
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
		setFixture(OscarFactory.eINSTANCE.createPublish());
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

} //PublishTest
