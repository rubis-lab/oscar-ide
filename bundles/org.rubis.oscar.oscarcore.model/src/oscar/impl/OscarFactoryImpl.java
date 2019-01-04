/**
 */
package oscar.impl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import oscar.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OscarFactoryImpl extends EFactoryImpl implements OscarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OscarFactory init() {
		try {
			OscarFactory theOscarFactory = (OscarFactory)EPackage.Registry.INSTANCE.getEFactory(OscarPackage.eNS_URI);
			if (theOscarFactory != null) {
				return theOscarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OscarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OscarPackage.OSCAR_CONTAINER: return createOSCARContainer();
			case OscarPackage.OSCAR_OBJECT_PROCESS_DIAGRAM: return createOSCARObjectProcessDiagram();
			case OscarPackage.OSCAR_NODE: return createOSCARNode();
			case OscarPackage.OSCAR_THING: return createOSCARThing();
			case OscarPackage.NODE: return createNode();
			case OscarPackage.TOPIC: return createTopic();
			case OscarPackage.OSCAR_LINK: return createOSCARLink();
			case OscarPackage.OSCAR_PROCEDURAL_LINK: return createOSCARProceduralLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OscarPackage.OSCAR_PROCEDURAL_LINK_KIND:
				return createOSCARProceduralLinkKindFromString(eDataType, initialValue);
			case OscarPackage.OSCAR_LINK_ROUTER_KIND:
				return createOSCARLinkRouterKindFromString(eDataType, initialValue);
			case OscarPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			case OscarPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OscarPackage.OSCAR_PROCEDURAL_LINK_KIND:
				return convertOSCARProceduralLinkKindToString(eDataType, instanceValue);
			case OscarPackage.OSCAR_LINK_ROUTER_KIND:
				return convertOSCARLinkRouterKindToString(eDataType, instanceValue);
			case OscarPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			case OscarPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARContainer createOSCARContainer() {
		OSCARContainerImpl oscarContainer = new OSCARContainerImpl();
		return oscarContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARObjectProcessDiagram createOSCARObjectProcessDiagram() {
		OSCARObjectProcessDiagramImpl oscarObjectProcessDiagram = new OSCARObjectProcessDiagramImpl();
		return oscarObjectProcessDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARNode createOSCARNode() {
		OSCARNodeImpl oscarNode = new OSCARNodeImpl();
		return oscarNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARThing createOSCARThing() {
		OSCARThingImpl oscarThing = new OSCARThingImpl();
		return oscarThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARLink createOSCARLink() {
		OSCARLinkImpl oscarLink = new OSCARLinkImpl();
		return oscarLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARProceduralLink createOSCARProceduralLink() {
		OSCARProceduralLinkImpl oscarProceduralLink = new OSCARProceduralLinkImpl();
		return oscarProceduralLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARProceduralLinkKind createOSCARProceduralLinkKindFromString(EDataType eDataType, String initialValue) {
		OSCARProceduralLinkKind result = OSCARProceduralLinkKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSCARProceduralLinkKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCARLinkRouterKind createOSCARLinkRouterKindFromString(EDataType eDataType, String initialValue) {
		OSCARLinkRouterKind result = OSCARLinkRouterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSCARLinkRouterKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		return (Point)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPointToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
		return (Rectangle)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRectangleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscarPackage getOscarPackage() {
		return (OscarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OscarPackage getPackage() {
		return OscarPackage.eINSTANCE;
	}

} //OscarFactoryImpl
