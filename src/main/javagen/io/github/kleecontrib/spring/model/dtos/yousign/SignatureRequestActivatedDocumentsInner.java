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
public class SignatureRequestActivatedDocumentsInner implements Serializable {
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
	private String nature;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestActivatedDocumentsInner() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedDocumentsInner#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for nature.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedDocumentsInner#nature nature}.
	 */
	public String getNature() {
		return this.nature;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedDocumentsInner#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedDocumentsInner#nature nature}.
	 * @param nature value to set
	 */
	public void setNature(String nature) {
		this.nature = nature;
	}
}
