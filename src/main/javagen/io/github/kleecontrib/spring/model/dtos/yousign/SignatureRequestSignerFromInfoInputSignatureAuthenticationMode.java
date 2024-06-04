////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSignerFromInfoInputSignatureAuthenticationModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de SignatureAuthenticationMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestSignerFromInfoInputSignatureAuthenticationMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private SignatureRequestSignerFromInfoInputSignatureAuthenticationModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestSignerFromInfoInputSignatureAuthenticationMode() {
	}

	public static final SignatureRequestSignerFromInfoInputSignatureAuthenticationMode otp_email = new SignatureRequestSignerFromInfoInputSignatureAuthenticationMode(SignatureRequestSignerFromInfoInputSignatureAuthenticationModeValue.otp_email);
	public static final SignatureRequestSignerFromInfoInputSignatureAuthenticationMode otp_sms = new SignatureRequestSignerFromInfoInputSignatureAuthenticationMode(SignatureRequestSignerFromInfoInputSignatureAuthenticationModeValue.otp_sms);
	public static final SignatureRequestSignerFromInfoInputSignatureAuthenticationMode no_otp = new SignatureRequestSignerFromInfoInputSignatureAuthenticationMode(SignatureRequestSignerFromInfoInputSignatureAuthenticationModeValue.no_otp);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestSignerFromInfoInputSignatureAuthenticationMode(SignatureRequestSignerFromInfoInputSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInputSignatureAuthenticationMode#Value Value}.
	 */
	public SignatureRequestSignerFromInfoInputSignatureAuthenticationModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInputSignatureAuthenticationMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestSignerFromInfoInputSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}
}
