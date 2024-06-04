////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de IntervalInDays.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateSignatureRequestReminderSettingsIntervalInDays implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer Value;

	/**
	 * No arg constructor.
	 */
	public UpdateSignatureRequestReminderSettingsIntervalInDays() {
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequestReminderSettingsIntervalInDays#Value Value}.
	 */
	public Integer getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequestReminderSettingsIntervalInDays#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(Integer Value) {
		this.Value = Value;
	}
}
