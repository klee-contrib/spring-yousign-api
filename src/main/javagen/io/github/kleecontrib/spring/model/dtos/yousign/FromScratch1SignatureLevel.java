////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FromScratch1SignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromScratch1SignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private FromScratch1SignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public FromScratch1SignatureLevel() {
	}

	public static final FromScratch1SignatureLevel electronic_signature = new FromScratch1SignatureLevel(FromScratch1SignatureLevelValue.electronic_signature);
	public static final FromScratch1SignatureLevel advanced_electronic_signature = new FromScratch1SignatureLevel(FromScratch1SignatureLevelValue.advanced_electronic_signature);
	public static final FromScratch1SignatureLevel electronic_signature_with_qualified_certificate = new FromScratch1SignatureLevel(FromScratch1SignatureLevelValue.electronic_signature_with_qualified_certificate);
	public static final FromScratch1SignatureLevel qualified_electronic_signature = new FromScratch1SignatureLevel(FromScratch1SignatureLevelValue.qualified_electronic_signature);
	public static final FromScratch1SignatureLevel qualified_electronic_signature_mode_1 = new FromScratch1SignatureLevel(FromScratch1SignatureLevelValue.qualified_electronic_signature_mode_1);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FromScratch1SignatureLevel(FromScratch1SignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1SignatureLevel#Value Value}.
	 */
	public FromScratch1SignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1SignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FromScratch1SignatureLevelValue Value) {
		this.Value = Value;
	}
}
