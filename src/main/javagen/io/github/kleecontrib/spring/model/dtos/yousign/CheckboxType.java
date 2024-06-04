////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CheckboxTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CheckboxType implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private CheckboxTypeValue Value;

	/**
	 * No arg constructor.
	 */
	public CheckboxType() {
	}

	public static final CheckboxType checkbox = new CheckboxType(CheckboxTypeValue.checkbox);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public CheckboxType(CheckboxTypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CheckboxType#Value Value}.
	 */
	public CheckboxTypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CheckboxType#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(CheckboxTypeValue Value) {
		this.Value = Value;
	}
}
