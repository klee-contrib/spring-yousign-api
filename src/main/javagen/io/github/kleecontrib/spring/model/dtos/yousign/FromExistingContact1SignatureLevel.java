////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FromExistingContact1SignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromExistingContact1SignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private FromExistingContact1SignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public FromExistingContact1SignatureLevel() {
	}

	public static final FromExistingContact1SignatureLevel electronic_signature = new FromExistingContact1SignatureLevel(FromExistingContact1SignatureLevelValue.electronic_signature);
	public static final FromExistingContact1SignatureLevel advanced_electronic_signature = new FromExistingContact1SignatureLevel(FromExistingContact1SignatureLevelValue.advanced_electronic_signature);
	public static final FromExistingContact1SignatureLevel electronic_signature_with_qualified_certificate = new FromExistingContact1SignatureLevel(FromExistingContact1SignatureLevelValue.electronic_signature_with_qualified_certificate);
	public static final FromExistingContact1SignatureLevel qualified_electronic_signature = new FromExistingContact1SignatureLevel(FromExistingContact1SignatureLevelValue.qualified_electronic_signature);
	public static final FromExistingContact1SignatureLevel qualified_electronic_signature_mode_1 = new FromExistingContact1SignatureLevel(FromExistingContact1SignatureLevelValue.qualified_electronic_signature_mode_1);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FromExistingContact1SignatureLevel(FromExistingContact1SignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1SignatureLevel#Value Value}.
	 */
	public FromExistingContact1SignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1SignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FromExistingContact1SignatureLevelValue Value) {
		this.Value = Value;
	}
}
