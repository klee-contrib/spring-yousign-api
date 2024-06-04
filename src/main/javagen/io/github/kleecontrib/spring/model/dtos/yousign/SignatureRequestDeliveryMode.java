////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestDeliveryModeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestDeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestDeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestDeliveryMode() {
	}

	public static final SignatureRequestDeliveryMode email = new SignatureRequestDeliveryMode(SignatureRequestDeliveryModeValue.email);
	public static final SignatureRequestDeliveryMode none = new SignatureRequestDeliveryMode(SignatureRequestDeliveryModeValue.none);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestDeliveryMode(SignatureRequestDeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestDeliveryMode#Value Value}.
	 */
	public SignatureRequestDeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestDeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestDeliveryModeValue Value) {
		this.Value = Value;
	}
}
