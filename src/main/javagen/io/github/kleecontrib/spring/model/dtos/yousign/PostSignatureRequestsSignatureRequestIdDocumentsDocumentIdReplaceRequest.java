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
public class PostSignatureRequestsSignatureRequestIdDocumentsDocumentIdReplaceRequest implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private byte[] file;

	/**
	 * No arg constructor.
	 */
	public PostSignatureRequestsSignatureRequestIdDocumentsDocumentIdReplaceRequest() {
	}

	/**
	 * Getter for file.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdDocumentsDocumentIdReplaceRequest#file file}.
	 */
	public byte[] getFile() {
		return this.file;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdDocumentsDocumentIdReplaceRequest#file file}.
	 * @param file value to set
	 */
	public void setFile(byte[] file) {
		this.file = file;
	}
}
