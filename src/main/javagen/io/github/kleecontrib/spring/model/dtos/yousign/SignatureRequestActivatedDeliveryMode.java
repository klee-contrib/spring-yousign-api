////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestActivatedDeliveryModeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestActivatedDeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestActivatedDeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestActivatedDeliveryMode() {
	}

	public static final SignatureRequestActivatedDeliveryMode email = new SignatureRequestActivatedDeliveryMode(SignatureRequestActivatedDeliveryModeValue.email);
	public static final SignatureRequestActivatedDeliveryMode none = new SignatureRequestActivatedDeliveryMode(SignatureRequestActivatedDeliveryModeValue.none);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestActivatedDeliveryMode(SignatureRequestActivatedDeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedDeliveryMode#Value Value}.
	 */
	public SignatureRequestActivatedDeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedDeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestActivatedDeliveryModeValue Value) {
		this.Value = Value;
	}
}
