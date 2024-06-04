////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de SignatureAuthenticationMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode() {
	}

	public static final SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode otp_email = new SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationModeValue.otp_email);
	public static final SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode otp_sms = new SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationModeValue.otp_sms);
	public static final SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode no_otp = new SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationModeValue.no_otp);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode#Value Value}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}
}
