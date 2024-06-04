////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestInListDeliveryModeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestInListDeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestInListDeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestInListDeliveryMode() {
	}

	public static final SignatureRequestInListDeliveryMode email = new SignatureRequestInListDeliveryMode(SignatureRequestInListDeliveryModeValue.email);
	public static final SignatureRequestInListDeliveryMode none = new SignatureRequestInListDeliveryMode(SignatureRequestInListDeliveryModeValue.none);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestInListDeliveryMode(SignatureRequestInListDeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListDeliveryMode#Value Value}.
	 */
	public SignatureRequestInListDeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListDeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestInListDeliveryModeValue Value) {
		this.Value = Value;
	}
}
