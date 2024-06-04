////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Status.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestStatus implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestStatusValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestStatus() {
	}

	public static final SignatureRequestStatus draft = new SignatureRequestStatus(SignatureRequestStatusValue.draft);
	public static final SignatureRequestStatus ongoing = new SignatureRequestStatus(SignatureRequestStatusValue.ongoing);
	public static final SignatureRequestStatus done = new SignatureRequestStatus(SignatureRequestStatusValue.done);
	public static final SignatureRequestStatus deleted = new SignatureRequestStatus(SignatureRequestStatusValue.deleted);
	public static final SignatureRequestStatus expired = new SignatureRequestStatus(SignatureRequestStatusValue.expired);
	public static final SignatureRequestStatus canceled = new SignatureRequestStatus(SignatureRequestStatusValue.canceled);
	public static final SignatureRequestStatus approval = new SignatureRequestStatus(SignatureRequestStatusValue.approval);
	public static final SignatureRequestStatus rejected = new SignatureRequestStatus(SignatureRequestStatusValue.rejected);
	public static final SignatureRequestStatus declined = new SignatureRequestStatus(SignatureRequestStatusValue.declined);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestStatus(SignatureRequestStatusValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestStatus#Value Value}.
	 */
	public SignatureRequestStatusValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestStatus#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestStatusValue Value) {
		this.Value = Value;
	}
}
