////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersionValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de version.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersion implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersionValue Value;

	/**
	 * No arg constructor.
	 */
	public GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersion() {
	}

	public static final GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersion current = new GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersion(GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersionValue.current);
	public static final GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersion completed = new GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersion(GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersionValue.completed);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersion(GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersionValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersion#Value Value}.
	 */
	public GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersionValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersion#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersionValue Value) {
		this.Value = Value;
	}
}
