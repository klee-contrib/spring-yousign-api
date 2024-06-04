////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import jakarta.annotation.Generated;

/**
 * A list of Followers added to the Signature Request.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class GetSignatureRequestsSignatureRequestIdFollowers200Response implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private List<Follower> data;

	/**
	 * No arg constructor.
	 */
	public GetSignatureRequestsSignatureRequestIdFollowers200Response() {
	}

	/**
	 * Getter for data.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequestsSignatureRequestIdFollowers200Response#data data}.
	 */
	public List<Follower> getData() {
		return this.data;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequestsSignatureRequestIdFollowers200Response#data data}.
	 * @param data value to set
	 */
	public void setData(List<Follower> data) {
		this.data = data;
	}
}
