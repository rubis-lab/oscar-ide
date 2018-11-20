/**
 */
package oscar.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import oscar.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see oscar.OscarPackage
 * @generated
 */
public class OscarSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OscarPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscarSwitch() {
		if (modelPackage == null) {
			modelPackage = OscarPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OscarPackage.OSCAR_CONTAINER: {
				OSCARContainer oscarContainer = (OSCARContainer)theEObject;
				T result = caseOSCARContainer(oscarContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscarPackage.OSCAR_OBJECT_PROCESS_DIAGRAM: {
				OSCARObjectProcessDiagram oscarObjectProcessDiagram = (OSCARObjectProcessDiagram)theEObject;
				T result = caseOSCARObjectProcessDiagram(oscarObjectProcessDiagram);
				if (result == null) result = caseOSCARContainer(oscarObjectProcessDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscarPackage.OSCAR_NODE: {
				OSCARNode oscarNode = (OSCARNode)theEObject;
				T result = caseOSCARNode(oscarNode);
				if (result == null) result = caseOSCARContainer(oscarNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscarPackage.OSCAR_THING: {
				OSCARThing oscarThing = (OSCARThing)theEObject;
				T result = caseOSCARThing(oscarThing);
				if (result == null) result = caseOSCARNode(oscarThing);
				if (result == null) result = caseOSCARContainer(oscarThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscarPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseOSCARThing(node);
				if (result == null) result = caseOSCARNode(node);
				if (result == null) result = caseOSCARContainer(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscarPackage.TOPIC: {
				Topic topic = (Topic)theEObject;
				T result = caseTopic(topic);
				if (result == null) result = caseOSCARThing(topic);
				if (result == null) result = caseOSCARNode(topic);
				if (result == null) result = caseOSCARContainer(topic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscarPackage.OSCAR_LINK: {
				OSCARLink oscarLink = (OSCARLink)theEObject;
				T result = caseOSCARLink(oscarLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscarPackage.OSCAR_PROCEDURAL_LINK: {
				OSCARProceduralLink oscarProceduralLink = (OSCARProceduralLink)theEObject;
				T result = caseOSCARProceduralLink(oscarProceduralLink);
				if (result == null) result = caseOSCARLink(oscarProceduralLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSCAR Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSCAR Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSCARContainer(OSCARContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSCAR Object Process Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSCAR Object Process Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSCARObjectProcessDiagram(OSCARObjectProcessDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSCAR Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSCAR Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSCARNode(OSCARNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSCAR Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSCAR Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSCARThing(OSCARThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopic(Topic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSCAR Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSCAR Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSCARLink(OSCARLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSCAR Procedural Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSCAR Procedural Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSCARProceduralLink(OSCARProceduralLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OscarSwitch
