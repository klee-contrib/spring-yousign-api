////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Family.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateFieldFontFamily implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String Value;

	/**
	 * No arg constructor.
	 */
	public CreateFieldFontFamily() {
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFieldFontFamily#Value Value}.
	 */
	public String getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFieldFontFamily#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(String Value) {
		this.Value = Value;
	}
}
