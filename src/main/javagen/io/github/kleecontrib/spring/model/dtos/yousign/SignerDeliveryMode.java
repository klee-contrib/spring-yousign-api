////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignerDeliveryModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignerDeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private SignerDeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignerDeliveryMode() {
	}

	public static final SignerDeliveryMode email = new SignerDeliveryMode(SignerDeliveryModeValue.email);
	public static final SignerDeliveryMode none = new SignerDeliveryMode(SignerDeliveryModeValue.none);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignerDeliveryMode(SignerDeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDeliveryMode#Value Value}.
	 */
	public SignerDeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignerDeliveryModeValue Value) {
		this.Value = Value;
	}
}
