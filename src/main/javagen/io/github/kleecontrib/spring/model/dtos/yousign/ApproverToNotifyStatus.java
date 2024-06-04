////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.ApproverToNotifyStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Status.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class ApproverToNotifyStatus implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private ApproverToNotifyStatusValue Value;

	/**
	 * No arg constructor.
	 */
	public ApproverToNotifyStatus() {
	}

	public static final ApproverToNotifyStatus initiated = new ApproverToNotifyStatus(ApproverToNotifyStatusValue.initiated);
	public static final ApproverToNotifyStatus notified = new ApproverToNotifyStatus(ApproverToNotifyStatusValue.notified);
	public static final ApproverToNotifyStatus approved = new ApproverToNotifyStatus(ApproverToNotifyStatusValue.approved);
	public static final ApproverToNotifyStatus rejected = new ApproverToNotifyStatus(ApproverToNotifyStatusValue.rejected);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public ApproverToNotifyStatus(ApproverToNotifyStatusValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ApproverToNotifyStatus#Value Value}.
	 */
	public ApproverToNotifyStatusValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ApproverToNotifyStatus#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(ApproverToNotifyStatusValue Value) {
		this.Value = Value;
	}
}
