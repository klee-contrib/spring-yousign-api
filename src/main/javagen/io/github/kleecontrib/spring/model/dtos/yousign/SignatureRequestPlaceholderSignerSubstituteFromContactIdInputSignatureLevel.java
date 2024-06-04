////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel() {
	}

	public static final SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel electronic_signature = new SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue.electronic_signature);
	public static final SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel advanced_electronic_signature = new SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue.advanced_electronic_signature);
	public static final SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel electronic_signature_with_qualified_certificate = new SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue.electronic_signature_with_qualified_certificate);
	public static final SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel qualified_electronic_signature = new SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue.qualified_electronic_signature);
	public static final SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel qualified_electronic_signature_mode_1 = new SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue.qualified_electronic_signature_mode_1);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel#Value Value}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue Value) {
		this.Value = Value;
	}
}
