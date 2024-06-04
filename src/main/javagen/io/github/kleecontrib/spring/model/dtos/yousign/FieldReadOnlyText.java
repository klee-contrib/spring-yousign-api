////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FieldReadOnlyTextTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FieldReadOnlyText extends GetSignatureRequestsSignatureRequestIdDocumentsDocumentIdFields200ResponseDataInner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String id;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String document_id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyTextType#getValue() FieldReadOnlyTextType#getValue()} 
	 */
	@NotNull
	private FieldReadOnlyTextTypeValue Type;

	/**
	 * The height must be 24 or a multiple of 15 greater than 24. If height is provided, max_length must be less than or equal to the maximum number of characters based on the width and height of the text field.
	 */
	@NotNull
	private Integer height;

	/**
	 * If not set, the width is automatically calculated with the max_length value.
	 */
	@NotNull
	private Integer width;

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
	 * This property holds the content displayed in the read-only text field.
	 */
	@NotNull
	private String text;

	/**
	 * Non documenté.
	 */
	private Font font;

	/**
	 * No arg constructor.
	 */
	public FieldReadOnlyText() {
		super();
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for document_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#document_id document_id}.
	 */
	public String getDocument_id() {
		return this.document_id;
	}

	/**
	 * Getter for Type.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#Type Type}.
	 */
	public FieldReadOnlyTextTypeValue getType() {
		return this.Type;
	}

	/**
	 * Getter for height.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#height height}.
	 */
	public Integer getHeight() {
		return this.height;
	}

	/**
	 * Getter for width.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#width width}.
	 */
	public Integer getWidth() {
		return this.width;
	}

	/**
	 * Getter for page.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#page page}.
	 */
	public Integer getPage() {
		return this.page;
	}

	/**
	 * Getter for x.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#x x}.
	 */
	public Integer getX() {
		return this.x;
	}

	/**
	 * Getter for y.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#y y}.
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Getter for text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#text text}.
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * Getter for font.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#font font}.
	 */
	public Font getFont() {
		return this.font;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#document_id document_id}.
	 * @param document_id value to set
	 */
	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#Type Type}.
	 * @param Type value to set
	 */
	public void setType(FieldReadOnlyTextTypeValue Type) {
		this.Type = Type;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#height height}.
	 * @param height value to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#width width}.
	 * @param width value to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#page page}.
	 * @param page value to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#x x}.
	 * @param x value to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#y y}.
	 * @param y value to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#text text}.
	 * @param text value to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldReadOnlyText#font font}.
	 * @param font value to set
	 */
	public void setFont(Font font) {
		this.font = font;
	}
}
