////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.UpdateDocumentNatureValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateDocument implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateDocumentNature#getValue() UpdateDocumentNature#getValue()} 
	 */
	@NotNull
	private UpdateDocumentNatureValue Nature;

	/**
	 * Insert just after the position of the specified document id.
	 */
	private String insert_after_id;

	/**
	 * The password required to unlock the document if it is protected.
	 */
	@NotNull
	private String password;

	/**
	 * Non documenté.
	 */
	private InitialsArea initials;

	/**
	 * No arg constructor.
	 */
	public UpdateDocument() {
	}

	/**
	 * Getter for Nature.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateDocument#Nature Nature}.
	 */
	public UpdateDocumentNatureValue getNature() {
		return this.Nature;
	}

	/**
	 * Getter for insert_after_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateDocument#insert_after_id insert_after_id}.
	 */
	public String getInsert_after_id() {
		return this.insert_after_id;
	}

	/**
	 * Getter for password.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateDocument#password password}.
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Getter for initials.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateDocument#initials initials}.
	 */
	public InitialsArea getInitials() {
		return this.initials;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateDocument#Nature Nature}.
	 * @param Nature value to set
	 */
	public void setNature(UpdateDocumentNatureValue Nature) {
		this.Nature = Nature;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateDocument#insert_after_id insert_after_id}.
	 * @param insert_after_id value to set
	 */
	public void setInsert_after_id(String insert_after_id) {
		this.insert_after_id = insert_after_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateDocument#password password}.
	 * @param password value to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateDocument#initials initials}.
	 * @param initials value to set
	 */
	public void setInitials(InitialsArea initials) {
		this.initials = initials;
	}
}
