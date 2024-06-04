////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Enable automatic reminders for pending signers.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateSignatureRequestReminderSettings implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestReminderSettingsIntervalInDays#getValue() CreateSignatureRequestReminderSettingsIntervalInDays#getValue()} 
	 */
	@NotNull
	private Integer IntervalInDays;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer max_occurrences;

	/**
	 * No arg constructor.
	 */
	public CreateSignatureRequestReminderSettings() {
	}

	/**
	 * Getter for IntervalInDays.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestReminderSettings#IntervalInDays IntervalInDays}.
	 */
	public Integer getIntervalInDays() {
		return this.IntervalInDays;
	}

	/**
	 * Getter for max_occurrences.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestReminderSettings#max_occurrences max_occurrences}.
	 */
	public Integer getMax_occurrences() {
		return this.max_occurrences;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestReminderSettings#IntervalInDays IntervalInDays}.
	 * @param IntervalInDays value to set
	 */
	public void setIntervalInDays(Integer IntervalInDays) {
		this.IntervalInDays = IntervalInDays;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestReminderSettings#max_occurrences max_occurrences}.
	 * @param max_occurrences value to set
	 */
	public void setMax_occurrences(Integer max_occurrences) {
		this.max_occurrences = max_occurrences;
	}
}
