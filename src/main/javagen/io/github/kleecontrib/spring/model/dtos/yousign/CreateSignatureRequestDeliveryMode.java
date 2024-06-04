////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateSignatureRequestDeliveryModeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateSignatureRequestDeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Delivery mode to notify signers.
	 */
	@NotNull
	private CreateSignatureRequestDeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public CreateSignatureRequestDeliveryMode() {
	}

	public static final CreateSignatureRequestDeliveryMode none = new CreateSignatureRequestDeliveryMode(CreateSignatureRequestDeliveryModeValue.none);
	public static final CreateSignatureRequestDeliveryMode email = new CreateSignatureRequestDeliveryMode(CreateSignatureRequestDeliveryModeValue.email);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public CreateSignatureRequestDeliveryMode(CreateSignatureRequestDeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestDeliveryMode#Value Value}.
	 */
	public CreateSignatureRequestDeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestDeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(CreateSignatureRequestDeliveryModeValue Value) {
		this.Value = Value;
	}
}
