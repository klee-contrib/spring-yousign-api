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
public class CreateSignatureRequestReminderSettingsIntervalInDays implements Serializable {
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
	public CreateSignatureRequestReminderSettingsIntervalInDays() {
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestReminderSettingsIntervalInDays#Value Value}.
	 */
	public Integer getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestReminderSettingsIntervalInDays#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(Integer Value) {
		this.Value = Value;
	}
}
