////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.ElectronicSealSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class ElectronicSealSignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private ElectronicSealSignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public ElectronicSealSignatureLevel() {
	}

	public static final ElectronicSealSignatureLevel electronic_signature = new ElectronicSealSignatureLevel(ElectronicSealSignatureLevelValue.electronic_signature);
	public static final ElectronicSealSignatureLevel advanced_electronic_signature = new ElectronicSealSignatureLevel(ElectronicSealSignatureLevelValue.advanced_electronic_signature);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public ElectronicSealSignatureLevel(ElectronicSealSignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealSignatureLevel#Value Value}.
	 */
	public ElectronicSealSignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealSignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(ElectronicSealSignatureLevelValue Value) {
		this.Value = Value;
	}
}
