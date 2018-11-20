/**
 */
package oscar;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSCAR Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oscar.OSCARLink#getOpd <em>Opd</em>}</li>
 *   <li>{@link oscar.OSCARLink#getSource <em>Source</em>}</li>
 *   <li>{@link oscar.OSCARLink#getTarget <em>Target</em>}</li>
 *   <li>{@link oscar.OSCARLink#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link oscar.OSCARLink#getRouterKind <em>Router Kind</em>}</li>
 * </ul>
 *
 * @see oscar.OscarPackage#getOSCARLink()
 * @model
 * @generated
 */
public interface OSCARLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Opd</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link oscar.OSCARObjectProcessDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opd</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opd</em>' container reference.
	 * @see #setOpd(OSCARObjectProcessDiagram)
	 * @see oscar.OscarPackage#getOSCARLink_Opd()
	 * @see oscar.OSCARObjectProcessDiagram#getLinks
	 * @model opposite="links" transient="false"
	 * @generated
	 */
	OSCARObjectProcessDiagram getOpd();

	/**
	 * Sets the value of the '{@link oscar.OSCARLink#getOpd <em>Opd</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opd</em>' container reference.
	 * @see #getOpd()
	 * @generated
	 */
	void setOpd(OSCARObjectProcessDiagram value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link oscar.OSCARNode#getPublishMSG <em>Publish MSG</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OSCARNode)
	 * @see oscar.OscarPackage#getOSCARLink_Source()
	 * @see oscar.OSCARNode#getPublishMSG
	 * @model opposite="publishMSG"
	 * @generated
	 */
	OSCARNode getSource();

	/**
	 * Sets the value of the '{@link oscar.OSCARLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OSCARNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link oscar.OSCARNode#getSubscribeMSG <em>Subscribe MSG</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(OSCARNode)
	 * @see oscar.OscarPackage#getOSCARLink_Target()
	 * @see oscar.OSCARNode#getSubscribeMSG
	 * @model opposite="subscribeMSG"
	 * @generated
	 */
	OSCARNode getTarget();

	/**
	 * Sets the value of the '{@link oscar.OSCARLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(OSCARNode value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' attribute list.
	 * @see oscar.OscarPackage#getOSCARLink_Bendpoints()
	 * @model dataType="oscar.Point"
	 * @generated
	 */
	EList<Point> getBendpoints();

	/**
	 * Returns the value of the '<em><b>Router Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link oscar.OSCARLinkRouterKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router Kind</em>' attribute.
	 * @see oscar.OSCARLinkRouterKind
	 * @see #setRouterKind(OSCARLinkRouterKind)
	 * @see oscar.OscarPackage#getOSCARLink_RouterKind()
	 * @model
	 * @generated
	 */
	OSCARLinkRouterKind getRouterKind();

	/**
	 * Sets the value of the '{@link oscar.OSCARLink#getRouterKind <em>Router Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router Kind</em>' attribute.
	 * @see oscar.OSCARLinkRouterKind
	 * @see #getRouterKind()
	 * @generated
	 */
	void setRouterKind(OSCARLinkRouterKind value);

} // OSCARLink
