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
public class CreateSignatureRequestMetadata implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private UpdateSignatureRequestMetadataDataValue data;

	/**
	 * No arg constructor.
	 */
	public CreateSignatureRequestMetadata() {
	}

	/**
	 * Getter for data.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestMetadata#data data}.
	 */
	public UpdateSignatureRequestMetadataDataValue getData() {
		return this.data;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestMetadata#data data}.
	 * @param data value to set
	 */
	public void setData(UpdateSignatureRequestMetadataDataValue data) {
		this.data = data;
	}
}
