////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.DocumentInitialsAlignmentValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class DocumentInitials implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Initials alignment on the document.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.DocumentInitialsAlignment#getValue() DocumentInitialsAlignment#getValue()} 
	 */
	@NotNull
	private DocumentInitialsAlignmentValue Alignment;

	/**
	 * y-axis position on the document.
	 */
	@NotNull
	private Integer y;

	/**
	 * No arg constructor.
	 */
	public DocumentInitials() {
	}

	/**
	 * Getter for Alignment.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.DocumentInitials#Alignment Alignment}.
	 */
	public DocumentInitialsAlignmentValue getAlignment() {
		return this.Alignment;
	}

	/**
	 * Getter for y.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.DocumentInitials#y y}.
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.DocumentInitials#Alignment Alignment}.
	 * @param Alignment value to set
	 */
	public void setAlignment(DocumentInitialsAlignmentValue Alignment) {
		this.Alignment = Alignment;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.DocumentInitials#y y}.
	 * @param y value to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}
}
