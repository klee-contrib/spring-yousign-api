////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FieldTextTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FieldText implements Serializable {
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
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldTextType#getValue() FieldTextType#getValue()} 
	 */
	@NotNull
	private FieldTextTypeValue Type;

	/**
	 * If not set, the width is automatically calculated with the max_length value.
	 */
	@NotNull
	private Integer width;

	/**
	 * The height must be 24 or a multiple of 15 greater than 24. If height is provided, max_length must be less than or equal to the maximum number of characters based on the width and height of the text field.
	 */
	@NotNull
	private Integer height;

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
	private String question;

	/**
	 * Non documenté.
	 */
	private String instruction;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean optional;

	/**
	 * Non documenté.
	 */
	private String answer;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer max_length;

	/**
	 * Non documenté.
	 */
	private Font font;

	/**
	 * No arg constructor.
	 */
	public FieldText() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for document_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#document_id document_id}.
	 */
	public String getDocument_id() {
		return this.document_id;
	}

	/**
	 * Getter for signer_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#signer_id signer_id}.
	 */
	public String getSigner_id() {
		return this.signer_id;
	}

	/**
	 * Getter for Type.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#Type Type}.
	 */
	public FieldTextTypeValue getType() {
		return this.Type;
	}

	/**
	 * Getter for width.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#width width}.
	 */
	public Integer getWidth() {
		return this.width;
	}

	/**
	 * Getter for height.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#height height}.
	 */
	public Integer getHeight() {
		return this.height;
	}

	/**
	 * Getter for page.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#page page}.
	 */
	public Integer getPage() {
		return this.page;
	}

	/**
	 * Getter for x.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#x x}.
	 */
	public Integer getX() {
		return this.x;
	}

	/**
	 * Getter for y.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#y y}.
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Getter for question.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#question question}.
	 */
	public String getQuestion() {
		return this.question;
	}

	/**
	 * Getter for instruction.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#instruction instruction}.
	 */
	public String getInstruction() {
		return this.instruction;
	}

	/**
	 * Getter for optional.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#optional optional}.
	 */
	public Boolean getOptional() {
		return this.optional;
	}

	/**
	 * Getter for answer.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#answer answer}.
	 */
	public String getAnswer() {
		return this.answer;
	}

	/**
	 * Getter for max_length.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#max_length max_length}.
	 */
	public Integer getMax_length() {
		return this.max_length;
	}

	/**
	 * Getter for font.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#font font}.
	 */
	public Font getFont() {
		return this.font;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#document_id document_id}.
	 * @param document_id value to set
	 */
	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#signer_id signer_id}.
	 * @param signer_id value to set
	 */
	public void setSigner_id(String signer_id) {
		this.signer_id = signer_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#Type Type}.
	 * @param Type value to set
	 */
	public void setType(FieldTextTypeValue Type) {
		this.Type = Type;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#width width}.
	 * @param width value to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#height height}.
	 * @param height value to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#page page}.
	 * @param page value to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#x x}.
	 * @param x value to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#y y}.
	 * @param y value to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#question question}.
	 * @param question value to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#instruction instruction}.
	 * @param instruction value to set
	 */
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#optional optional}.
	 * @param optional value to set
	 */
	public void setOptional(Boolean optional) {
		this.optional = optional;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#answer answer}.
	 * @param answer value to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#max_length max_length}.
	 * @param max_length value to set
	 */
	public void setMax_length(Integer max_length) {
		this.max_length = max_length;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldText#font font}.
	 * @param font value to set
	 */
	public void setFont(Font font) {
		this.font = font;
	}
}
