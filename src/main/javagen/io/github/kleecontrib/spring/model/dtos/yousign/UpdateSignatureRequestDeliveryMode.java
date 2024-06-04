////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.UpdateSignatureRequestDeliveryModeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateSignatureRequestDeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Delivery mode to notify signers.
	 */
	@NotNull
	private UpdateSignatureRequestDeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public UpdateSignatureRequestDeliveryMode() {
	}

	public static final UpdateSignatureRequestDeliveryMode none = new UpdateSignatureRequestDeliveryMode(UpdateSignatureRequestDeliveryModeValue.none);
	public static final UpdateSignatureRequestDeliveryMode email = new UpdateSignatureRequestDeliveryMode(UpdateSignatureRequestDeliveryModeValue.email);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public UpdateSignatureRequestDeliveryMode(UpdateSignatureRequestDeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequestDeliveryMode#Value Value}.
	 */
	public UpdateSignatureRequestDeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequestDeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(UpdateSignatureRequestDeliveryModeValue Value) {
		this.Value = Value;
	}
}
