////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.RadioGroupTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class RadioGroupType implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private RadioGroupTypeValue Value;

	/**
	 * No arg constructor.
	 */
	public RadioGroupType() {
	}

	public static final RadioGroupType radio_group = new RadioGroupType(RadioGroupTypeValue.radio_group);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public RadioGroupType(RadioGroupTypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroupType#Value Value}.
	 */
	public RadioGroupTypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroupType#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(RadioGroupTypeValue Value) {
		this.Value = Value;
	}
}
