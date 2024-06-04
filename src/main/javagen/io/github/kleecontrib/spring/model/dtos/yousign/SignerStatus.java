////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignerStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Status.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignerStatus implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignerStatusValue Value;

	/**
	 * No arg constructor.
	 */
	public SignerStatus() {
	}

	public static final SignerStatus initiated = new SignerStatus(SignerStatusValue.initiated);
	public static final SignerStatus declined = new SignerStatus(SignerStatusValue.declined);
	public static final SignerStatus notified = new SignerStatus(SignerStatusValue.notified);
	public static final SignerStatus verified = new SignerStatus(SignerStatusValue.verified);
	public static final SignerStatus processing = new SignerStatus(SignerStatusValue.processing);
	public static final SignerStatus consent_given = new SignerStatus(SignerStatusValue.consent_given);
	public static final SignerStatus signed = new SignerStatus(SignerStatusValue.signed);
	public static final SignerStatus aborted = new SignerStatus(SignerStatusValue.aborted);
	public static final SignerStatus error = new SignerStatus(SignerStatusValue.error);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignerStatus(SignerStatusValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerStatus#Value Value}.
	 */
	public SignerStatusValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerStatus#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignerStatusValue Value) {
		this.Value = Value;
	}
}
