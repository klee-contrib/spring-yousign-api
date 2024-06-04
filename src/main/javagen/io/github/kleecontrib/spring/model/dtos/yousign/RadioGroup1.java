////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class RadioGroup1 extends UpdateField implements Serializable {
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
	private Boolean optional;

	/**
	 * Radio group's name.
	 */
	private String name;

	/**
	 * Non documenté.
	 */
	private List<RadioGroup1RadiosInner> radios;

	/**
	 * No arg constructor.
	 */
	public RadioGroup1() {
		super();
	}

	/**
	 * Getter for signer_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup1#signer_id signer_id}.
	 */
	public String getSigner_id() {
		return this.signer_id;
	}

	/**
	 * Getter for page.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup1#page page}.
	 */
	public Integer getPage() {
		return this.page;
	}

	/**
	 * Getter for optional.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup1#optional optional}.
	 */
	public Boolean getOptional() {
		return this.optional;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup1#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for radios.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup1#radios radios}.
	 */
	public List<RadioGroup1RadiosInner> getRadios() {
		return this.radios;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup1#signer_id signer_id}.
	 * @param signer_id value to set
	 */
	public void setSigner_id(String signer_id) {
		this.signer_id = signer_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup1#page page}.
	 * @param page value to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup1#optional optional}.
	 * @param optional value to set
	 */
	public void setOptional(Boolean optional) {
		this.optional = optional;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup1#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup1#radios radios}.
	 * @param radios value to set
	 */
	public void setRadios(List<RadioGroup1RadiosInner> radios) {
		this.radios = radios;
	}
}
