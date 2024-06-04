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
public class RadioGroupRadiosInner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Radio button's name.
	 */
	private String name;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer x;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer y;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer size;

	/**
	 * No arg constructor.
	 */
	public RadioGroupRadiosInner() {
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroupRadiosInner#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for x.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroupRadiosInner#x x}.
	 */
	public Integer getX() {
		return this.x;
	}

	/**
	 * Getter for y.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroupRadiosInner#y y}.
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Getter for size.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroupRadiosInner#size size}.
	 */
	public Integer getSize() {
		return this.size;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroupRadiosInner#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroupRadiosInner#x x}.
	 * @param x value to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroupRadiosInner#y y}.
	 * @param y value to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroupRadiosInner#size size}.
	 * @param size value to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}
}
