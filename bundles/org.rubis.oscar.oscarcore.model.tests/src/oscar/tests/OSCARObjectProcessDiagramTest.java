/**
 */
package oscar.tests;

import junit.textui.TestRunner;

import oscar.OSCARObjectProcessDiagram;
import oscar.OscarFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OSCAR Object Process Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSCARObjectProcessDiagramTest extends OSCARContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OSCARObjectProcessDiagramTest.class);
	}

	/**
	 * Constructs a new OSCAR Object Process Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARObjectProcessDiagramTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OSCAR Object Process Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OSCARObjectProcessDiagram getFixture() {
		return (OSCARObjectProcessDiagram)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OscarFactory.eINSTANCE.createOSCARObjectProcessDiagram());
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

} //OSCARObjectProcessDiagramTest
