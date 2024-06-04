////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel() {
	}

	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel electronic_signature = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue.electronic_signature);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel advanced_electronic_signature = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue.advanced_electronic_signature);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel electronic_signature_with_qualified_certificate = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue.electronic_signature_with_qualified_certificate);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel qualified_electronic_signature = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue.qualified_electronic_signature);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel qualified_electronic_signature_mode_1 = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue.qualified_electronic_signature_mode_1);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel#Value Value}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue Value) {
		this.Value = Value;
	}
}
