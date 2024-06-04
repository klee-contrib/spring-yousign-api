////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FromScratch1DeliveryModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromScratch1DeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Override the delivery mode of the Signature Request for this Signer.
	 */
	private FromScratch1DeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public FromScratch1DeliveryMode() {
	}

	public static final FromScratch1DeliveryMode email = new FromScratch1DeliveryMode(FromScratch1DeliveryModeValue.email);
	public static final FromScratch1DeliveryMode none = new FromScratch1DeliveryMode(FromScratch1DeliveryModeValue.none);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FromScratch1DeliveryMode(FromScratch1DeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1DeliveryMode#Value Value}.
	 */
	public FromScratch1DeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1DeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FromScratch1DeliveryModeValue Value) {
		this.Value = Value;
	}
}
