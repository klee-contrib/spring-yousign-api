////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FromExistingUser1SignatureAuthenticationModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de SignatureAuthenticationMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromExistingUser1SignatureAuthenticationMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private FromExistingUser1SignatureAuthenticationModeValue Value;

	/**
	 * No arg constructor.
	 */
	public FromExistingUser1SignatureAuthenticationMode() {
	}

	public static final FromExistingUser1SignatureAuthenticationMode otp_email = new FromExistingUser1SignatureAuthenticationMode(FromExistingUser1SignatureAuthenticationModeValue.otp_email);
	public static final FromExistingUser1SignatureAuthenticationMode otp_sms = new FromExistingUser1SignatureAuthenticationMode(FromExistingUser1SignatureAuthenticationModeValue.otp_sms);
	public static final FromExistingUser1SignatureAuthenticationMode no_otp = new FromExistingUser1SignatureAuthenticationMode(FromExistingUser1SignatureAuthenticationModeValue.no_otp);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FromExistingUser1SignatureAuthenticationMode(FromExistingUser1SignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingUser1SignatureAuthenticationMode#Value Value}.
	 */
	public FromExistingUser1SignatureAuthenticationModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingUser1SignatureAuthenticationMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FromExistingUser1SignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}
}
