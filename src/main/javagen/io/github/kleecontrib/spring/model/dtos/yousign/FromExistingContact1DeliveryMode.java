////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FromExistingContact1DeliveryModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromExistingContact1DeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Override the delivery mode of the Signature Request for this Signer.
	 */
	private FromExistingContact1DeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public FromExistingContact1DeliveryMode() {
	}

	public static final FromExistingContact1DeliveryMode email = new FromExistingContact1DeliveryMode(FromExistingContact1DeliveryModeValue.email);
	public static final FromExistingContact1DeliveryMode none = new FromExistingContact1DeliveryMode(FromExistingContact1DeliveryModeValue.none);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FromExistingContact1DeliveryMode(FromExistingContact1DeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1DeliveryMode#Value Value}.
	 */
	public FromExistingContact1DeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1DeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FromExistingContact1DeliveryModeValue Value) {
		this.Value = Value;
	}
}
