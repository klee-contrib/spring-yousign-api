////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.TemplateStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Status.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class TemplateStatus implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private TemplateStatusValue Value;

	/**
	 * No arg constructor.
	 */
	public TemplateStatus() {
	}

	public static final TemplateStatus draft = new TemplateStatus(TemplateStatusValue.draft);
	public static final TemplateStatus active = new TemplateStatus(TemplateStatusValue.active);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public TemplateStatus(TemplateStatusValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.TemplateStatus#Value Value}.
	 */
	public TemplateStatusValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.TemplateStatus#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(TemplateStatusValue Value) {
		this.Value = Value;
	}
}
