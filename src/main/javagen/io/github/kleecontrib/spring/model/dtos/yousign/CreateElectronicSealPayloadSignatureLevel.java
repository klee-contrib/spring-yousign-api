////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateElectronicSealPayloadSignatureLevelValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateElectronicSealPayloadSignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private CreateElectronicSealPayloadSignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public CreateElectronicSealPayloadSignatureLevel() {
	}

	public static final CreateElectronicSealPayloadSignatureLevel electronic_signature = new CreateElectronicSealPayloadSignatureLevel(CreateElectronicSealPayloadSignatureLevelValue.electronic_signature);
	public static final CreateElectronicSealPayloadSignatureLevel advanced_electronic_signature = new CreateElectronicSealPayloadSignatureLevel(CreateElectronicSealPayloadSignatureLevelValue.advanced_electronic_signature);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public CreateElectronicSealPayloadSignatureLevel(CreateElectronicSealPayloadSignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayloadSignatureLevel#Value Value}.
	 */
	public CreateElectronicSealPayloadSignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayloadSignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(CreateElectronicSealPayloadSignatureLevelValue Value) {
		this.Value = Value;
	}
}
