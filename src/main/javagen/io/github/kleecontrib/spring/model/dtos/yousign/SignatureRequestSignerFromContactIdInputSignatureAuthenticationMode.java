////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSignerFromContactIdInputSignatureAuthenticationModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de SignatureAuthenticationMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private SignatureRequestSignerFromContactIdInputSignatureAuthenticationModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode() {
	}

	public static final SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode otp_email = new SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode(SignatureRequestSignerFromContactIdInputSignatureAuthenticationModeValue.otp_email);
	public static final SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode otp_sms = new SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode(SignatureRequestSignerFromContactIdInputSignatureAuthenticationModeValue.otp_sms);
	public static final SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode no_otp = new SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode(SignatureRequestSignerFromContactIdInputSignatureAuthenticationModeValue.no_otp);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode(SignatureRequestSignerFromContactIdInputSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode#Value Value}.
	 */
	public SignatureRequestSignerFromContactIdInputSignatureAuthenticationModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestSignerFromContactIdInputSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}
}
