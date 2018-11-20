/**
 */
package oscar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSCAR Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oscar.OSCARThing#getName <em>Name</em>}</li>
 *   <li>{@link oscar.OSCARThing#getMsg <em>Msg</em>}</li>
 *   <li>{@link oscar.OSCARThing#getMsg_type <em>Msg type</em>}</li>
 * </ul>
 *
 * @see oscar.OscarPackage#getOSCARThing()
 * @model
 * @generated
 */
public interface OSCARThing extends OSCARNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see oscar.OscarPackage#getOSCARThing_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link oscar.OSCARThing#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' attribute.
	 * @see #setMsg(String)
	 * @see oscar.OscarPackage#getOSCARThing_Msg()
	 * @model
	 * @generated
	 */
	String getMsg();

	/**
	 * Sets the value of the '{@link oscar.OSCARThing#getMsg <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' attribute.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(String value);

	/**
	 * Returns the value of the '<em><b>Msg type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg type</em>' attribute.
	 * @see #setMsg_type(String)
	 * @see oscar.OscarPackage#getOSCARThing_Msg_type()
	 * @model
	 * @generated
	 */
	String getMsg_type();

	/**
	 * Sets the value of the '{@link oscar.OSCARThing#getMsg_type <em>Msg type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg type</em>' attribute.
	 * @see #getMsg_type()
	 * @generated
	 */
	void setMsg_type(String value);

} // OSCARThing
