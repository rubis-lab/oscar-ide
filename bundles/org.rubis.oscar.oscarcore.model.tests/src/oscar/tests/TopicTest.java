/**
 */
package oscar.tests;

import junit.textui.TestRunner;

import oscar.OscarFactory;
import oscar.Topic;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopicTest extends OSCARThingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TopicTest.class);
	}

	/**
	 * Constructs a new Topic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Topic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Topic getFixture() {
		return (Topic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OscarFactory.eINSTANCE.createTopic());
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

} //TopicTest
