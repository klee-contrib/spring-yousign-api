////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FromExistingUser1SignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromExistingUser1SignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private FromExistingUser1SignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public FromExistingUser1SignatureLevel() {
	}

	public static final FromExistingUser1SignatureLevel electronic_signature = new FromExistingUser1SignatureLevel(FromExistingUser1SignatureLevelValue.electronic_signature);
	public static final FromExistingUser1SignatureLevel advanced_electronic_signature = new FromExistingUser1SignatureLevel(FromExistingUser1SignatureLevelValue.advanced_electronic_signature);
	public static final FromExistingUser1SignatureLevel electronic_signature_with_qualified_certificate = new FromExistingUser1SignatureLevel(FromExistingUser1SignatureLevelValue.electronic_signature_with_qualified_certificate);
	public static final FromExistingUser1SignatureLevel qualified_electronic_signature = new FromExistingUser1SignatureLevel(FromExistingUser1SignatureLevelValue.qualified_electronic_signature);
	public static final FromExistingUser1SignatureLevel qualified_electronic_signature_mode_1 = new FromExistingUser1SignatureLevel(FromExistingUser1SignatureLevelValue.qualified_electronic_signature_mode_1);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FromExistingUser1SignatureLevel(FromExistingUser1SignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingUser1SignatureLevel#Value Value}.
	 */
	public FromExistingUser1SignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingUser1SignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FromExistingUser1SignatureLevelValue Value) {
		this.Value = Value;
	}
}
