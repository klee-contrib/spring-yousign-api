////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateSignatureRequestReminderSettings implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequestReminderSettingsIntervalInDays#getValue() UpdateSignatureRequestReminderSettingsIntervalInDays#getValue()} 
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
	public UpdateSignatureRequestReminderSettings() {
	}

	/**
	 * Getter for IntervalInDays.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequestReminderSettings#IntervalInDays IntervalInDays}.
	 */
	public Integer getIntervalInDays() {
		return this.IntervalInDays;
	}

	/**
	 * Getter for max_occurrences.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequestReminderSettings#max_occurrences max_occurrences}.
	 */
	public Integer getMax_occurrences() {
		return this.max_occurrences;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequestReminderSettings#IntervalInDays IntervalInDays}.
	 * @param IntervalInDays value to set
	 */
	public void setIntervalInDays(Integer IntervalInDays) {
		this.IntervalInDays = IntervalInDays;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequestReminderSettings#max_occurrences max_occurrences}.
	 * @param max_occurrences value to set
	 */
	public void setMax_occurrences(Integer max_occurrences) {
		this.max_occurrences = max_occurrences;
	}
}
