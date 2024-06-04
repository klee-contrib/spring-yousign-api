////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSignerFromUserIdInputSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestSignerFromUserIdInputSignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestSignerFromUserIdInputSignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestSignerFromUserIdInputSignatureLevel() {
	}

	public static final SignatureRequestSignerFromUserIdInputSignatureLevel electronic_signature = new SignatureRequestSignerFromUserIdInputSignatureLevel(SignatureRequestSignerFromUserIdInputSignatureLevelValue.electronic_signature);
	public static final SignatureRequestSignerFromUserIdInputSignatureLevel advanced_electronic_signature = new SignatureRequestSignerFromUserIdInputSignatureLevel(SignatureRequestSignerFromUserIdInputSignatureLevelValue.advanced_electronic_signature);
	public static final SignatureRequestSignerFromUserIdInputSignatureLevel electronic_signature_with_qualified_certificate = new SignatureRequestSignerFromUserIdInputSignatureLevel(SignatureRequestSignerFromUserIdInputSignatureLevelValue.electronic_signature_with_qualified_certificate);
	public static final SignatureRequestSignerFromUserIdInputSignatureLevel qualified_electronic_signature = new SignatureRequestSignerFromUserIdInputSignatureLevel(SignatureRequestSignerFromUserIdInputSignatureLevelValue.qualified_electronic_signature);
	public static final SignatureRequestSignerFromUserIdInputSignatureLevel qualified_electronic_signature_mode_1 = new SignatureRequestSignerFromUserIdInputSignatureLevel(SignatureRequestSignerFromUserIdInputSignatureLevelValue.qualified_electronic_signature_mode_1);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestSignerFromUserIdInputSignatureLevel(SignatureRequestSignerFromUserIdInputSignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromUserIdInputSignatureLevel#Value Value}.
	 */
	public SignatureRequestSignerFromUserIdInputSignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromUserIdInputSignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestSignerFromUserIdInputSignatureLevelValue Value) {
		this.Value = Value;
	}
}
