/**
 */
package oscar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see oscar.OscarFactory
 * @model kind="package"
 * @generated
 */
public interface OscarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oscar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "rubis.snu.ac.kr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oscar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OscarPackage eINSTANCE = oscar.impl.OscarPackageImpl.init();

	/**
	 * The meta object id for the '{@link oscar.impl.OSCARContainerImpl <em>OSCAR Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.OSCARContainerImpl
	 * @see oscar.impl.OscarPackageImpl#getOSCARContainer()
	 * @generated
	 */
	int OSCAR_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_CONTAINER__NODES = 0;

	/**
	 * The number of structural features of the '<em>OSCAR Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OSCAR Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oscar.impl.OSCARObjectProcessDiagramImpl <em>OSCAR Object Process Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.OSCARObjectProcessDiagramImpl
	 * @see oscar.impl.OscarPackageImpl#getOSCARObjectProcessDiagram()
	 * @generated
	 */
	int OSCAR_OBJECT_PROCESS_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_OBJECT_PROCESS_DIAGRAM__NODES = OSCAR_CONTAINER__NODES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_OBJECT_PROCESS_DIAGRAM__LINKS = OSCAR_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OSCAR Object Process Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_OBJECT_PROCESS_DIAGRAM_FEATURE_COUNT = OSCAR_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OSCAR Object Process Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_OBJECT_PROCESS_DIAGRAM_OPERATION_COUNT = OSCAR_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oscar.impl.OSCARNodeImpl <em>OSCAR Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.OSCARNodeImpl
	 * @see oscar.impl.OscarPackageImpl#getOSCARNode()
	 * @generated
	 */
	int OSCAR_NODE = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_NODE__NODES = OSCAR_CONTAINER__NODES;

	/**
	 * The feature id for the '<em><b>Publish MSG</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_NODE__PUBLISH_MSG = OSCAR_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscribe MSG</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_NODE__SUBSCRIBE_MSG = OSCAR_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_NODE__CONTAINER = OSCAR_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_NODE__CONSTRAINTS = OSCAR_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>OSCAR Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_NODE_FEATURE_COUNT = OSCAR_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Publish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_NODE___GET_PUBLISH = OSCAR_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Subscribe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_NODE___GET_SUBSCRIBE = OSCAR_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Opd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_NODE___GET_OPD = OSCAR_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>OSCAR Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_NODE_OPERATION_COUNT = OSCAR_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link oscar.impl.OSCARThingImpl <em>OSCAR Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.OSCARThingImpl
	 * @see oscar.impl.OscarPackageImpl#getOSCARThing()
	 * @generated
	 */
	int OSCAR_THING = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING__NODES = OSCAR_NODE__NODES;

	/**
	 * The feature id for the '<em><b>Publish MSG</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING__PUBLISH_MSG = OSCAR_NODE__PUBLISH_MSG;

	/**
	 * The feature id for the '<em><b>Subscribe MSG</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING__SUBSCRIBE_MSG = OSCAR_NODE__SUBSCRIBE_MSG;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING__CONTAINER = OSCAR_NODE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING__CONSTRAINTS = OSCAR_NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING__NAME = OSCAR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING__MSG = OSCAR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Msg type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING__MSG_TYPE = OSCAR_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OSCAR Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING_FEATURE_COUNT = OSCAR_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Publish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING___GET_PUBLISH = OSCAR_NODE___GET_PUBLISH;

	/**
	 * The operation id for the '<em>Get Subscribe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING___GET_SUBSCRIBE = OSCAR_NODE___GET_SUBSCRIBE;

	/**
	 * The operation id for the '<em>Get Opd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING___GET_OPD = OSCAR_NODE___GET_OPD;

	/**
	 * The number of operations of the '<em>OSCAR Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_THING_OPERATION_COUNT = OSCAR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oscar.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.NodeImpl
	 * @see oscar.impl.OscarPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODES = OSCAR_THING__NODES;

	/**
	 * The feature id for the '<em><b>Publish MSG</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PUBLISH_MSG = OSCAR_THING__PUBLISH_MSG;

	/**
	 * The feature id for the '<em><b>Subscribe MSG</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUBSCRIBE_MSG = OSCAR_THING__SUBSCRIBE_MSG;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTAINER = OSCAR_THING__CONTAINER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONSTRAINTS = OSCAR_THING__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = OSCAR_THING__NAME;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MSG = OSCAR_THING__MSG;

	/**
	 * The feature id for the '<em><b>Msg type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MSG_TYPE = OSCAR_THING__MSG_TYPE;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = OSCAR_THING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Publish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_PUBLISH = OSCAR_THING___GET_PUBLISH;

	/**
	 * The operation id for the '<em>Get Subscribe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_SUBSCRIBE = OSCAR_THING___GET_SUBSCRIBE;

	/**
	 * The operation id for the '<em>Get Opd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_OPD = OSCAR_THING___GET_OPD;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = OSCAR_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oscar.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.TopicImpl
	 * @see oscar.impl.OscarPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 5;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NODES = OSCAR_THING__NODES;

	/**
	 * The feature id for the '<em><b>Publish MSG</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__PUBLISH_MSG = OSCAR_THING__PUBLISH_MSG;

	/**
	 * The feature id for the '<em><b>Subscribe MSG</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__SUBSCRIBE_MSG = OSCAR_THING__SUBSCRIBE_MSG;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__CONTAINER = OSCAR_THING__CONTAINER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__CONSTRAINTS = OSCAR_THING__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = OSCAR_THING__NAME;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__MSG = OSCAR_THING__MSG;

	/**
	 * The feature id for the '<em><b>Msg type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__MSG_TYPE = OSCAR_THING__MSG_TYPE;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = OSCAR_THING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Publish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC___GET_PUBLISH = OSCAR_THING___GET_PUBLISH;

	/**
	 * The operation id for the '<em>Get Subscribe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC___GET_SUBSCRIBE = OSCAR_THING___GET_SUBSCRIBE;

	/**
	 * The operation id for the '<em>Get Opd</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC___GET_OPD = OSCAR_THING___GET_OPD;

	/**
	 * The number of operations of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = OSCAR_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oscar.impl.OSCARLinkImpl <em>OSCAR Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.OSCARLinkImpl
	 * @see oscar.impl.OscarPackageImpl#getOSCARLink()
	 * @generated
	 */
	int OSCAR_LINK = 6;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_LINK__OPD = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_LINK__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_LINK__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_LINK__BENDPOINTS = 3;

	/**
	 * The feature id for the '<em><b>Router Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_LINK__ROUTER_KIND = 4;

	/**
	 * The number of structural features of the '<em>OSCAR Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>OSCAR Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oscar.impl.OSCARProceduralLinkImpl <em>OSCAR Procedural Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.impl.OSCARProceduralLinkImpl
	 * @see oscar.impl.OscarPackageImpl#getOSCARProceduralLink()
	 * @generated
	 */
	int OSCAR_PROCEDURAL_LINK = 7;

	/**
	 * The feature id for the '<em><b>Opd</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_PROCEDURAL_LINK__OPD = OSCAR_LINK__OPD;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_PROCEDURAL_LINK__SOURCE = OSCAR_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_PROCEDURAL_LINK__TARGET = OSCAR_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_PROCEDURAL_LINK__BENDPOINTS = OSCAR_LINK__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Router Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_PROCEDURAL_LINK__ROUTER_KIND = OSCAR_LINK__ROUTER_KIND;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_PROCEDURAL_LINK__KIND = OSCAR_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OSCAR Procedural Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_PROCEDURAL_LINK_FEATURE_COUNT = OSCAR_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OSCAR Procedural Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAR_PROCEDURAL_LINK_OPERATION_COUNT = OSCAR_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link oscar.OSCARProceduralLinkKind <em>OSCAR Procedural Link Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.OSCARProceduralLinkKind
	 * @see oscar.impl.OscarPackageImpl#getOSCARProceduralLinkKind()
	 * @generated
	 */
	int OSCAR_PROCEDURAL_LINK_KIND = 8;

	/**
	 * The meta object id for the '{@link oscar.OSCARLinkRouterKind <em>OSCAR Link Router Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oscar.OSCARLinkRouterKind
	 * @see oscar.impl.OscarPackageImpl#getOSCARLinkRouterKind()
	 * @generated
	 */
	int OSCAR_LINK_ROUTER_KIND = 9;

	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see oscar.impl.OscarPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 10;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see oscar.impl.OscarPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 11;


	/**
	 * Returns the meta object for class '{@link oscar.OSCARContainer <em>OSCAR Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSCAR Container</em>'.
	 * @see oscar.OSCARContainer
	 * @generated
	 */
	EClass getOSCARContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link oscar.OSCARContainer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see oscar.OSCARContainer#getNodes()
	 * @see #getOSCARContainer()
	 * @generated
	 */
	EReference getOSCARContainer_Nodes();

	/**
	 * Returns the meta object for class '{@link oscar.OSCARObjectProcessDiagram <em>OSCAR Object Process Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSCAR Object Process Diagram</em>'.
	 * @see oscar.OSCARObjectProcessDiagram
	 * @generated
	 */
	EClass getOSCARObjectProcessDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link oscar.OSCARObjectProcessDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see oscar.OSCARObjectProcessDiagram#getLinks()
	 * @see #getOSCARObjectProcessDiagram()
	 * @generated
	 */
	EReference getOSCARObjectProcessDiagram_Links();

	/**
	 * Returns the meta object for class '{@link oscar.OSCARNode <em>OSCAR Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSCAR Node</em>'.
	 * @see oscar.OSCARNode
	 * @generated
	 */
	EClass getOSCARNode();

	/**
	 * Returns the meta object for the reference list '{@link oscar.OSCARNode#getPublishMSG <em>Publish MSG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publish MSG</em>'.
	 * @see oscar.OSCARNode#getPublishMSG()
	 * @see #getOSCARNode()
	 * @generated
	 */
	EReference getOSCARNode_PublishMSG();

	/**
	 * Returns the meta object for the reference list '{@link oscar.OSCARNode#getSubscribeMSG <em>Subscribe MSG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscribe MSG</em>'.
	 * @see oscar.OSCARNode#getSubscribeMSG()
	 * @see #getOSCARNode()
	 * @generated
	 */
	EReference getOSCARNode_SubscribeMSG();

	/**
	 * Returns the meta object for the container reference '{@link oscar.OSCARNode#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see oscar.OSCARNode#getContainer()
	 * @see #getOSCARNode()
	 * @generated
	 */
	EReference getOSCARNode_Container();

	/**
	 * Returns the meta object for the attribute '{@link oscar.OSCARNode#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see oscar.OSCARNode#getConstraints()
	 * @see #getOSCARNode()
	 * @generated
	 */
	EAttribute getOSCARNode_Constraints();

	/**
	 * Returns the meta object for the '{@link oscar.OSCARNode#getPublish() <em>Get Publish</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Publish</em>' operation.
	 * @see oscar.OSCARNode#getPublish()
	 * @generated
	 */
	EOperation getOSCARNode__GetPublish();

	/**
	 * Returns the meta object for the '{@link oscar.OSCARNode#getSubscribe() <em>Get Subscribe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Subscribe</em>' operation.
	 * @see oscar.OSCARNode#getSubscribe()
	 * @generated
	 */
	EOperation getOSCARNode__GetSubscribe();

	/**
	 * Returns the meta object for the '{@link oscar.OSCARNode#getOpd() <em>Get Opd</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Opd</em>' operation.
	 * @see oscar.OSCARNode#getOpd()
	 * @generated
	 */
	EOperation getOSCARNode__GetOpd();

	/**
	 * Returns the meta object for class '{@link oscar.OSCARThing <em>OSCAR Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSCAR Thing</em>'.
	 * @see oscar.OSCARThing
	 * @generated
	 */
	EClass getOSCARThing();

	/**
	 * Returns the meta object for the attribute '{@link oscar.OSCARThing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see oscar.OSCARThing#getName()
	 * @see #getOSCARThing()
	 * @generated
	 */
	EAttribute getOSCARThing_Name();

	/**
	 * Returns the meta object for the attribute '{@link oscar.OSCARThing#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg</em>'.
	 * @see oscar.OSCARThing#getMsg()
	 * @see #getOSCARThing()
	 * @generated
	 */
	EAttribute getOSCARThing_Msg();

	/**
	 * Returns the meta object for the attribute '{@link oscar.OSCARThing#getMsg_type <em>Msg type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg type</em>'.
	 * @see oscar.OSCARThing#getMsg_type()
	 * @see #getOSCARThing()
	 * @generated
	 */
	EAttribute getOSCARThing_Msg_type();

	/**
	 * Returns the meta object for class '{@link oscar.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see oscar.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link oscar.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see oscar.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for class '{@link oscar.OSCARLink <em>OSCAR Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSCAR Link</em>'.
	 * @see oscar.OSCARLink
	 * @generated
	 */
	EClass getOSCARLink();

	/**
	 * Returns the meta object for the container reference '{@link oscar.OSCARLink#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Opd</em>'.
	 * @see oscar.OSCARLink#getOpd()
	 * @see #getOSCARLink()
	 * @generated
	 */
	EReference getOSCARLink_Opd();

	/**
	 * Returns the meta object for the reference '{@link oscar.OSCARLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see oscar.OSCARLink#getSource()
	 * @see #getOSCARLink()
	 * @generated
	 */
	EReference getOSCARLink_Source();

	/**
	 * Returns the meta object for the reference '{@link oscar.OSCARLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see oscar.OSCARLink#getTarget()
	 * @see #getOSCARLink()
	 * @generated
	 */
	EReference getOSCARLink_Target();

	/**
	 * Returns the meta object for the attribute list '{@link oscar.OSCARLink#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see oscar.OSCARLink#getBendpoints()
	 * @see #getOSCARLink()
	 * @generated
	 */
	EAttribute getOSCARLink_Bendpoints();

	/**
	 * Returns the meta object for the attribute '{@link oscar.OSCARLink#getRouterKind <em>Router Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Router Kind</em>'.
	 * @see oscar.OSCARLink#getRouterKind()
	 * @see #getOSCARLink()
	 * @generated
	 */
	EAttribute getOSCARLink_RouterKind();

	/**
	 * Returns the meta object for class '{@link oscar.OSCARProceduralLink <em>OSCAR Procedural Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSCAR Procedural Link</em>'.
	 * @see oscar.OSCARProceduralLink
	 * @generated
	 */
	EClass getOSCARProceduralLink();

	/**
	 * Returns the meta object for the attribute '{@link oscar.OSCARProceduralLink#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see oscar.OSCARProceduralLink#getKind()
	 * @see #getOSCARProceduralLink()
	 * @generated
	 */
	EAttribute getOSCARProceduralLink_Kind();

	/**
	 * Returns the meta object for enum '{@link oscar.OSCARProceduralLinkKind <em>OSCAR Procedural Link Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OSCAR Procedural Link Kind</em>'.
	 * @see oscar.OSCARProceduralLinkKind
	 * @generated
	 */
	EEnum getOSCARProceduralLinkKind();

	/**
	 * Returns the meta object for enum '{@link oscar.OSCARLinkRouterKind <em>OSCAR Link Router Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OSCAR Link Router Kind</em>'.
	 * @see oscar.OSCARLinkRouterKind
	 * @generated
	 */
	EEnum getOSCARLinkRouterKind();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	EDataType getPoint();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OscarFactory getOscarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link oscar.impl.OSCARContainerImpl <em>OSCAR Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.OSCARContainerImpl
		 * @see oscar.impl.OscarPackageImpl#getOSCARContainer()
		 * @generated
		 */
		EClass OSCAR_CONTAINER = eINSTANCE.getOSCARContainer();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSCAR_CONTAINER__NODES = eINSTANCE.getOSCARContainer_Nodes();

		/**
		 * The meta object literal for the '{@link oscar.impl.OSCARObjectProcessDiagramImpl <em>OSCAR Object Process Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.OSCARObjectProcessDiagramImpl
		 * @see oscar.impl.OscarPackageImpl#getOSCARObjectProcessDiagram()
		 * @generated
		 */
		EClass OSCAR_OBJECT_PROCESS_DIAGRAM = eINSTANCE.getOSCARObjectProcessDiagram();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSCAR_OBJECT_PROCESS_DIAGRAM__LINKS = eINSTANCE.getOSCARObjectProcessDiagram_Links();

		/**
		 * The meta object literal for the '{@link oscar.impl.OSCARNodeImpl <em>OSCAR Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.OSCARNodeImpl
		 * @see oscar.impl.OscarPackageImpl#getOSCARNode()
		 * @generated
		 */
		EClass OSCAR_NODE = eINSTANCE.getOSCARNode();

		/**
		 * The meta object literal for the '<em><b>Publish MSG</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSCAR_NODE__PUBLISH_MSG = eINSTANCE.getOSCARNode_PublishMSG();

		/**
		 * The meta object literal for the '<em><b>Subscribe MSG</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSCAR_NODE__SUBSCRIBE_MSG = eINSTANCE.getOSCARNode_SubscribeMSG();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSCAR_NODE__CONTAINER = eINSTANCE.getOSCARNode_Container();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSCAR_NODE__CONSTRAINTS = eINSTANCE.getOSCARNode_Constraints();

		/**
		 * The meta object literal for the '<em><b>Get Publish</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OSCAR_NODE___GET_PUBLISH = eINSTANCE.getOSCARNode__GetPublish();

		/**
		 * The meta object literal for the '<em><b>Get Subscribe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OSCAR_NODE___GET_SUBSCRIBE = eINSTANCE.getOSCARNode__GetSubscribe();

		/**
		 * The meta object literal for the '<em><b>Get Opd</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OSCAR_NODE___GET_OPD = eINSTANCE.getOSCARNode__GetOpd();

		/**
		 * The meta object literal for the '{@link oscar.impl.OSCARThingImpl <em>OSCAR Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.OSCARThingImpl
		 * @see oscar.impl.OscarPackageImpl#getOSCARThing()
		 * @generated
		 */
		EClass OSCAR_THING = eINSTANCE.getOSCARThing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSCAR_THING__NAME = eINSTANCE.getOSCARThing_Name();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSCAR_THING__MSG = eINSTANCE.getOSCARThing_Msg();

		/**
		 * The meta object literal for the '<em><b>Msg type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSCAR_THING__MSG_TYPE = eINSTANCE.getOSCARThing_Msg_type();

		/**
		 * The meta object literal for the '{@link oscar.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.NodeImpl
		 * @see oscar.impl.OscarPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link oscar.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.TopicImpl
		 * @see oscar.impl.OscarPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '{@link oscar.impl.OSCARLinkImpl <em>OSCAR Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.OSCARLinkImpl
		 * @see oscar.impl.OscarPackageImpl#getOSCARLink()
		 * @generated
		 */
		EClass OSCAR_LINK = eINSTANCE.getOSCARLink();

		/**
		 * The meta object literal for the '<em><b>Opd</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSCAR_LINK__OPD = eINSTANCE.getOSCARLink_Opd();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSCAR_LINK__SOURCE = eINSTANCE.getOSCARLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSCAR_LINK__TARGET = eINSTANCE.getOSCARLink_Target();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSCAR_LINK__BENDPOINTS = eINSTANCE.getOSCARLink_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Router Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSCAR_LINK__ROUTER_KIND = eINSTANCE.getOSCARLink_RouterKind();

		/**
		 * The meta object literal for the '{@link oscar.impl.OSCARProceduralLinkImpl <em>OSCAR Procedural Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.impl.OSCARProceduralLinkImpl
		 * @see oscar.impl.OscarPackageImpl#getOSCARProceduralLink()
		 * @generated
		 */
		EClass OSCAR_PROCEDURAL_LINK = eINSTANCE.getOSCARProceduralLink();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSCAR_PROCEDURAL_LINK__KIND = eINSTANCE.getOSCARProceduralLink_Kind();

		/**
		 * The meta object literal for the '{@link oscar.OSCARProceduralLinkKind <em>OSCAR Procedural Link Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.OSCARProceduralLinkKind
		 * @see oscar.impl.OscarPackageImpl#getOSCARProceduralLinkKind()
		 * @generated
		 */
		EEnum OSCAR_PROCEDURAL_LINK_KIND = eINSTANCE.getOSCARProceduralLinkKind();

		/**
		 * The meta object literal for the '{@link oscar.OSCARLinkRouterKind <em>OSCAR Link Router Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oscar.OSCARLinkRouterKind
		 * @see oscar.impl.OscarPackageImpl#getOSCARLinkRouterKind()
		 * @generated
		 */
		EEnum OSCAR_LINK_ROUTER_KIND = eINSTANCE.getOSCARLinkRouterKind();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see oscar.impl.OscarPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see oscar.impl.OscarPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

	}

} //OscarPackage
