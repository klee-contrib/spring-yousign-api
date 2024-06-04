////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignerSignatureAuthenticationModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de SignatureAuthenticationMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignerSignatureAuthenticationMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private SignerSignatureAuthenticationModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignerSignatureAuthenticationMode() {
	}

	public static final SignerSignatureAuthenticationMode otp_email = new SignerSignatureAuthenticationMode(SignerSignatureAuthenticationModeValue.otp_email);
	public static final SignerSignatureAuthenticationMode otp_sms = new SignerSignatureAuthenticationMode(SignerSignatureAuthenticationModeValue.otp_sms);
	public static final SignerSignatureAuthenticationMode no_otp = new SignerSignatureAuthenticationMode(SignerSignatureAuthenticationModeValue.no_otp);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignerSignatureAuthenticationMode(SignerSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerSignatureAuthenticationMode#Value Value}.
	 */
	public SignerSignatureAuthenticationModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerSignatureAuthenticationMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignerSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}
}
