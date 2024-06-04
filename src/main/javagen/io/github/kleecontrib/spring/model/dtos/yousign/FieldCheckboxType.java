////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FieldCheckboxTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FieldCheckboxType implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private FieldCheckboxTypeValue Value;

	/**
	 * No arg constructor.
	 */
	public FieldCheckboxType() {
	}

	public static final FieldCheckboxType checkbox = new FieldCheckboxType(FieldCheckboxTypeValue.checkbox);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FieldCheckboxType(FieldCheckboxTypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldCheckboxType#Value Value}.
	 */
	public FieldCheckboxTypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldCheckboxType#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FieldCheckboxTypeValue Value) {
		this.Value = Value;
	}
}
