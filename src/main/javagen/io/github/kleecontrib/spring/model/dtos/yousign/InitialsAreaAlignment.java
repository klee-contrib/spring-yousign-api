////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.InitialsAreaAlignmentValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Alignment.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class InitialsAreaAlignment implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Initials alignment on the document.
	 */
	@NotNull
	private InitialsAreaAlignmentValue Value;

	/**
	 * No arg constructor.
	 */
	public InitialsAreaAlignment() {
	}

	public static final InitialsAreaAlignment left = new InitialsAreaAlignment(InitialsAreaAlignmentValue.left);
	public static final InitialsAreaAlignment right = new InitialsAreaAlignment(InitialsAreaAlignmentValue.right);
	public static final InitialsAreaAlignment center = new InitialsAreaAlignment(InitialsAreaAlignmentValue.center);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public InitialsAreaAlignment(InitialsAreaAlignmentValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.InitialsAreaAlignment#Value Value}.
	 */
	public InitialsAreaAlignmentValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.InitialsAreaAlignment#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(InitialsAreaAlignmentValue Value) {
		this.Value = Value;
	}
}
