////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Create a new Approver from an existing User.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromExistingUser extends PostSignatureRequestsSignatureRequestIdApproversRequest implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String user_id;

	/**
	 * No arg constructor.
	 */
	public FromExistingUser() {
		super();
	}

	/**
	 * Getter for user_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingUser#user_id user_id}.
	 */
	public String getUser_id() {
		return this.user_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingUser#user_id user_id}.
	 * @param user_id value to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
}
