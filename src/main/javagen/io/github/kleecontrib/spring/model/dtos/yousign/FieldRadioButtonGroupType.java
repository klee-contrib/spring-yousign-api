////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FieldRadioButtonGroupTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FieldRadioButtonGroupType implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private FieldRadioButtonGroupTypeValue Value;

	/**
	 * No arg constructor.
	 */
	public FieldRadioButtonGroupType() {
	}

	public static final FieldRadioButtonGroupType radio_group = new FieldRadioButtonGroupType(FieldRadioButtonGroupTypeValue.radio_group);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FieldRadioButtonGroupType(FieldRadioButtonGroupTypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroupType#Value Value}.
	 */
	public FieldRadioButtonGroupTypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroupType#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FieldRadioButtonGroupTypeValue Value) {
		this.Value = Value;
	}
}
