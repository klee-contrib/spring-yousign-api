////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.GetSignatureRequestsSignatureRequestIdDocumentsNatureValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de nature.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class GetSignatureRequestsSignatureRequestIdDocumentsNature implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private GetSignatureRequestsSignatureRequestIdDocumentsNatureValue Value;

	/**
	 * No arg constructor.
	 */
	public GetSignatureRequestsSignatureRequestIdDocumentsNature() {
	}

	public static final GetSignatureRequestsSignatureRequestIdDocumentsNature attachment = new GetSignatureRequestsSignatureRequestIdDocumentsNature(GetSignatureRequestsSignatureRequestIdDocumentsNatureValue.attachment);
	public static final GetSignatureRequestsSignatureRequestIdDocumentsNature signable_document = new GetSignatureRequestsSignatureRequestIdDocumentsNature(GetSignatureRequestsSignatureRequestIdDocumentsNatureValue.signable_document);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public GetSignatureRequestsSignatureRequestIdDocumentsNature(GetSignatureRequestsSignatureRequestIdDocumentsNatureValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequestsSignatureRequestIdDocumentsNature#Value Value}.
	 */
	public GetSignatureRequestsSignatureRequestIdDocumentsNatureValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequestsSignatureRequestIdDocumentsNature#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(GetSignatureRequestsSignatureRequestIdDocumentsNatureValue Value) {
		this.Value = Value;
	}
}
