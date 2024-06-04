////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestInListDocumentsInnerNatureValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestInListDocumentsInner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListDocumentsInnerNature#getValue() SignatureRequestInListDocumentsInnerNature#getValue()} 
	 */
	@NotNull
	private SignatureRequestInListDocumentsInnerNatureValue Nature;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestInListDocumentsInner() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListDocumentsInner#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for Nature.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListDocumentsInner#Nature Nature}.
	 */
	public SignatureRequestInListDocumentsInnerNatureValue getNature() {
		return this.Nature;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListDocumentsInner#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListDocumentsInner#Nature Nature}.
	 * @param Nature value to set
	 */
	public void setNature(SignatureRequestInListDocumentsInnerNatureValue Nature) {
		this.Nature = Nature;
	}
}
