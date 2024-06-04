////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.UpdateDocumentNatureValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Nature.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateDocumentNature implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private UpdateDocumentNatureValue Value;

	/**
	 * No arg constructor.
	 */
	public UpdateDocumentNature() {
	}

	public static final UpdateDocumentNature attachment = new UpdateDocumentNature(UpdateDocumentNatureValue.attachment);
	public static final UpdateDocumentNature signable_document = new UpdateDocumentNature(UpdateDocumentNatureValue.signable_document);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public UpdateDocumentNature(UpdateDocumentNatureValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateDocumentNature#Value Value}.
	 */
	public UpdateDocumentNatureValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateDocumentNature#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(UpdateDocumentNatureValue Value) {
		this.Value = Value;
	}
}
