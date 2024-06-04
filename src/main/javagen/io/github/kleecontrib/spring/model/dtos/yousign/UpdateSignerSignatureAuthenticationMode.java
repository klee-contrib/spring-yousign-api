////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.UpdateSignerSignatureAuthenticationModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de SignatureAuthenticationMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateSignerSignatureAuthenticationMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private UpdateSignerSignatureAuthenticationModeValue Value;

	/**
	 * No arg constructor.
	 */
	public UpdateSignerSignatureAuthenticationMode() {
	}

	public static final UpdateSignerSignatureAuthenticationMode otp_email = new UpdateSignerSignatureAuthenticationMode(UpdateSignerSignatureAuthenticationModeValue.otp_email);
	public static final UpdateSignerSignatureAuthenticationMode otp_sms = new UpdateSignerSignatureAuthenticationMode(UpdateSignerSignatureAuthenticationModeValue.otp_sms);
	public static final UpdateSignerSignatureAuthenticationMode no_otp = new UpdateSignerSignatureAuthenticationMode(UpdateSignerSignatureAuthenticationModeValue.no_otp);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public UpdateSignerSignatureAuthenticationMode(UpdateSignerSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignerSignatureAuthenticationMode#Value Value}.
	 */
	public UpdateSignerSignatureAuthenticationModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignerSignatureAuthenticationMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(UpdateSignerSignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}
}
