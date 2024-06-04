////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Override the delivery mode of the Signature Request for this Signer.
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryMode() {
	}

	public static final SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryMode email = new SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryMode(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryModeValue.email);
	public static final SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryMode none = new SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryMode(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryModeValue.none);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryMode(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryMode#Value Value}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryModeValue Value) {
		this.Value = Value;
	}
}
