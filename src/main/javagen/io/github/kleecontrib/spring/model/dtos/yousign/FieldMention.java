////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FieldMentionTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FieldMention implements Serializable {
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
	 */
	@NotNull
	private String signer_id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMentionType#getValue() FieldMentionType#getValue()} 
	 */
	@NotNull
	private FieldMentionTypeValue Type;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer height;

	/**
	 * Non documenté.
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
	 * Non documenté.
	 */
	@NotNull
	private String mention;

	/**
	 * Non documenté.
	 */
	private Font font;

	/**
	 * No arg constructor.
	 */
	public FieldMention() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for document_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#document_id document_id}.
	 */
	public String getDocument_id() {
		return this.document_id;
	}

	/**
	 * Getter for signer_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#signer_id signer_id}.
	 */
	public String getSigner_id() {
		return this.signer_id;
	}

	/**
	 * Getter for Type.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#Type Type}.
	 */
	public FieldMentionTypeValue getType() {
		return this.Type;
	}

	/**
	 * Getter for height.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#height height}.
	 */
	public Integer getHeight() {
		return this.height;
	}

	/**
	 * Getter for width.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#width width}.
	 */
	public Integer getWidth() {
		return this.width;
	}

	/**
	 * Getter for page.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#page page}.
	 */
	public Integer getPage() {
		return this.page;
	}

	/**
	 * Getter for x.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#x x}.
	 */
	public Integer getX() {
		return this.x;
	}

	/**
	 * Getter for y.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#y y}.
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Getter for mention.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#mention mention}.
	 */
	public String getMention() {
		return this.mention;
	}

	/**
	 * Getter for font.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#font font}.
	 */
	public Font getFont() {
		return this.font;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#document_id document_id}.
	 * @param document_id value to set
	 */
	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#signer_id signer_id}.
	 * @param signer_id value to set
	 */
	public void setSigner_id(String signer_id) {
		this.signer_id = signer_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#Type Type}.
	 * @param Type value to set
	 */
	public void setType(FieldMentionTypeValue Type) {
		this.Type = Type;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#height height}.
	 * @param height value to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#width width}.
	 * @param width value to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#page page}.
	 * @param page value to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#x x}.
	 * @param x value to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#y y}.
	 * @param y value to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#mention mention}.
	 * @param mention value to set
	 */
	public void setMention(String mention) {
		this.mention = mention;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldMention#font font}.
	 * @param font value to set
	 */
	public void setFont(Font font) {
		this.font = font;
	}
}
