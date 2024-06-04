////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignerSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignerSignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignerSignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public SignerSignatureLevel() {
	}

	public static final SignerSignatureLevel electronic_signature = new SignerSignatureLevel(SignerSignatureLevelValue.electronic_signature);
	public static final SignerSignatureLevel advanced_electronic_signature = new SignerSignatureLevel(SignerSignatureLevelValue.advanced_electronic_signature);
	public static final SignerSignatureLevel electronic_signature_with_qualified_certificate = new SignerSignatureLevel(SignerSignatureLevelValue.electronic_signature_with_qualified_certificate);
	public static final SignerSignatureLevel qualified_electronic_signature = new SignerSignatureLevel(SignerSignatureLevelValue.qualified_electronic_signature);
	public static final SignerSignatureLevel qualified_electronic_signature_mode_1 = new SignerSignatureLevel(SignerSignatureLevelValue.qualified_electronic_signature_mode_1);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignerSignatureLevel(SignerSignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerSignatureLevel#Value Value}.
	 */
	public SignerSignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerSignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignerSignatureLevelValue Value) {
		this.Value = Value;
	}
}
