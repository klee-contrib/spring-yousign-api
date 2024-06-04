////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import io.github.kleecontrib.spring.model.enums.yousign.FieldRadioButtonGroupTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FieldRadioButtonGroup implements Serializable {
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
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroupType#getValue() FieldRadioButtonGroupType#getValue()} 
	 */
	@NotNull
	private FieldRadioButtonGroupTypeValue Type;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer page;

	/**
	 * Does the Signer has to select one of the radio buttons from this group?.
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
	private List<FieldRadioButtonGroupRadiosInner> radios;

	/**
	 * No arg constructor.
	 */
	public FieldRadioButtonGroup() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for document_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#document_id document_id}.
	 */
	public String getDocument_id() {
		return this.document_id;
	}

	/**
	 * Getter for signer_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#signer_id signer_id}.
	 */
	public String getSigner_id() {
		return this.signer_id;
	}

	/**
	 * Getter for Type.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#Type Type}.
	 */
	public FieldRadioButtonGroupTypeValue getType() {
		return this.Type;
	}

	/**
	 * Getter for page.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#page page}.
	 */
	public Integer getPage() {
		return this.page;
	}

	/**
	 * Getter for optional.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#optional optional}.
	 */
	public Boolean getOptional() {
		return this.optional;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for radios.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#radios radios}.
	 */
	public List<FieldRadioButtonGroupRadiosInner> getRadios() {
		return this.radios;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#document_id document_id}.
	 * @param document_id value to set
	 */
	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#signer_id signer_id}.
	 * @param signer_id value to set
	 */
	public void setSigner_id(String signer_id) {
		this.signer_id = signer_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#Type Type}.
	 * @param Type value to set
	 */
	public void setType(FieldRadioButtonGroupTypeValue Type) {
		this.Type = Type;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#page page}.
	 * @param page value to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#optional optional}.
	 * @param optional value to set
	 */
	public void setOptional(Boolean optional) {
		this.optional = optional;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FieldRadioButtonGroup#radios radios}.
	 * @param radios value to set
	 */
	public void setRadios(List<FieldRadioButtonGroupRadiosInner> radios) {
		this.radios = radios;
	}
}
