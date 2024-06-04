////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class Signature extends CreateField implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String signer_id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureType#getValue() SignatureType#getValue()} 
	 */
	@NotNull
	private SignatureTypeValue Type;

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
	 * Default value is 37.
	 */
	@NotNull
	private Integer height;

	/**
	 * Default value is 85.
	 */
	@NotNull
	private Integer width;

	/**
	 * No arg constructor.
	 */
	public Signature() {
		super();
	}

	/**
	 * Getter for signer_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#signer_id signer_id}.
	 */
	public String getSigner_id() {
		return this.signer_id;
	}

	/**
	 * Getter for Type.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#Type Type}.
	 */
	public SignatureTypeValue getType() {
		return this.Type;
	}

	/**
	 * Getter for page.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#page page}.
	 */
	public Integer getPage() {
		return this.page;
	}

	/**
	 * Getter for x.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#x x}.
	 */
	public Integer getX() {
		return this.x;
	}

	/**
	 * Getter for y.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#y y}.
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Getter for height.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#height height}.
	 */
	public Integer getHeight() {
		return this.height;
	}

	/**
	 * Getter for width.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#width width}.
	 */
	public Integer getWidth() {
		return this.width;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#signer_id signer_id}.
	 * @param signer_id value to set
	 */
	public void setSigner_id(String signer_id) {
		this.signer_id = signer_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#Type Type}.
	 * @param Type value to set
	 */
	public void setType(SignatureTypeValue Type) {
		this.Type = Type;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#page page}.
	 * @param page value to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#x x}.
	 * @param x value to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#y y}.
	 * @param y value to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#height height}.
	 * @param height value to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signature#width width}.
	 * @param width value to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}
}
