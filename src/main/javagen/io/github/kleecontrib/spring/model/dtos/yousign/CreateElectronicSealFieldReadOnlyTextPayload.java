////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateElectronicSealFieldReadOnlyTextPayloadTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateElectronicSealFieldReadOnlyTextPayload extends CreateElectronicSealPayloadFieldsInner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayloadType#getValue() CreateElectronicSealFieldReadOnlyTextPayloadType#getValue()} 
	 */
	@NotNull
	private CreateElectronicSealFieldReadOnlyTextPayloadTypeValue Type;

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
	private String text;

	/**
	 * No arg constructor.
	 */
	public CreateElectronicSealFieldReadOnlyTextPayload() {
		super();
	}

	/**
	 * Getter for Type.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#Type Type}.
	 */
	public CreateElectronicSealFieldReadOnlyTextPayloadTypeValue getType() {
		return this.Type;
	}

	/**
	 * Getter for height.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#height height}.
	 */
	public Integer getHeight() {
		return this.height;
	}

	/**
	 * Getter for width.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#width width}.
	 */
	public Integer getWidth() {
		return this.width;
	}

	/**
	 * Getter for page.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#page page}.
	 */
	public Integer getPage() {
		return this.page;
	}

	/**
	 * Getter for x.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#x x}.
	 */
	public Integer getX() {
		return this.x;
	}

	/**
	 * Getter for y.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#y y}.
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Getter for text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#text text}.
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#Type Type}.
	 * @param Type value to set
	 */
	public void setType(CreateElectronicSealFieldReadOnlyTextPayloadTypeValue Type) {
		this.Type = Type;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#height height}.
	 * @param height value to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#width width}.
	 * @param width value to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#page page}.
	 * @param page value to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#x x}.
	 * @param x value to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#y y}.
	 * @param y value to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayload#text text}.
	 * @param text value to set
	 */
	public void setText(String text) {
		this.text = text;
	}
}
