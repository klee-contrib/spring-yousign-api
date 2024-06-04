////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestInListSignersInnerStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestInListSignersInner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListSignersInnerStatus#getValue() SignatureRequestInListSignersInnerStatus#getValue()} 
	 */
	@NotNull
	private SignatureRequestInListSignersInnerStatusValue Status;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestInListSignersInner() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListSignersInner#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for Status.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListSignersInner#Status Status}.
	 */
	public SignatureRequestInListSignersInnerStatusValue getStatus() {
		return this.Status;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListSignersInner#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListSignersInner#Status Status}.
	 * @param Status value to set
	 */
	public void setStatus(SignatureRequestInListSignersInnerStatusValue Status) {
		this.Status = Status;
	}
}
