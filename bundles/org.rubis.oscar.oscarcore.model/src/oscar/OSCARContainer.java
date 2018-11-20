/**
 */
package oscar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSCAR Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oscar.OSCARContainer#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see oscar.OscarPackage#getOSCARContainer()
 * @model
 * @generated
 */
public interface OSCARContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link oscar.OSCARNode}.
	 * It is bidirectional and its opposite is '{@link oscar.OSCARNode#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see oscar.OscarPackage#getOSCARContainer_Nodes()
	 * @see oscar.OSCARNode#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<OSCARNode> getNodes();

} // OSCARContainer
