////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSignerFromInfoInputSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestSignerFromInfoInputSignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestSignerFromInfoInputSignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestSignerFromInfoInputSignatureLevel() {
	}

	public static final SignatureRequestSignerFromInfoInputSignatureLevel electronic_signature = new SignatureRequestSignerFromInfoInputSignatureLevel(SignatureRequestSignerFromInfoInputSignatureLevelValue.electronic_signature);
	public static final SignatureRequestSignerFromInfoInputSignatureLevel advanced_electronic_signature = new SignatureRequestSignerFromInfoInputSignatureLevel(SignatureRequestSignerFromInfoInputSignatureLevelValue.advanced_electronic_signature);
	public static final SignatureRequestSignerFromInfoInputSignatureLevel electronic_signature_with_qualified_certificate = new SignatureRequestSignerFromInfoInputSignatureLevel(SignatureRequestSignerFromInfoInputSignatureLevelValue.electronic_signature_with_qualified_certificate);
	public static final SignatureRequestSignerFromInfoInputSignatureLevel qualified_electronic_signature = new SignatureRequestSignerFromInfoInputSignatureLevel(SignatureRequestSignerFromInfoInputSignatureLevelValue.qualified_electronic_signature);
	public static final SignatureRequestSignerFromInfoInputSignatureLevel qualified_electronic_signature_mode_1 = new SignatureRequestSignerFromInfoInputSignatureLevel(SignatureRequestSignerFromInfoInputSignatureLevelValue.qualified_electronic_signature_mode_1);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestSignerFromInfoInputSignatureLevel(SignatureRequestSignerFromInfoInputSignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInputSignatureLevel#Value Value}.
	 */
	public SignatureRequestSignerFromInfoInputSignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInputSignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestSignerFromInfoInputSignatureLevelValue Value) {
		this.Value = Value;
	}
}
