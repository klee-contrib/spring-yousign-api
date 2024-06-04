////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.DocumentInitialsAlignmentValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Alignment.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class DocumentInitialsAlignment implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Initials alignment on the document.
	 */
	@NotNull
	private DocumentInitialsAlignmentValue Value;

	/**
	 * No arg constructor.
	 */
	public DocumentInitialsAlignment() {
	}

	public static final DocumentInitialsAlignment left = new DocumentInitialsAlignment(DocumentInitialsAlignmentValue.left);
	public static final DocumentInitialsAlignment center = new DocumentInitialsAlignment(DocumentInitialsAlignmentValue.center);
	public static final DocumentInitialsAlignment right = new DocumentInitialsAlignment(DocumentInitialsAlignmentValue.right);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public DocumentInitialsAlignment(DocumentInitialsAlignmentValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.DocumentInitialsAlignment#Value Value}.
	 */
	public DocumentInitialsAlignmentValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.DocumentInitialsAlignment#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(DocumentInitialsAlignmentValue Value) {
		this.Value = Value;
	}
}
