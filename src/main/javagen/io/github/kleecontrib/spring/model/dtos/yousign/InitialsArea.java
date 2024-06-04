////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.InitialsAreaAlignmentValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class InitialsArea implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Initials alignment on the document.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.InitialsAreaAlignment#getValue() InitialsAreaAlignment#getValue()} 
	 */
	@NotNull
	private InitialsAreaAlignmentValue Alignment;

	/**
	 * y-axis position on the document.
	 */
	@NotNull
	private Integer y;

	/**
	 * No arg constructor.
	 */
	public InitialsArea() {
	}

	/**
	 * Getter for Alignment.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.InitialsArea#Alignment Alignment}.
	 */
	public InitialsAreaAlignmentValue getAlignment() {
		return this.Alignment;
	}

	/**
	 * Getter for y.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.InitialsArea#y y}.
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.InitialsArea#Alignment Alignment}.
	 * @param Alignment value to set
	 */
	public void setAlignment(InitialsAreaAlignmentValue Alignment) {
		this.Alignment = Alignment;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.InitialsArea#y y}.
	 * @param y value to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}
}
