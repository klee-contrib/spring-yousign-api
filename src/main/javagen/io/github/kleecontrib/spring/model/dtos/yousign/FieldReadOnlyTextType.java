////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FieldReadOnlyTextTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FieldReadOnlyTextType implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private FieldReadOnlyTextTypeValue Value;

	/**
	 * No arg constructor.
	 */
	public FieldReadOnlyTextType() {
	}

	public static final FieldReadOnlyTextType read_only_text = new FieldReadOnlyTextType(FieldReadOnlyTextTypeValue.read_only_text);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FieldReadOnlyTextType(FieldReadOnlyTextTypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyTextType#Value Value}.
	 */
	public FieldReadOnlyTextTypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyTextType#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FieldReadOnlyTextTypeValue Value) {
		this.Value = Value;
	}
}
