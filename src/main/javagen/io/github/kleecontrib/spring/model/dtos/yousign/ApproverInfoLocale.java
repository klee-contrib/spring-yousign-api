////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.ApproverInfoLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class ApproverInfoLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private ApproverInfoLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public ApproverInfoLocale() {
	}

	public static final ApproverInfoLocale en = new ApproverInfoLocale(ApproverInfoLocaleValue.en);
	public static final ApproverInfoLocale fr = new ApproverInfoLocale(ApproverInfoLocaleValue.fr);
	public static final ApproverInfoLocale de = new ApproverInfoLocale(ApproverInfoLocaleValue.de);
	public static final ApproverInfoLocale it = new ApproverInfoLocale(ApproverInfoLocaleValue.it);
	public static final ApproverInfoLocale nl = new ApproverInfoLocale(ApproverInfoLocaleValue.nl);
	public static final ApproverInfoLocale es = new ApproverInfoLocale(ApproverInfoLocaleValue.es);
	public static final ApproverInfoLocale pl = new ApproverInfoLocale(ApproverInfoLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public ApproverInfoLocale(ApproverInfoLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ApproverInfoLocale#Value Value}.
	 */
	public ApproverInfoLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ApproverInfoLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(ApproverInfoLocaleValue Value) {
		this.Value = Value;
	}
}
