/**
 */
package oscar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSCAR Procedural Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oscar.OSCARProceduralLink#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see oscar.OscarPackage#getOSCARProceduralLink()
 * @model
 * @generated
 */
public interface OSCARProceduralLink extends OSCARLink {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link oscar.OSCARProceduralLinkKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see oscar.OSCARProceduralLinkKind
	 * @see #setKind(OSCARProceduralLinkKind)
	 * @see oscar.OscarPackage#getOSCARProceduralLink_Kind()
	 * @model
	 * @generated
	 */
	OSCARProceduralLinkKind getKind();

	/**
	 * Sets the value of the '{@link oscar.OSCARProceduralLink#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see oscar.OSCARProceduralLinkKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(OSCARProceduralLinkKind value);

} // OSCARProceduralLink
