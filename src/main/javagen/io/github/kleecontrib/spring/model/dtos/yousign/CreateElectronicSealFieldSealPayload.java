////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateElectronicSealFieldSealPayloadTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateElectronicSealFieldSealPayload extends CreateElectronicSealPayloadFieldsInner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayloadType#getValue() CreateElectronicSealFieldSealPayloadType#getValue()} 
	 */
	@NotNull
	private CreateElectronicSealFieldSealPayloadTypeValue Type;

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
	private String reason;

	/**
	 * No arg constructor.
	 */
	public CreateElectronicSealFieldSealPayload() {
		super();
	}

	/**
	 * Getter for Type.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#Type Type}.
	 */
	public CreateElectronicSealFieldSealPayloadTypeValue getType() {
		return this.Type;
	}

	/**
	 * Getter for height.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#height height}.
	 */
	public Integer getHeight() {
		return this.height;
	}

	/**
	 * Getter for width.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#width width}.
	 */
	public Integer getWidth() {
		return this.width;
	}

	/**
	 * Getter for page.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#page page}.
	 */
	public Integer getPage() {
		return this.page;
	}

	/**
	 * Getter for x.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#x x}.
	 */
	public Integer getX() {
		return this.x;
	}

	/**
	 * Getter for y.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#y y}.
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Getter for reason.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#reason reason}.
	 */
	public String getReason() {
		return this.reason;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#Type Type}.
	 * @param Type value to set
	 */
	public void setType(CreateElectronicSealFieldSealPayloadTypeValue Type) {
		this.Type = Type;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#height height}.
	 * @param height value to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#width width}.
	 * @param width value to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#page page}.
	 * @param page value to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#x x}.
	 * @param x value to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#y y}.
	 * @param y value to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayload#reason reason}.
	 * @param reason value to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
}
