////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSignerFromContactIdInputSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de SignatureLevel.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestSignerFromContactIdInputSignatureLevel implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestSignerFromContactIdInputSignatureLevelValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestSignerFromContactIdInputSignatureLevel() {
	}

	public static final SignatureRequestSignerFromContactIdInputSignatureLevel electronic_signature = new SignatureRequestSignerFromContactIdInputSignatureLevel(SignatureRequestSignerFromContactIdInputSignatureLevelValue.electronic_signature);
	public static final SignatureRequestSignerFromContactIdInputSignatureLevel advanced_electronic_signature = new SignatureRequestSignerFromContactIdInputSignatureLevel(SignatureRequestSignerFromContactIdInputSignatureLevelValue.advanced_electronic_signature);
	public static final SignatureRequestSignerFromContactIdInputSignatureLevel electronic_signature_with_qualified_certificate = new SignatureRequestSignerFromContactIdInputSignatureLevel(SignatureRequestSignerFromContactIdInputSignatureLevelValue.electronic_signature_with_qualified_certificate);
	public static final SignatureRequestSignerFromContactIdInputSignatureLevel qualified_electronic_signature = new SignatureRequestSignerFromContactIdInputSignatureLevel(SignatureRequestSignerFromContactIdInputSignatureLevelValue.qualified_electronic_signature);
	public static final SignatureRequestSignerFromContactIdInputSignatureLevel qualified_electronic_signature_mode_1 = new SignatureRequestSignerFromContactIdInputSignatureLevel(SignatureRequestSignerFromContactIdInputSignatureLevelValue.qualified_electronic_signature_mode_1);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestSignerFromContactIdInputSignatureLevel(SignatureRequestSignerFromContactIdInputSignatureLevelValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInputSignatureLevel#Value Value}.
	 */
	public SignatureRequestSignerFromContactIdInputSignatureLevelValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInputSignatureLevel#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestSignerFromContactIdInputSignatureLevelValue Value) {
		this.Value = Value;
	}
}
