////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestInListApproversInnerStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Status.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestInListApproversInnerStatus implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestInListApproversInnerStatusValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestInListApproversInnerStatus() {
	}

	public static final SignatureRequestInListApproversInnerStatus initiated = new SignatureRequestInListApproversInnerStatus(SignatureRequestInListApproversInnerStatusValue.initiated);
	public static final SignatureRequestInListApproversInnerStatus notified = new SignatureRequestInListApproversInnerStatus(SignatureRequestInListApproversInnerStatusValue.notified);
	public static final SignatureRequestInListApproversInnerStatus approved = new SignatureRequestInListApproversInnerStatus(SignatureRequestInListApproversInnerStatusValue.approved);
	public static final SignatureRequestInListApproversInnerStatus rejected = new SignatureRequestInListApproversInnerStatus(SignatureRequestInListApproversInnerStatusValue.rejected);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestInListApproversInnerStatus(SignatureRequestInListApproversInnerStatusValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListApproversInnerStatus#Value Value}.
	 */
	public SignatureRequestInListApproversInnerStatusValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListApproversInnerStatus#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestInListApproversInnerStatusValue Value) {
		this.Value = Value;
	}
}
