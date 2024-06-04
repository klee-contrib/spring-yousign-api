////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de SignatureAuthenticationMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode() {
	}

	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode otp_email = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationModeValue.otp_email);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode otp_sms = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationModeValue.otp_sms);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode no_otp = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationModeValue.no_otp);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode#Value Value}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}
}
