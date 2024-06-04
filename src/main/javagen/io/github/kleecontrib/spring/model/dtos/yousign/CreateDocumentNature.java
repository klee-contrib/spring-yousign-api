////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateDocumentNatureValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Nature.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateDocumentNature implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private CreateDocumentNatureValue Value;

	/**
	 * No arg constructor.
	 */
	public CreateDocumentNature() {
	}

	public static final CreateDocumentNature attachment = new CreateDocumentNature(CreateDocumentNatureValue.attachment);
	public static final CreateDocumentNature signable_document = new CreateDocumentNature(CreateDocumentNatureValue.signable_document);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public CreateDocumentNature(CreateDocumentNatureValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocumentNature#Value Value}.
	 */
	public CreateDocumentNatureValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocumentNature#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(CreateDocumentNatureValue Value) {
		this.Value = Value;
	}
}
