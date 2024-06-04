////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSignerFromUserIdInputSignatureAuthenticationModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de SignatureAuthenticationMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestSignerFromUserIdInputSignatureAuthenticationMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private SignatureRequestSignerFromUserIdInputSignatureAuthenticationModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestSignerFromUserIdInputSignatureAuthenticationMode() {
	}

	public static final SignatureRequestSignerFromUserIdInputSignatureAuthenticationMode otp_email = new SignatureRequestSignerFromUserIdInputSignatureAuthenticationMode(SignatureRequestSignerFromUserIdInputSignatureAuthenticationModeValue.otp_email);
	public static final SignatureRequestSignerFromUserIdInputSignatureAuthenticationMode otp_sms = new SignatureRequestSignerFromUserIdInputSignatureAuthenticationMode(SignatureRequestSignerFromUserIdInputSignatureAuthenticationModeValue.otp_sms);
	public static final SignatureRequestSignerFromUserIdInputSignatureAuthenticationMode no_otp = new SignatureRequestSignerFromUserIdInputSignatureAuthenticationMode(SignatureRequestSignerFromUserIdInputSignatureAuthenticationModeValue.no_otp);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestSignerFromUserIdInputSignatureAuthenticationMode(SignatureRequestSignerFromUserIdInputSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromUserIdInputSignatureAuthenticationMode#Value Value}.
	 */
	public SignatureRequestSignerFromUserIdInputSignatureAuthenticationModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromUserIdInputSignatureAuthenticationMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestSignerFromUserIdInputSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}
}
