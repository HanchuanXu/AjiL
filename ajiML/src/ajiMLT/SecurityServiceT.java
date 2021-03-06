/**
 */
package ajiMLT;

import ajiML.SecurityService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Service T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiMLT.SecurityServiceT#getCertificatePath <em>Certificate Path</em>}</li>
 *   <li>{@link ajiMLT.SecurityServiceT#getCertificatePassword <em>Certificate Password</em>}</li>
 *   <li>{@link ajiMLT.SecurityServiceT#getKeyPairName <em>Key Pair Name</em>}</li>
 *   <li>{@link ajiMLT.SecurityServiceT#getPublicKey <em>Public Key</em>}</li>
 * </ul>
 *
 * @see ajiMLT.AjiMLTPackage#getSecurityServiceT()
 * @model
 * @generated
 */
public interface SecurityServiceT extends SecurityService, GeneratorDescriptor {
	/**
	 * Returns the value of the '<em><b>Certificate Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Path</em>' attribute.
	 * @see #setCertificatePath(String)
	 * @see ajiMLT.AjiMLTPackage#getSecurityServiceT_CertificatePath()
	 * @model
	 * @generated
	 */
	String getCertificatePath();

	/**
	 * Sets the value of the '{@link ajiMLT.SecurityServiceT#getCertificatePath <em>Certificate Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Path</em>' attribute.
	 * @see #getCertificatePath()
	 * @generated
	 */
	void setCertificatePath(String value);

	/**
	 * Returns the value of the '<em><b>Certificate Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Password</em>' attribute.
	 * @see #setCertificatePassword(String)
	 * @see ajiMLT.AjiMLTPackage#getSecurityServiceT_CertificatePassword()
	 * @model
	 * @generated
	 */
	String getCertificatePassword();

	/**
	 * Sets the value of the '{@link ajiMLT.SecurityServiceT#getCertificatePassword <em>Certificate Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Password</em>' attribute.
	 * @see #getCertificatePassword()
	 * @generated
	 */
	void setCertificatePassword(String value);

	/**
	 * Returns the value of the '<em><b>Key Pair Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Pair Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Pair Name</em>' attribute.
	 * @see #setKeyPairName(String)
	 * @see ajiMLT.AjiMLTPackage#getSecurityServiceT_KeyPairName()
	 * @model
	 * @generated
	 */
	String getKeyPairName();

	/**
	 * Sets the value of the '{@link ajiMLT.SecurityServiceT#getKeyPairName <em>Key Pair Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Pair Name</em>' attribute.
	 * @see #getKeyPairName()
	 * @generated
	 */
	void setKeyPairName(String value);

	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Key</em>' attribute.
	 * @see #setPublicKey(String)
	 * @see ajiMLT.AjiMLTPackage#getSecurityServiceT_PublicKey()
	 * @model
	 * @generated
	 */
	String getPublicKey();

	/**
	 * Sets the value of the '{@link ajiMLT.SecurityServiceT#getPublicKey <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key</em>' attribute.
	 * @see #getPublicKey()
	 * @generated
	 */
	void setPublicKey(String value);

} // SecurityServiceT
