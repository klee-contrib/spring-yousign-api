////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FromScratch1SignatureAuthenticationModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de SignatureAuthenticationMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromScratch1SignatureAuthenticationMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private FromScratch1SignatureAuthenticationModeValue Value;

	/**
	 * No arg constructor.
	 */
	public FromScratch1SignatureAuthenticationMode() {
	}

	public static final FromScratch1SignatureAuthenticationMode otp_email = new FromScratch1SignatureAuthenticationMode(FromScratch1SignatureAuthenticationModeValue.otp_email);
	public static final FromScratch1SignatureAuthenticationMode otp_sms = new FromScratch1SignatureAuthenticationMode(FromScratch1SignatureAuthenticationModeValue.otp_sms);
	public static final FromScratch1SignatureAuthenticationMode no_otp = new FromScratch1SignatureAuthenticationMode(FromScratch1SignatureAuthenticationModeValue.no_otp);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FromScratch1SignatureAuthenticationMode(FromScratch1SignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1SignatureAuthenticationMode#Value Value}.
	 */
	public FromScratch1SignatureAuthenticationModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1SignatureAuthenticationMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FromScratch1SignatureAuthenticationModeValue Value) {
		this.Value = Value;
	}
}
