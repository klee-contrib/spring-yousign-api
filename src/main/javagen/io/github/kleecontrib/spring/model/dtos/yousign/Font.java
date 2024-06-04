////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class Font implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.FontFamily#getValue() FontFamily#getValue()} 
	 */
	@NotNull
	private String Family;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String color;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer size;

	/**
	 * Non documenté.
	 */
	private FontVariants variants;

	/**
	 * No arg constructor.
	 */
	public Font() {
	}

	/**
	 * Getter for Family.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Font#Family Family}.
	 */
	public String getFamily() {
		return this.Family;
	}

	/**
	 * Getter for color.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Font#color color}.
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Getter for size.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Font#size size}.
	 */
	public Integer getSize() {
		return this.size;
	}

	/**
	 * Getter for variants.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Font#variants variants}.
	 */
	public FontVariants getVariants() {
		return this.variants;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Font#Family Family}.
	 * @param Family value to set
	 */
	public void setFamily(String Family) {
		this.Family = Family;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Font#color color}.
	 * @param color value to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Font#size size}.
	 * @param size value to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Font#variants variants}.
	 * @param variants value to set
	 */
	public void setVariants(FontVariants variants) {
		this.variants = variants;
	}
}
