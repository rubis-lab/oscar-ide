/**
 */
package oscar.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import oscar.OSCARContainer;
import oscar.OSCARLink;
import oscar.OSCARNode;
import oscar.OSCARObjectProcessDiagram;
import oscar.OscarPackage;
import oscar.OscarFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSCAR Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oscar.impl.OSCARNodeImpl#getPublishMSG <em>Publish MSG</em>}</li>
 *   <li>{@link oscar.impl.OSCARNodeImpl#getSubscribeMSG <em>Subscribe MSG</em>}</li>
 *   <li>{@link oscar.impl.OSCARNodeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link oscar.impl.OSCARNodeImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OSCARNodeImpl extends OSCARContainerImpl implements OSCARNode {
	/**
	 * The cached value of the '{@link #getPublishMSG() <em>Publish MSG</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishMSG()
	 * @generated
	 * @ordered
	 */
	protected EList<OSCARLink> publishMSG;

	/**
	 * The cached value of the '{@link #getSubscribeMSG() <em>Subscribe MSG</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribeMSG()
	 * @generated
	 * @ordered
	 */
	protected EList<OSCARLink> subscribeMSG;

	/**
	 * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle CONSTRAINTS_EDEFAULT = (Rectangle)OscarFactory.eINSTANCE.createFromString(OscarPackage.eINSTANCE.getRectangle(), "0,0,150,75");
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected Rectangle constraints = CONSTRAINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSCARNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscarPackage.Literals.OSCAR_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OSCARLink> getPublishMSG() {
		if (publishMSG == null) {
			publishMSG = new EObjectWithInverseResolvingEList<OSCARLink>(OSCARLink.class, this, OscarPackage.OSCAR_NODE__PUBLISH_MSG, OscarPackage.OSCAR_LINK__SOURCE);
		}
		return publishMSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OSCARLink> getSubscribeMSG() {
		if (subscribeMSG == null) {
			subscribeMSG = new EObjectWithInverseResolvingEList<OSCARLink>(OSCARLink.class, this, OscarPackage.OSCAR_NODE__SUBSCRIBE_MSG, OscarPackage.OSCAR_LINK__TARGET);
		}
		return subscribeMSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARContainer getContainer() {
		if (eContainerFeatureID() != OscarPackage.OSCAR_NODE__CONTAINER) return null;
		return (OSCARContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(OSCARContainer newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, OscarPackage.OSCAR_NODE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(OSCARContainer newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != OscarPackage.OSCAR_NODE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, OscarPackage.OSCAR_CONTAINER__NODES, OSCARContainer.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscarPackage.OSCAR_NODE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(Rectangle newConstraints) {
		Rectangle oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscarPackage.OSCAR_NODE__CONSTRAINTS, oldConstraints, constraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OSCARLink> getPublish() {
	
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OSCARLink> getSubscribe() {
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARObjectProcessDiagram getOpd() {
		
		 OSCARContainer currentContainer = getContainer();
	     while(!(currentContainer instanceof OSCARObjectProcessDiagram)) {
	            // the container must be a node.
	            OSCARNode containerNode = (OSCARNode) getContainer();
	            currentContainer = containerNode.getContainer();
	        }

	        return (OSCARObjectProcessDiagram) currentContainer;// TODO: implement this method
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OscarPackage.OSCAR_NODE__PUBLISH_MSG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPublishMSG()).basicAdd(otherEnd, msgs);
			case OscarPackage.OSCAR_NODE__SUBSCRIBE_MSG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubscribeMSG()).basicAdd(otherEnd, msgs);
			case OscarPackage.OSCAR_NODE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((OSCARContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OscarPackage.OSCAR_NODE__PUBLISH_MSG:
				return ((InternalEList<?>)getPublishMSG()).basicRemove(otherEnd, msgs);
			case OscarPackage.OSCAR_NODE__SUBSCRIBE_MSG:
				return ((InternalEList<?>)getSubscribeMSG()).basicRemove(otherEnd, msgs);
			case OscarPackage.OSCAR_NODE__CONTAINER:
				return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OscarPackage.OSCAR_NODE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, OscarPackage.OSCAR_CONTAINER__NODES, OSCARContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OscarPackage.OSCAR_NODE__PUBLISH_MSG:
				return getPublishMSG();
			case OscarPackage.OSCAR_NODE__SUBSCRIBE_MSG:
				return getSubscribeMSG();
			case OscarPackage.OSCAR_NODE__CONTAINER:
				return getContainer();
			case OscarPackage.OSCAR_NODE__CONSTRAINTS:
				return getConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OscarPackage.OSCAR_NODE__PUBLISH_MSG:
				getPublishMSG().clear();
				getPublishMSG().addAll((Collection<? extends OSCARLink>)newValue);
				return;
			case OscarPackage.OSCAR_NODE__SUBSCRIBE_MSG:
				getSubscribeMSG().clear();
				getSubscribeMSG().addAll((Collection<? extends OSCARLink>)newValue);
				return;
			case OscarPackage.OSCAR_NODE__CONTAINER:
				setContainer((OSCARContainer)newValue);
				return;
			case OscarPackage.OSCAR_NODE__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
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
			case OscarPackage.OSCAR_NODE__PUBLISH_MSG:
				getPublishMSG().clear();
				return;
			case OscarPackage.OSCAR_NODE__SUBSCRIBE_MSG:
				getSubscribeMSG().clear();
				return;
			case OscarPackage.OSCAR_NODE__CONTAINER:
				setContainer((OSCARContainer)null);
				return;
			case OscarPackage.OSCAR_NODE__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
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
			case OscarPackage.OSCAR_NODE__PUBLISH_MSG:
				return publishMSG != null && !publishMSG.isEmpty();
			case OscarPackage.OSCAR_NODE__SUBSCRIBE_MSG:
				return subscribeMSG != null && !subscribeMSG.isEmpty();
			case OscarPackage.OSCAR_NODE__CONTAINER:
				return getContainer() != null;
			case OscarPackage.OSCAR_NODE__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OscarPackage.OSCAR_NODE___GET_PUBLISH:
				return getPublish();
			case OscarPackage.OSCAR_NODE___GET_SUBSCRIBE:
				return getSubscribe();
			case OscarPackage.OSCAR_NODE___GET_OPD:
				return getOpd();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (constraints: ");
		result.append(constraints);
		result.append(')');
		return result.toString();
	}

} //OSCARNodeImpl
