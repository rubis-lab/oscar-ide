/**
 */
package oscar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSCAR Object Process Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oscar.OSCARObjectProcessDiagram#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see oscar.OscarPackage#getOSCARObjectProcessDiagram()
 * @model
 * @generated
 */
public interface OSCARObjectProcessDiagram extends OSCARContainer {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link oscar.OSCARLink}.
	 * It is bidirectional and its opposite is '{@link oscar.OSCARLink#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see oscar.OscarPackage#getOSCARObjectProcessDiagram_Links()
	 * @see oscar.OSCARLink#getOpd
	 * @model opposite="opd" containment="true"
	 * @generated
	 */
	EList<OSCARLink> getLinks();

} // OSCARObjectProcessDiagram
