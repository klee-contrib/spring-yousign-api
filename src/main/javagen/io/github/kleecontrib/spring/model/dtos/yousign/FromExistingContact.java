////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Create a new Approver from an existing Contact.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromExistingContact extends PostSignatureRequestsSignatureRequestIdApproversRequest implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String contact_id;

	/**
	 * No arg constructor.
	 */
	public FromExistingContact() {
		super();
	}

	/**
	 * Getter for contact_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact#contact_id contact_id}.
	 */
	public String getContact_id() {
		return this.contact_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact#contact_id contact_id}.
	 * @param contact_id value to set
	 */
	public void setContact_id(String contact_id) {
		this.contact_id = contact_id;
	}
}
