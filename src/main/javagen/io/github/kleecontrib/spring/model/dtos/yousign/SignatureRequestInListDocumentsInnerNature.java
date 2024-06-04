////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestInListDocumentsInnerNatureValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Nature.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestInListDocumentsInnerNature implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestInListDocumentsInnerNatureValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestInListDocumentsInnerNature() {
	}

	public static final SignatureRequestInListDocumentsInnerNature attachment = new SignatureRequestInListDocumentsInnerNature(SignatureRequestInListDocumentsInnerNatureValue.attachment);
	public static final SignatureRequestInListDocumentsInnerNature signable_document = new SignatureRequestInListDocumentsInnerNature(SignatureRequestInListDocumentsInnerNatureValue.signable_document);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestInListDocumentsInnerNature(SignatureRequestInListDocumentsInnerNatureValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListDocumentsInnerNature#Value Value}.
	 */
	public SignatureRequestInListDocumentsInnerNatureValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListDocumentsInnerNature#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestInListDocumentsInnerNatureValue Value) {
		this.Value = Value;
	}
}
