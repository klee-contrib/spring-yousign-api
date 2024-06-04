////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.RadioGroup2TypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class RadioGroup2Type implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private RadioGroup2TypeValue Value;

	/**
	 * No arg constructor.
	 */
	public RadioGroup2Type() {
	}

	public static final RadioGroup2Type radio_group = new RadioGroup2Type(RadioGroup2TypeValue.radio_group);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public RadioGroup2Type(RadioGroup2TypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2Type#Value Value}.
	 */
	public RadioGroup2TypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2Type#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(RadioGroup2TypeValue Value) {
		this.Value = Value;
	}
}
