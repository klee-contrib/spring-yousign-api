////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.UpdateSignerSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateSignerSignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private UpdateSignerSignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public UpdateSignerSignatureLevel() {
	}

	public static final UpdateSignerSignatureLevel electronic_signature = new UpdateSignerSignatureLevel(UpdateSignerSignatureLevelValue.electronic_signature);
	public static final UpdateSignerSignatureLevel advanced_electronic_signature = new UpdateSignerSignatureLevel(UpdateSignerSignatureLevelValue.advanced_electronic_signature);
	public static final UpdateSignerSignatureLevel electronic_signature_with_qualified_certificate = new UpdateSignerSignatureLevel(UpdateSignerSignatureLevelValue.electronic_signature_with_qualified_certificate);
	public static final UpdateSignerSignatureLevel qualified_electronic_signature = new UpdateSignerSignatureLevel(UpdateSignerSignatureLevelValue.qualified_electronic_signature);
	public static final UpdateSignerSignatureLevel qualified_electronic_signature_mode_1 = new UpdateSignerSignatureLevel(UpdateSignerSignatureLevelValue.qualified_electronic_signature_mode_1);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public UpdateSignerSignatureLevel(UpdateSignerSignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignerSignatureLevel#Value Value}.
	 */
	public UpdateSignerSignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignerSignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(UpdateSignerSignatureLevelValue Value) {
		this.Value = Value;
	}
}
