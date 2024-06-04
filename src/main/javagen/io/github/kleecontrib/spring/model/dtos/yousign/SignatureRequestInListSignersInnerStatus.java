////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestInListSignersInnerStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Status.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestInListSignersInnerStatus implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestInListSignersInnerStatusValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestInListSignersInnerStatus() {
	}

	public static final SignatureRequestInListSignersInnerStatus initiated = new SignatureRequestInListSignersInnerStatus(SignatureRequestInListSignersInnerStatusValue.initiated);
	public static final SignatureRequestInListSignersInnerStatus declined = new SignatureRequestInListSignersInnerStatus(SignatureRequestInListSignersInnerStatusValue.declined);
	public static final SignatureRequestInListSignersInnerStatus notified = new SignatureRequestInListSignersInnerStatus(SignatureRequestInListSignersInnerStatusValue.notified);
	public static final SignatureRequestInListSignersInnerStatus verified = new SignatureRequestInListSignersInnerStatus(SignatureRequestInListSignersInnerStatusValue.verified);
	public static final SignatureRequestInListSignersInnerStatus processing = new SignatureRequestInListSignersInnerStatus(SignatureRequestInListSignersInnerStatusValue.processing);
	public static final SignatureRequestInListSignersInnerStatus consent_given = new SignatureRequestInListSignersInnerStatus(SignatureRequestInListSignersInnerStatusValue.consent_given);
	public static final SignatureRequestInListSignersInnerStatus signed = new SignatureRequestInListSignersInnerStatus(SignatureRequestInListSignersInnerStatusValue.signed);
	public static final SignatureRequestInListSignersInnerStatus aborted = new SignatureRequestInListSignersInnerStatus(SignatureRequestInListSignersInnerStatusValue.aborted);
	public static final SignatureRequestInListSignersInnerStatus error = new SignatureRequestInListSignersInnerStatus(SignatureRequestInListSignersInnerStatusValue.error);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestInListSignersInnerStatus(SignatureRequestInListSignersInnerStatusValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListSignersInnerStatus#Value Value}.
	 */
	public SignatureRequestInListSignersInnerStatusValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListSignersInnerStatus#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestInListSignersInnerStatusValue Value) {
		this.Value = Value;
	}
}
