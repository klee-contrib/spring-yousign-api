////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.Checkbox2TypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class Checkbox2Type implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Checkbox2TypeValue Value;

	/**
	 * No arg constructor.
	 */
	public Checkbox2Type() {
	}

	public static final Checkbox2Type checkbox = new Checkbox2Type(Checkbox2TypeValue.checkbox);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public Checkbox2Type(Checkbox2TypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox2Type#Value Value}.
	 */
	public Checkbox2TypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox2Type#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(Checkbox2TypeValue Value) {
		this.Value = Value;
	}
}
