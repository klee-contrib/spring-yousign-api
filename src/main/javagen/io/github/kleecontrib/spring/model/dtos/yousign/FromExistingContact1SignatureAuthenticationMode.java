////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FromExistingContact1SignatureAuthenticationModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de SignatureAuthenticationMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromExistingContact1SignatureAuthenticationMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private FromExistingContact1SignatureAuthenticationModeValue Value;

	/**
	 * No arg constructor.
	 */
	public FromExistingContact1SignatureAuthenticationMode() {
	}

	public static final FromExistingContact1SignatureAuthenticationMode otp_email = new FromExistingContact1SignatureAuthenticationMode(FromExistingContact1SignatureAuthenticationModeValue.otp_email);
	public static final FromExistingContact1SignatureAuthenticationMode otp_sms = new FromExistingContact1SignatureAuthenticationMode(FromExistingContact1SignatureAuthenticationModeValue.otp_sms);
	public static final FromExistingContact1SignatureAuthenticationMode no_otp = new FromExistingContact1SignatureAuthenticationMode(FromExistingContact1SignatureAuthenticationModeValue.no_otp);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FromExistingContact1SignatureAuthenticationMode(FromExistingContact1SignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1SignatureAuthenticationMode#Value Value}.
	 */
	public FromExistingContact1SignatureAuthenticationModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1SignatureAuthenticationMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FromExistingContact1SignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}
}
