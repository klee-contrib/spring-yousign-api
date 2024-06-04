////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FieldSignatureTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FieldSignatureType implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private FieldSignatureTypeValue Value;

	/**
	 * No arg constructor.
	 */
	public FieldSignatureType() {
	}

	public static final FieldSignatureType signature = new FieldSignatureType(FieldSignatureTypeValue.signature);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FieldSignatureType(FieldSignatureTypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldSignatureType#Value Value}.
	 */
	public FieldSignatureTypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldSignatureType#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FieldSignatureTypeValue Value) {
		this.Value = Value;
	}
}
