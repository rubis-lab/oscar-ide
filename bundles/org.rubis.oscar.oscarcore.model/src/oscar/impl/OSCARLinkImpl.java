/**
 */
package oscar.impl;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import oscar.OSCARLink;
import oscar.OSCARLinkRouterKind;
import oscar.OSCARNode;
import oscar.OSCARObjectProcessDiagram;
import oscar.OscarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSCAR Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oscar.impl.OSCARLinkImpl#getOpd <em>Opd</em>}</li>
 *   <li>{@link oscar.impl.OSCARLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link oscar.impl.OSCARLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link oscar.impl.OSCARLinkImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link oscar.impl.OSCARLinkImpl#getRouterKind <em>Router Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OSCARLinkImpl extends MinimalEObjectImpl.Container implements OSCARLink {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OSCARNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected OSCARNode target;

	/**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> bendpoints;

	/**
	 * The default value of the '{@link #getRouterKind() <em>Router Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterKind()
	 * @generated
	 * @ordered
	 */
	protected static final OSCARLinkRouterKind ROUTER_KIND_EDEFAULT = OSCARLinkRouterKind.BENDPOINT;

	/**
	 * The cached value of the '{@link #getRouterKind() <em>Router Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterKind()
	 * @generated
	 * @ordered
	 */
	protected OSCARLinkRouterKind routerKind = ROUTER_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSCARLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscarPackage.Literals.OSCAR_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARObjectProcessDiagram getOpd() {
		if (eContainerFeatureID() != OscarPackage.OSCAR_LINK__OPD) return null;
		return (OSCARObjectProcessDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpd(OSCARObjectProcessDiagram newOpd, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOpd, OscarPackage.OSCAR_LINK__OPD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpd(OSCARObjectProcessDiagram newOpd) {
		if (newOpd != eInternalContainer() || (eContainerFeatureID() != OscarPackage.OSCAR_LINK__OPD && newOpd != null)) {
			if (EcoreUtil.isAncestor(this, newOpd))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOpd != null)
				msgs = ((InternalEObject)newOpd).eInverseAdd(this, OscarPackage.OSCAR_OBJECT_PROCESS_DIAGRAM__LINKS, OSCARObjectProcessDiagram.class, msgs);
			msgs = basicSetOpd(newOpd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscarPackage.OSCAR_LINK__OPD, newOpd, newOpd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (OSCARNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OscarPackage.OSCAR_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(OSCARNode newSource, NotificationChain msgs) {
		OSCARNode oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscarPackage.OSCAR_LINK__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OSCARNode newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, OscarPackage.OSCAR_NODE__PUBLISH_MSG, OSCARNode.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, OscarPackage.OSCAR_NODE__PUBLISH_MSG, OSCARNode.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscarPackage.OSCAR_LINK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (OSCARNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OscarPackage.OSCAR_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(OSCARNode newTarget, NotificationChain msgs) {
		OSCARNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscarPackage.OSCAR_LINK__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(OSCARNode newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, OscarPackage.OSCAR_NODE__SUBSCRIBE_MSG, OSCARNode.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, OscarPackage.OSCAR_NODE__SUBSCRIBE_MSG, OSCARNode.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscarPackage.OSCAR_LINK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getBendpoints() {
		if (bendpoints == null) {
			bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, OscarPackage.OSCAR_LINK__BENDPOINTS);
		}
		return bendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARLinkRouterKind getRouterKind() {
		return routerKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouterKind(OSCARLinkRouterKind newRouterKind) {
		OSCARLinkRouterKind oldRouterKind = routerKind;
		routerKind = newRouterKind == null ? ROUTER_KIND_EDEFAULT : newRouterKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscarPackage.OSCAR_LINK__ROUTER_KIND, oldRouterKind, routerKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OscarPackage.OSCAR_LINK__OPD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOpd((OSCARObjectProcessDiagram)otherEnd, msgs);
			case OscarPackage.OSCAR_LINK__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, OscarPackage.OSCAR_NODE__PUBLISH_MSG, OSCARNode.class, msgs);
				return basicSetSource((OSCARNode)otherEnd, msgs);
			case OscarPackage.OSCAR_LINK__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, OscarPackage.OSCAR_NODE__SUBSCRIBE_MSG, OSCARNode.class, msgs);
				return basicSetTarget((OSCARNode)otherEnd, msgs);
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
			case OscarPackage.OSCAR_LINK__OPD:
				return basicSetOpd(null, msgs);
			case OscarPackage.OSCAR_LINK__SOURCE:
				return basicSetSource(null, msgs);
			case OscarPackage.OSCAR_LINK__TARGET:
				return basicSetTarget(null, msgs);
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
			case OscarPackage.OSCAR_LINK__OPD:
				return eInternalContainer().eInverseRemove(this, OscarPackage.OSCAR_OBJECT_PROCESS_DIAGRAM__LINKS, OSCARObjectProcessDiagram.class, msgs);
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
			case OscarPackage.OSCAR_LINK__OPD:
				return getOpd();
			case OscarPackage.OSCAR_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OscarPackage.OSCAR_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case OscarPackage.OSCAR_LINK__BENDPOINTS:
				return getBendpoints();
			case OscarPackage.OSCAR_LINK__ROUTER_KIND:
				return getRouterKind();
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
			case OscarPackage.OSCAR_LINK__OPD:
				setOpd((OSCARObjectProcessDiagram)newValue);
				return;
			case OscarPackage.OSCAR_LINK__SOURCE:
				setSource((OSCARNode)newValue);
				return;
			case OscarPackage.OSCAR_LINK__TARGET:
				setTarget((OSCARNode)newValue);
				return;
			case OscarPackage.OSCAR_LINK__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection<? extends Point>)newValue);
				return;
			case OscarPackage.OSCAR_LINK__ROUTER_KIND:
				setRouterKind((OSCARLinkRouterKind)newValue);
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
			case OscarPackage.OSCAR_LINK__OPD:
				setOpd((OSCARObjectProcessDiagram)null);
				return;
			case OscarPackage.OSCAR_LINK__SOURCE:
				setSource((OSCARNode)null);
				return;
			case OscarPackage.OSCAR_LINK__TARGET:
				setTarget((OSCARNode)null);
				return;
			case OscarPackage.OSCAR_LINK__BENDPOINTS:
				getBendpoints().clear();
				return;
			case OscarPackage.OSCAR_LINK__ROUTER_KIND:
				setRouterKind(ROUTER_KIND_EDEFAULT);
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
			case OscarPackage.OSCAR_LINK__OPD:
				return getOpd() != null;
			case OscarPackage.OSCAR_LINK__SOURCE:
				return source != null;
			case OscarPackage.OSCAR_LINK__TARGET:
				return target != null;
			case OscarPackage.OSCAR_LINK__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
			case OscarPackage.OSCAR_LINK__ROUTER_KIND:
				return routerKind != ROUTER_KIND_EDEFAULT;
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
		result.append(" (bendpoints: ");
		result.append(bendpoints);
		result.append(", routerKind: ");
		result.append(routerKind);
		result.append(')');
		return result.toString();
	}

} //OSCARLinkImpl
