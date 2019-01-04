/**
 */
package oscar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oscar.Node#getGroup <em>Group</em>}</li>
 *   <li>{@link oscar.Node#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see oscar.OscarPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends OSCARThing {

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link oscar.Node#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(Node)
	 * @see oscar.OscarPackage#getNode_Group()
	 * @see oscar.Node#getMembers
	 * @model opposite="members"
	 * @generated
	 */
	Node getGroup();

	/**
	 * Sets the value of the '{@link oscar.Node#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Node value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link oscar.Node}.
	 * It is bidirectional and its opposite is '{@link oscar.Node#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see oscar.OscarPackage#getNode_Members()
	 * @see oscar.Node#getGroup
	 * @model opposite="group"
	 * @generated
	 */
	EList<Node> getMembers();
} // Node
