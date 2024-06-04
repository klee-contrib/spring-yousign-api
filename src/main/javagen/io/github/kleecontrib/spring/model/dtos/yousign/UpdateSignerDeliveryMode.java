////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.UpdateSignerDeliveryModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateSignerDeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Override the delivery mode of the Signature Request for this Signer.
	 */
	private UpdateSignerDeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public UpdateSignerDeliveryMode() {
	}

	public static final UpdateSignerDeliveryMode email = new UpdateSignerDeliveryMode(UpdateSignerDeliveryModeValue.email);
	public static final UpdateSignerDeliveryMode none = new UpdateSignerDeliveryMode(UpdateSignerDeliveryModeValue.none);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public UpdateSignerDeliveryMode(UpdateSignerDeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignerDeliveryMode#Value Value}.
	 */
	public UpdateSignerDeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignerDeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(UpdateSignerDeliveryModeValue Value) {
		this.Value = Value;
	}
}
