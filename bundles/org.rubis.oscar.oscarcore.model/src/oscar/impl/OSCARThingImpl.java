/**
 */
package oscar.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import oscar.OSCARThing;
import oscar.OscarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSCAR Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oscar.impl.OSCARThingImpl#getName <em>Name</em>}</li>
 *   <li>{@link oscar.impl.OSCARThingImpl#getMsg <em>Msg</em>}</li>
 *   <li>{@link oscar.impl.OSCARThingImpl#getMsg_type <em>Msg type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OSCARThingImpl extends OSCARNodeImpl implements OSCARThing {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMsg() <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsg()
	 * @generated
	 * @ordered
	 */
	protected static final String MSG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMsg() <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsg()
	 * @generated
	 * @ordered
	 */
	protected String msg = MSG_EDEFAULT;

	/**
	 * The default value of the '{@link #getMsg_type() <em>Msg type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsg_type()
	 * @generated
	 * @ordered
	 */
	protected static final String MSG_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMsg_type() <em>Msg type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsg_type()
	 * @generated
	 * @ordered
	 */
	protected String msg_type = MSG_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSCARThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscarPackage.Literals.OSCAR_THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscarPackage.OSCAR_THING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsg(String newMsg) {
		String oldMsg = msg;
		msg = newMsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscarPackage.OSCAR_THING__MSG, oldMsg, msg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMsg_type() {
		return msg_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsg_type(String newMsg_type) {
		String oldMsg_type = msg_type;
		msg_type = newMsg_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscarPackage.OSCAR_THING__MSG_TYPE, oldMsg_type, msg_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OscarPackage.OSCAR_THING__NAME:
				return getName();
			case OscarPackage.OSCAR_THING__MSG:
				return getMsg();
			case OscarPackage.OSCAR_THING__MSG_TYPE:
				return getMsg_type();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OscarPackage.OSCAR_THING__NAME:
				setName((String)newValue);
				return;
			case OscarPackage.OSCAR_THING__MSG:
				setMsg((String)newValue);
				return;
			case OscarPackage.OSCAR_THING__MSG_TYPE:
				setMsg_type((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OscarPackage.OSCAR_THING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OscarPackage.OSCAR_THING__MSG:
				setMsg(MSG_EDEFAULT);
				return;
			case OscarPackage.OSCAR_THING__MSG_TYPE:
				setMsg_type(MSG_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OscarPackage.OSCAR_THING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OscarPackage.OSCAR_THING__MSG:
				return MSG_EDEFAULT == null ? msg != null : !MSG_EDEFAULT.equals(msg);
			case OscarPackage.OSCAR_THING__MSG_TYPE:
				return MSG_TYPE_EDEFAULT == null ? msg_type != null : !MSG_TYPE_EDEFAULT.equals(msg_type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", msg: ");
		result.append(msg);
		result.append(", msg_type: ");
		result.append(msg_type);
		result.append(')');
		return result.toString();
	}

} //OSCARThingImpl
