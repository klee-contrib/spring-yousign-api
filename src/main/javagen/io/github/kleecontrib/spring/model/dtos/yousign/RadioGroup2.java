////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import io.github.kleecontrib.spring.model.enums.yousign.RadioGroup2TypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class RadioGroup2 extends FieldsInput implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String document_id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2Type#getValue() RadioGroup2Type#getValue()} 
	 */
	@NotNull
	private RadioGroup2TypeValue Type;

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
	private List<RadioGroup2RadiosInner> radios;

	/**
	 * No arg constructor.
	 */
	public RadioGroup2() {
		super();
	}

	/**
	 * Getter for document_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2#document_id document_id}.
	 */
	public String getDocument_id() {
		return this.document_id;
	}

	/**
	 * Getter for Type.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2#Type Type}.
	 */
	public RadioGroup2TypeValue getType() {
		return this.Type;
	}

	/**
	 * Getter for page.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2#page page}.
	 */
	public Integer getPage() {
		return this.page;
	}

	/**
	 * Getter for optional.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2#optional optional}.
	 */
	public Boolean getOptional() {
		return this.optional;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for radios.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2#radios radios}.
	 */
	public List<RadioGroup2RadiosInner> getRadios() {
		return this.radios;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2#document_id document_id}.
	 * @param document_id value to set
	 */
	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2#Type Type}.
	 * @param Type value to set
	 */
	public void setType(RadioGroup2TypeValue Type) {
		this.Type = Type;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2#page page}.
	 * @param page value to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2#optional optional}.
	 * @param optional value to set
	 */
	public void setOptional(Boolean optional) {
		this.optional = optional;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.RadioGroup2#radios radios}.
	 * @param radios value to set
	 */
	public void setRadios(List<RadioGroup2RadiosInner> radios) {
		this.radios = radios;
	}
}
