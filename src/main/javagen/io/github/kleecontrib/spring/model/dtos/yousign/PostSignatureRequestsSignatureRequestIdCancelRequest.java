////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.PostSignatureRequestsSignatureRequestIdCancelRequestReasonValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class PostSignatureRequestsSignatureRequestIdCancelRequest implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdCancelRequestReason#getValue() PostSignatureRequestsSignatureRequestIdCancelRequestReason#getValue()} 
	 */
	@NotNull
	private PostSignatureRequestsSignatureRequestIdCancelRequestReasonValue Reason;

	/**
	 * Non documenté.
	 */
	private String custom_note;

	/**
	 * No arg constructor.
	 */
	public PostSignatureRequestsSignatureRequestIdCancelRequest() {
	}

	/**
	 * Getter for Reason.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdCancelRequest#Reason Reason}.
	 */
	public PostSignatureRequestsSignatureRequestIdCancelRequestReasonValue getReason() {
		return this.Reason;
	}

	/**
	 * Getter for custom_note.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdCancelRequest#custom_note custom_note}.
	 */
	public String getCustom_note() {
		return this.custom_note;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdCancelRequest#Reason Reason}.
	 * @param Reason value to set
	 */
	public void setReason(PostSignatureRequestsSignatureRequestIdCancelRequestReasonValue Reason) {
		this.Reason = Reason;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdCancelRequest#custom_note custom_note}.
	 * @param custom_note value to set
	 */
	public void setCustom_note(String custom_note) {
		this.custom_note = custom_note;
	}
}
