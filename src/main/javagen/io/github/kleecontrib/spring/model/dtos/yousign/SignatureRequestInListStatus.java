////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestInListStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Status.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestInListStatus implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestInListStatusValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestInListStatus() {
	}

	public static final SignatureRequestInListStatus draft = new SignatureRequestInListStatus(SignatureRequestInListStatusValue.draft);
	public static final SignatureRequestInListStatus ongoing = new SignatureRequestInListStatus(SignatureRequestInListStatusValue.ongoing);
	public static final SignatureRequestInListStatus done = new SignatureRequestInListStatus(SignatureRequestInListStatusValue.done);
	public static final SignatureRequestInListStatus deleted = new SignatureRequestInListStatus(SignatureRequestInListStatusValue.deleted);
	public static final SignatureRequestInListStatus expired = new SignatureRequestInListStatus(SignatureRequestInListStatusValue.expired);
	public static final SignatureRequestInListStatus canceled = new SignatureRequestInListStatus(SignatureRequestInListStatusValue.canceled);
	public static final SignatureRequestInListStatus approval = new SignatureRequestInListStatus(SignatureRequestInListStatusValue.approval);
	public static final SignatureRequestInListStatus rejected = new SignatureRequestInListStatus(SignatureRequestInListStatusValue.rejected);
	public static final SignatureRequestInListStatus declined = new SignatureRequestInListStatus(SignatureRequestInListStatusValue.declined);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestInListStatus(SignatureRequestInListStatusValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListStatus#Value Value}.
	 */
	public SignatureRequestInListStatusValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListStatus#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestInListStatusValue Value) {
		this.Value = Value;
	}
}
