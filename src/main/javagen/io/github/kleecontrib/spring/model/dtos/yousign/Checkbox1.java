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
public class Checkbox1 extends UpdateField implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String signer_id;

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
	private Integer size;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean optional;

	/**
	 * Non documenté.
	 */
	private String name;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean checked;

	/**
	 * No arg constructor.
	 */
	public Checkbox1() {
		super();
	}

	/**
	 * Getter for signer_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#signer_id signer_id}.
	 */
	public String getSigner_id() {
		return this.signer_id;
	}

	/**
	 * Getter for page.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#page page}.
	 */
	public Integer getPage() {
		return this.page;
	}

	/**
	 * Getter for x.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#x x}.
	 */
	public Integer getX() {
		return this.x;
	}

	/**
	 * Getter for y.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#y y}.
	 */
	public Integer getY() {
		return this.y;
	}

	/**
	 * Getter for size.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#size size}.
	 */
	public Integer getSize() {
		return this.size;
	}

	/**
	 * Getter for optional.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#optional optional}.
	 */
	public Boolean getOptional() {
		return this.optional;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for checked.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#checked checked}.
	 */
	public Boolean getChecked() {
		return this.checked;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#signer_id signer_id}.
	 * @param signer_id value to set
	 */
	public void setSigner_id(String signer_id) {
		this.signer_id = signer_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#page page}.
	 * @param page value to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#x x}.
	 * @param x value to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#y y}.
	 * @param y value to set
	 */
	public void setY(Integer y) {
		this.y = y;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#size size}.
	 * @param size value to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#optional optional}.
	 * @param optional value to set
	 */
	public void setOptional(Boolean optional) {
		this.optional = optional;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Checkbox1#checked checked}.
	 * @param checked value to set
	 */
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
}
