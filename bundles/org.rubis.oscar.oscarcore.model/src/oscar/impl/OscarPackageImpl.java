/**
 */
package oscar.impl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import oscar.Node;
import oscar.OSCARContainer;
import oscar.OSCARLink;
import oscar.OSCARLinkRouterKind;
import oscar.OSCARNode;
import oscar.OSCARObjectProcessDiagram;
import oscar.OSCARProceduralLink;
import oscar.OSCARProceduralLinkKind;
import oscar.OSCARThing;
import oscar.OscarFactory;
import oscar.OscarPackage;
import oscar.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OscarPackageImpl extends EPackageImpl implements OscarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscarContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscarObjectProcessDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscarNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscarThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscarLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscarProceduralLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oscarProceduralLinkKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oscarLinkRouterKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see oscar.OscarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OscarPackageImpl() {
		super(eNS_URI, OscarFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OscarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OscarPackage init() {
		if (isInited) return (OscarPackage)EPackage.Registry.INSTANCE.getEPackage(OscarPackage.eNS_URI);

		// Obtain or create and register package
		OscarPackageImpl theOscarPackage = (OscarPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OscarPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OscarPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOscarPackage.createPackageContents();

		// Initialize created meta-data
		theOscarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOscarPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OscarPackage.eNS_URI, theOscarPackage);
		return theOscarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSCARContainer() {
		return oscarContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSCARContainer_Nodes() {
		return (EReference)oscarContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSCARObjectProcessDiagram() {
		return oscarObjectProcessDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSCARObjectProcessDiagram_Links() {
		return (EReference)oscarObjectProcessDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSCARNode() {
		return oscarNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSCARNode_PublishMSG() {
		return (EReference)oscarNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSCARNode_SubscribeMSG() {
		return (EReference)oscarNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSCARNode_Container() {
		return (EReference)oscarNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSCARNode_Constraints() {
		return (EAttribute)oscarNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOSCARNode__GetPublish() {
		return oscarNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOSCARNode__GetSubscribe() {
		return oscarNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOSCARNode__GetOpd() {
		return oscarNodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSCARThing() {
		return oscarThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSCARThing_Name() {
		return (EAttribute)oscarThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSCARThing_Msg() {
		return (EAttribute)oscarThingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSCARThing_Msg_type() {
		return (EAttribute)oscarThingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Group() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Members() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopic() {
		return topicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSCARLink() {
		return oscarLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSCARLink_Opd() {
		return (EReference)oscarLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSCARLink_Source() {
		return (EReference)oscarLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSCARLink_Target() {
		return (EReference)oscarLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSCARLink_Bendpoints() {
		return (EAttribute)oscarLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSCARLink_RouterKind() {
		return (EAttribute)oscarLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSCARProceduralLink() {
		return oscarProceduralLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSCARProceduralLink_Kind() {
		return (EAttribute)oscarProceduralLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOSCARProceduralLinkKind() {
		return oscarProceduralLinkKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOSCARLinkRouterKind() {
		return oscarLinkRouterKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint() {
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRectangle() {
		return rectangleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscarFactory getOscarFactory() {
		return (OscarFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		oscarContainerEClass = createEClass(OSCAR_CONTAINER);
		createEReference(oscarContainerEClass, OSCAR_CONTAINER__NODES);

		oscarObjectProcessDiagramEClass = createEClass(OSCAR_OBJECT_PROCESS_DIAGRAM);
		createEReference(oscarObjectProcessDiagramEClass, OSCAR_OBJECT_PROCESS_DIAGRAM__LINKS);

		oscarNodeEClass = createEClass(OSCAR_NODE);
		createEReference(oscarNodeEClass, OSCAR_NODE__PUBLISH_MSG);
		createEReference(oscarNodeEClass, OSCAR_NODE__SUBSCRIBE_MSG);
		createEReference(oscarNodeEClass, OSCAR_NODE__CONTAINER);
		createEAttribute(oscarNodeEClass, OSCAR_NODE__CONSTRAINTS);
		createEOperation(oscarNodeEClass, OSCAR_NODE___GET_PUBLISH);
		createEOperation(oscarNodeEClass, OSCAR_NODE___GET_SUBSCRIBE);
		createEOperation(oscarNodeEClass, OSCAR_NODE___GET_OPD);

		oscarThingEClass = createEClass(OSCAR_THING);
		createEAttribute(oscarThingEClass, OSCAR_THING__NAME);
		createEAttribute(oscarThingEClass, OSCAR_THING__MSG);
		createEAttribute(oscarThingEClass, OSCAR_THING__MSG_TYPE);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__GROUP);
		createEReference(nodeEClass, NODE__MEMBERS);

		topicEClass = createEClass(TOPIC);

		oscarLinkEClass = createEClass(OSCAR_LINK);
		createEReference(oscarLinkEClass, OSCAR_LINK__OPD);
		createEReference(oscarLinkEClass, OSCAR_LINK__SOURCE);
		createEReference(oscarLinkEClass, OSCAR_LINK__TARGET);
		createEAttribute(oscarLinkEClass, OSCAR_LINK__BENDPOINTS);
		createEAttribute(oscarLinkEClass, OSCAR_LINK__ROUTER_KIND);

		oscarProceduralLinkEClass = createEClass(OSCAR_PROCEDURAL_LINK);
		createEAttribute(oscarProceduralLinkEClass, OSCAR_PROCEDURAL_LINK__KIND);

		// Create enums
		oscarProceduralLinkKindEEnum = createEEnum(OSCAR_PROCEDURAL_LINK_KIND);
		oscarLinkRouterKindEEnum = createEEnum(OSCAR_LINK_ROUTER_KIND);

		// Create data types
		pointEDataType = createEDataType(POINT);
		rectangleEDataType = createEDataType(RECTANGLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oscarObjectProcessDiagramEClass.getESuperTypes().add(this.getOSCARContainer());
		oscarNodeEClass.getESuperTypes().add(this.getOSCARContainer());
		oscarThingEClass.getESuperTypes().add(this.getOSCARNode());
		nodeEClass.getESuperTypes().add(this.getOSCARThing());
		topicEClass.getESuperTypes().add(this.getOSCARThing());
		oscarProceduralLinkEClass.getESuperTypes().add(this.getOSCARLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(oscarContainerEClass, OSCARContainer.class, "OSCARContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOSCARContainer_Nodes(), this.getOSCARNode(), this.getOSCARNode_Container(), "nodes", null, 0, -1, OSCARContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oscarObjectProcessDiagramEClass, OSCARObjectProcessDiagram.class, "OSCARObjectProcessDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOSCARObjectProcessDiagram_Links(), this.getOSCARLink(), this.getOSCARLink_Opd(), "links", null, 0, -1, OSCARObjectProcessDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oscarNodeEClass, OSCARNode.class, "OSCARNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOSCARNode_PublishMSG(), this.getOSCARLink(), this.getOSCARLink_Source(), "publishMSG", null, 0, -1, OSCARNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSCARNode_SubscribeMSG(), this.getOSCARLink(), this.getOSCARLink_Target(), "subscribeMSG", null, 0, -1, OSCARNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSCARNode_Container(), this.getOSCARContainer(), this.getOSCARContainer_Nodes(), "container", null, 0, 1, OSCARNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSCARNode_Constraints(), this.getRectangle(), "constraints", null, 0, 1, OSCARNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOSCARNode__GetPublish(), this.getOSCARLink(), "getPublish", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOSCARNode__GetSubscribe(), this.getOSCARLink(), "getSubscribe", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOSCARNode__GetOpd(), this.getOSCARObjectProcessDiagram(), "getOpd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(oscarThingEClass, OSCARThing.class, "OSCARThing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSCARThing_Name(), ecorePackage.getEString(), "name", "", 0, 1, OSCARThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSCARThing_Msg(), ecorePackage.getEString(), "msg", null, 0, 1, OSCARThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSCARThing_Msg_type(), ecorePackage.getEString(), "msg_type", null, 0, 1, OSCARThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Group(), this.getNode(), this.getNode_Members(), "group", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Members(), this.getNode(), this.getNode_Group(), "members", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicEClass, Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oscarLinkEClass, OSCARLink.class, "OSCARLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOSCARLink_Opd(), this.getOSCARObjectProcessDiagram(), this.getOSCARObjectProcessDiagram_Links(), "opd", null, 0, 1, OSCARLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSCARLink_Source(), this.getOSCARNode(), this.getOSCARNode_PublishMSG(), "source", null, 0, 1, OSCARLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSCARLink_Target(), this.getOSCARNode(), this.getOSCARNode_SubscribeMSG(), "target", null, 0, 1, OSCARLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSCARLink_Bendpoints(), this.getPoint(), "bendpoints", null, 0, -1, OSCARLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSCARLink_RouterKind(), this.getOSCARLinkRouterKind(), "routerKind", null, 0, 1, OSCARLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oscarProceduralLinkEClass, OSCARProceduralLink.class, "OSCARProceduralLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSCARProceduralLink_Kind(), this.getOSCARProceduralLinkKind(), "kind", null, 0, 1, OSCARProceduralLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(oscarProceduralLinkKindEEnum, OSCARProceduralLinkKind.class, "OSCARProceduralLinkKind");
		addEEnumLiteral(oscarProceduralLinkKindEEnum, OSCARProceduralLinkKind.PUBLISH_SUBSCRIBE);

		initEEnum(oscarLinkRouterKindEEnum, OSCARLinkRouterKind.class, "OSCARLinkRouterKind");
		addEEnumLiteral(oscarLinkRouterKindEEnum, OSCARLinkRouterKind.BENDPOINT);
		addEEnumLiteral(oscarLinkRouterKindEEnum, OSCARLinkRouterKind.MANHATTAN);

		// Initialize data types
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OscarPackageImpl
