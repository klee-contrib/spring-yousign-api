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
public class PostSignatureRequestsSignatureRequestIdReactivateRequest implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Due date of the Signature Request (yyyy-mm-dd). Default to 6 month after the activation.
	 */
	@NotNull
	private String expiration_date;

	/**
	 * No arg constructor.
	 */
	public PostSignatureRequestsSignatureRequestIdReactivateRequest() {
	}

	/**
	 * Getter for expiration_date.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdReactivateRequest#expiration_date expiration_date}.
	 */
	public String getExpiration_date() {
		return this.expiration_date;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdReactivateRequest#expiration_date expiration_date}.
	 * @param expiration_date value to set
	 */
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}
}
