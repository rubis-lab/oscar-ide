/**
 */
package oscar;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSCAR Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oscar.OSCARNode#getPublishMSG <em>Publish MSG</em>}</li>
 *   <li>{@link oscar.OSCARNode#getSubscribeMSG <em>Subscribe MSG</em>}</li>
 *   <li>{@link oscar.OSCARNode#getContainer <em>Container</em>}</li>
 *   <li>{@link oscar.OSCARNode#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see oscar.OscarPackage#getOSCARNode()
 * @model
 * @generated
 */
public interface OSCARNode extends OSCARContainer {
	/**
	 * Returns the value of the '<em><b>Publish MSG</b></em>' reference list.
	 * The list contents are of type {@link oscar.OSCARLink}.
	 * It is bidirectional and its opposite is '{@link oscar.OSCARLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish MSG</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish MSG</em>' reference list.
	 * @see oscar.OscarPackage#getOSCARNode_PublishMSG()
	 * @see oscar.OSCARLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<OSCARLink> getPublishMSG();

	/**
	 * Returns the value of the '<em><b>Subscribe MSG</b></em>' reference list.
	 * The list contents are of type {@link oscar.OSCARLink}.
	 * It is bidirectional and its opposite is '{@link oscar.OSCARLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribe MSG</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe MSG</em>' reference list.
	 * @see oscar.OscarPackage#getOSCARNode_SubscribeMSG()
	 * @see oscar.OSCARLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<OSCARLink> getSubscribeMSG();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link oscar.OSCARContainer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(OSCARContainer)
	 * @see oscar.OscarPackage#getOSCARNode_Container()
	 * @see oscar.OSCARContainer#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	OSCARContainer getContainer();

	/**
	 * Sets the value of the '{@link oscar.OSCARNode#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(OSCARContainer value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see oscar.OscarPackage#getOSCARNode_Constraints()
	 * @model dataType="oscar.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link oscar.OSCARNode#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<OSCARLink> getPublish();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<OSCARLink> getSubscribe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	OSCARObjectProcessDiagram getOpd();

} // OSCARNode
