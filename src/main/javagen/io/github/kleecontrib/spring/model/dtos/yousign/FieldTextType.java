////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FieldTextTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FieldTextType implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private FieldTextTypeValue Value;

	/**
	 * No arg constructor.
	 */
	public FieldTextType() {
	}

	public static final FieldTextType text = new FieldTextType(FieldTextTypeValue.text);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FieldTextType(FieldTextTypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldTextType#Value Value}.
	 */
	public FieldTextTypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldTextType#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FieldTextTypeValue Value) {
		this.Value = Value;
	}
}
