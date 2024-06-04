////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequest implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo info;

	/**
	 * No arg constructor.
	 */
	public PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequest() {
	}

	/**
	 * Getter for info.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequest#info info}.
	 */
	public PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo getInfo() {
		return this.info;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequest#info info}.
	 * @param info value to set
	 */
	public void setInfo(PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo info) {
		this.info = info;
	}
}
