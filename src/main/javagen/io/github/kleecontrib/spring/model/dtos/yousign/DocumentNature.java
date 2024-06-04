////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.DocumentNatureValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Nature.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class DocumentNature implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private DocumentNatureValue Value;

	/**
	 * No arg constructor.
	 */
	public DocumentNature() {
	}

	public static final DocumentNature attachment = new DocumentNature(DocumentNatureValue.attachment);
	public static final DocumentNature signable_document = new DocumentNature(DocumentNatureValue.signable_document);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public DocumentNature(DocumentNatureValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.DocumentNature#Value Value}.
	 */
	public DocumentNatureValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.DocumentNature#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(DocumentNatureValue Value) {
		this.Value = Value;
	}
}
