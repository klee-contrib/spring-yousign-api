////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryModeValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de DeliveryMode.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Override the delivery mode of the Signature Request for this Signer.
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryModeValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryMode() {
	}

	public static final SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryMode email = new SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryMode(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryModeValue.email);
	public static final SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryMode none = new SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryMode(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryModeValue.none);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryMode(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryModeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryMode#Value Value}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryModeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryMode#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryModeValue Value) {
		this.Value = Value;
	}
}
