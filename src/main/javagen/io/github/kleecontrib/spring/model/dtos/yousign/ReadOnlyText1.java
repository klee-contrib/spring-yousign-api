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
public class ReadOnlyText1 extends UpdateField implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

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
	 * If not set, the width is automatically calculated with the mention length.
	 */
	private Integer width;

	/**
	 * The height must be 24 or a multiple of 15 greater than 24. If height is not provided, it will be calculated depending on the number of newlines in the mention.
	 */
	private Integer height;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String text;

	/**
	 * If set, **width** and **height** properties become required. Otherwise, if not set the font will not be changed, and if set to null the default font will be used.
	 */
	private UpdateFieldFont font;

	/**
	 * No arg constructor.
	 */
	public ReadOnlyText1() {
		super();
	}

	/**
	 * Getter for page.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#page page}.
	 */
	public Integer getPage() {
		return this.page;
	}

	/**
	 * Getter for x.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#x x}.
	 */
	public Integer getX() {
		return this.x;
	}

	/**
	 * Getter for y.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#y y}.
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Getter for width.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#width width}.
	 */
	public Integer getWidth() {
		return this.width;
	}

	/**
	 * Getter for height.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#height height}.
	 */
	public Integer getHeight() {
		return this.height;
	}

	/**
	 * Getter for text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#text text}.
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * Getter for font.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#font font}.
	 */
	public UpdateFieldFont getFont() {
		return this.font;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#page page}.
	 * @param page value to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#x x}.
	 * @param x value to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#y y}.
	 * @param y value to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#width width}.
	 * @param width value to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#height height}.
	 * @param height value to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#text text}.
	 * @param text value to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ReadOnlyText1#font font}.
	 * @param font value to set
	 */
	public void setFont(UpdateFieldFont font) {
		this.font = font;
	}
}
