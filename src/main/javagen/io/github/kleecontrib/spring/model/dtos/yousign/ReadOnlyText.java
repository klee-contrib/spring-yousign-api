////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.ReadOnlyTextTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class ReadOnlyText extends CreateField implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyTextType#getValue() ReadOnlyTextType#getValue()} 
	 */
	@NotNull
	private ReadOnlyTextTypeValue Type;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer page;

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
	 * If not set, the width is automatically calculated with the read only text length.
	 */
	private Integer width;

	/**
	 * The height must be 24 or a multiple of 15 greater than 24. If height is not provided, it will be calculated depending on the number of newlines in the read only text.
	 */
	private Integer height;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String text;

	/**
	 * If set, **width** and **height** properties become required. Otherwise, if not set or null, the default font will be used.
	 */
	private CreateFieldFont font;

	/**
	 * No arg constructor.
	 */
	public ReadOnlyText() {
		super();
	}

	/**
	 * Getter for Type.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#Type Type}.
	 */
	public ReadOnlyTextTypeValue getType() {
		return this.Type;
	}

	/**
	 * Getter for page.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#page page}.
	 */
	public Integer getPage() {
		return this.page;
	}

	/**
	 * Getter for x.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#x x}.
	 */
	public Integer getX() {
		return this.x;
	}

	/**
	 * Getter for y.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#y y}.
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Getter for width.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#width width}.
	 */
	public Integer getWidth() {
		return this.width;
	}

	/**
	 * Getter for height.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#height height}.
	 */
	public Integer getHeight() {
		return this.height;
	}

	/**
	 * Getter for text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#text text}.
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * Getter for font.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#font font}.
	 */
	public CreateFieldFont getFont() {
		return this.font;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#Type Type}.
	 * @param Type value to set
	 */
	public void setType(ReadOnlyTextTypeValue Type) {
		this.Type = Type;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#page page}.
	 * @param page value to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#x x}.
	 * @param x value to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#y y}.
	 * @param y value to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#width width}.
	 * @param width value to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#height height}.
	 * @param height value to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#text text}.
	 * @param text value to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText#font font}.
	 * @param font value to set
	 */
	public void setFont(CreateFieldFont font) {
		this.font = font;
	}
}
