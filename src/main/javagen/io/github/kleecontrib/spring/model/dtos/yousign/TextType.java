////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.TextTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class TextType implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private TextTypeValue Value;

	/**
	 * No arg constructor.
	 */
	public TextType() {
	}

	public static final TextType text = new TextType(TextTypeValue.text);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public TextType(TextTypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.TextType#Value Value}.
	 */
	public TextTypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.TextType#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(TextTypeValue Value) {
		this.Value = Value;
	}
}
