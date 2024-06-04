////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.PostSignatureRequestsSignatureRequestIdCancelRequestReasonValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Reason.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class PostSignatureRequestsSignatureRequestIdCancelRequestReason implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private PostSignatureRequestsSignatureRequestIdCancelRequestReasonValue Value;

	/**
	 * No arg constructor.
	 */
	public PostSignatureRequestsSignatureRequestIdCancelRequestReason() {
	}

	public static final PostSignatureRequestsSignatureRequestIdCancelRequestReason contractualization_aborted = new PostSignatureRequestsSignatureRequestIdCancelRequestReason(PostSignatureRequestsSignatureRequestIdCancelRequestReasonValue.contractualization_aborted);
	public static final PostSignatureRequestsSignatureRequestIdCancelRequestReason errors_in_document = new PostSignatureRequestsSignatureRequestIdCancelRequestReason(PostSignatureRequestsSignatureRequestIdCancelRequestReasonValue.errors_in_document);
	public static final PostSignatureRequestsSignatureRequestIdCancelRequestReason other = new PostSignatureRequestsSignatureRequestIdCancelRequestReason(PostSignatureRequestsSignatureRequestIdCancelRequestReasonValue.other);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public PostSignatureRequestsSignatureRequestIdCancelRequestReason(PostSignatureRequestsSignatureRequestIdCancelRequestReasonValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdCancelRequestReason#Value Value}.
	 */
	public PostSignatureRequestsSignatureRequestIdCancelRequestReasonValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdCancelRequestReason#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(PostSignatureRequestsSignatureRequestIdCancelRequestReasonValue Value) {
		this.Value = Value;
	}
}
