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
public class SignatureRequestDeclineInformation implements Serializable {
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
	private String reason;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String declined_at;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestDeclineInformation() {
	}

	/**
	 * Getter for signer_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestDeclineInformation#signer_id signer_id}.
	 */
	public String getSigner_id() {
		return this.signer_id;
	}

	/**
	 * Getter for reason.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestDeclineInformation#reason reason}.
	 */
	public String getReason() {
		return this.reason;
	}

	/**
	 * Getter for declined_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestDeclineInformation#declined_at declined_at}.
	 */
	public String getDeclined_at() {
		return this.declined_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestDeclineInformation#signer_id signer_id}.
	 * @param signer_id value to set
	 */
	public void setSigner_id(String signer_id) {
		this.signer_id = signer_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestDeclineInformation#reason reason}.
	 * @param reason value to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestDeclineInformation#declined_at declined_at}.
	 * @param declined_at value to set
	 */
	public void setDeclined_at(String declined_at) {
		this.declined_at = declined_at;
	}
}
