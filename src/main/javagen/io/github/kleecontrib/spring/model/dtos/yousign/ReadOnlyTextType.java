////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.ReadOnlyTextTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class ReadOnlyTextType implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private ReadOnlyTextTypeValue Value;

	/**
	 * No arg constructor.
	 */
	public ReadOnlyTextType() {
	}

	public static final ReadOnlyTextType read_only_text = new ReadOnlyTextType(ReadOnlyTextTypeValue.read_only_text);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public ReadOnlyTextType(ReadOnlyTextTypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyTextType#Value Value}.
	 */
	public ReadOnlyTextTypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyTextType#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(ReadOnlyTextTypeValue Value) {
		this.Value = Value;
	}
}
