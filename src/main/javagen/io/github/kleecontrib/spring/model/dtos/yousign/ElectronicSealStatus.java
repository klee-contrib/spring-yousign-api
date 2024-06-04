////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.ElectronicSealStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Status.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class ElectronicSealStatus implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private ElectronicSealStatusValue Value;

	/**
	 * No arg constructor.
	 */
	public ElectronicSealStatus() {
	}

	public static final ElectronicSealStatus pending = new ElectronicSealStatus(ElectronicSealStatusValue.pending);
	public static final ElectronicSealStatus processing = new ElectronicSealStatus(ElectronicSealStatusValue.processing);
	public static final ElectronicSealStatus done = new ElectronicSealStatus(ElectronicSealStatusValue.done);
	public static final ElectronicSealStatus error = new ElectronicSealStatus(ElectronicSealStatusValue.error);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public ElectronicSealStatus(ElectronicSealStatusValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealStatus#Value Value}.
	 */
	public ElectronicSealStatusValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealStatus#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(ElectronicSealStatusValue Value) {
		this.Value = Value;
	}
}
