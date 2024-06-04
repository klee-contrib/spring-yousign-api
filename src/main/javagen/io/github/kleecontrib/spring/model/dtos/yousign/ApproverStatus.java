////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.ApproverStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Status.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class ApproverStatus implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private ApproverStatusValue Value;

	/**
	 * No arg constructor.
	 */
	public ApproverStatus() {
	}

	public static final ApproverStatus initiated = new ApproverStatus(ApproverStatusValue.initiated);
	public static final ApproverStatus notified = new ApproverStatus(ApproverStatusValue.notified);
	public static final ApproverStatus approved = new ApproverStatus(ApproverStatusValue.approved);
	public static final ApproverStatus rejected = new ApproverStatus(ApproverStatusValue.rejected);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public ApproverStatus(ApproverStatusValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ApproverStatus#Value Value}.
	 */
	public ApproverStatusValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ApproverStatus#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(ApproverStatusValue Value) {
		this.Value = Value;
	}
}
