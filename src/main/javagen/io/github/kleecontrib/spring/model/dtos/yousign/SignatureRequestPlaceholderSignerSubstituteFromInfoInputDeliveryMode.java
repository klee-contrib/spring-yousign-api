////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Override the delivery mode of the Signature Request for this Signer.
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryMode() {
	}

	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryMode email = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryMode(SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryModeValue.email);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryMode none = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryMode(SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryModeValue.none);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryMode(SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryMode#Value Value}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryModeValue Value) {
		this.Value = Value;
	}
}
