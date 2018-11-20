/**
 */
package oscar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OSCAR Link Router Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see oscar.OscarPackage#getOSCARLinkRouterKind()
 * @model
 * @generated
 */
public enum OSCARLinkRouterKind implements Enumerator {
	/**
	 * The '<em><b>BENDPOINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BENDPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	BENDPOINT(0, "BENDPOINT", "BENDPOINT"),

	/**
	 * The '<em><b>MANHATTAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANHATTAN_VALUE
	 * @generated
	 * @ordered
	 */
	MANHATTAN(1, "MANHATTAN", "MANHATTAN");

	/**
	 * The '<em><b>BENDPOINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BENDPOINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BENDPOINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BENDPOINT_VALUE = 0;

	/**
	 * The '<em><b>MANHATTAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANHATTAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANHATTAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANHATTAN_VALUE = 1;

	/**
	 * An array of all the '<em><b>OSCAR Link Router Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OSCARLinkRouterKind[] VALUES_ARRAY =
		new OSCARLinkRouterKind[] {
			BENDPOINT,
			MANHATTAN,
		};

	/**
	 * A public read-only list of all the '<em><b>OSCAR Link Router Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OSCARLinkRouterKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OSCAR Link Router Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OSCARLinkRouterKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OSCARLinkRouterKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OSCAR Link Router Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OSCARLinkRouterKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OSCARLinkRouterKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OSCAR Link Router Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OSCARLinkRouterKind get(int value) {
		switch (value) {
			case BENDPOINT_VALUE: return BENDPOINT;
			case MANHATTAN_VALUE: return MANHATTAN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OSCARLinkRouterKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OSCARLinkRouterKind
