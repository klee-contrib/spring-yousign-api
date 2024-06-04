////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel() {
	}

	public static final SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel electronic_signature = new SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue.electronic_signature);
	public static final SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel advanced_electronic_signature = new SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue.advanced_electronic_signature);
	public static final SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel electronic_signature_with_qualified_certificate = new SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue.electronic_signature_with_qualified_certificate);
	public static final SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel qualified_electronic_signature = new SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue.qualified_electronic_signature);
	public static final SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel qualified_electronic_signature_mode_1 = new SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue.qualified_electronic_signature_mode_1);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel#Value Value}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue Value) {
		this.Value = Value;
	}
}
