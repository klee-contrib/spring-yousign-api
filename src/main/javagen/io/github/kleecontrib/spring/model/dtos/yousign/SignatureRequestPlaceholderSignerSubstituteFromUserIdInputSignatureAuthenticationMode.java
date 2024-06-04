////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de SignatureAuthenticationMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode() {
	}

	public static final SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode otp_email = new SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationModeValue.otp_email);
	public static final SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode otp_sms = new SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationModeValue.otp_sms);
	public static final SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode no_otp = new SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationModeValue.no_otp);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode#Value Value}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}
}
