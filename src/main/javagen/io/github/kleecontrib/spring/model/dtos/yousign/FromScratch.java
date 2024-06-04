////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;

/**
 * Create a new Approver from scratch.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromScratch extends PostSignatureRequestsSignatureRequestIdApproversRequest implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private FromScratchInfo info;

	/**
	 * No arg constructor.
	 */
	public FromScratch() {
		super();
	}

	/**
	 * Getter for info.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch#info info}.
	 */
	public FromScratchInfo getInfo() {
		return this.info;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch#info info}.
	 * @param info value to set
	 */
	public void setInfo(FromScratchInfo info) {
		this.info = info;
	}
}
