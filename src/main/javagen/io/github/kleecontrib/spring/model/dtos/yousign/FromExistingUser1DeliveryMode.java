////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FromExistingUser1DeliveryModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromExistingUser1DeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Override the delivery mode of the Signature Request for this Signer.
	 */
	private FromExistingUser1DeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public FromExistingUser1DeliveryMode() {
	}

	public static final FromExistingUser1DeliveryMode email = new FromExistingUser1DeliveryMode(FromExistingUser1DeliveryModeValue.email);
	public static final FromExistingUser1DeliveryMode none = new FromExistingUser1DeliveryMode(FromExistingUser1DeliveryModeValue.none);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FromExistingUser1DeliveryMode(FromExistingUser1DeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingUser1DeliveryMode#Value Value}.
	 */
	public FromExistingUser1DeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingUser1DeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FromExistingUser1DeliveryModeValue Value) {
		this.Value = Value;
	}
}
