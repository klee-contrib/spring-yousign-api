////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.GetSignatureRequestsStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de status.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class GetSignatureRequestsStatus implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private GetSignatureRequestsStatusValue Value;

	/**
	 * No arg constructor.
	 */
	public GetSignatureRequestsStatus() {
	}

	public static final GetSignatureRequestsStatus draft = new GetSignatureRequestsStatus(GetSignatureRequestsStatusValue.draft);
	public static final GetSignatureRequestsStatus ongoing = new GetSignatureRequestsStatus(GetSignatureRequestsStatusValue.ongoing);
	public static final GetSignatureRequestsStatus done = new GetSignatureRequestsStatus(GetSignatureRequestsStatusValue.done);
	public static final GetSignatureRequestsStatus deleted = new GetSignatureRequestsStatus(GetSignatureRequestsStatusValue.deleted);
	public static final GetSignatureRequestsStatus expired = new GetSignatureRequestsStatus(GetSignatureRequestsStatusValue.expired);
	public static final GetSignatureRequestsStatus canceled = new GetSignatureRequestsStatus(GetSignatureRequestsStatusValue.canceled);
	public static final GetSignatureRequestsStatus approval = new GetSignatureRequestsStatus(GetSignatureRequestsStatusValue.approval);
	public static final GetSignatureRequestsStatus rejected = new GetSignatureRequestsStatus(GetSignatureRequestsStatusValue.rejected);
	public static final GetSignatureRequestsStatus declined = new GetSignatureRequestsStatus(GetSignatureRequestsStatusValue.declined);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public GetSignatureRequestsStatus(GetSignatureRequestsStatusValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequestsStatus#Value Value}.
	 */
	public GetSignatureRequestsStatusValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequestsStatus#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(GetSignatureRequestsStatusValue Value) {
		this.Value = Value;
	}
}
