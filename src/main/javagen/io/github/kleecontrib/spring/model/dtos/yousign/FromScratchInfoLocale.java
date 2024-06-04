////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FromScratchInfoLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromScratchInfoLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private FromScratchInfoLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public FromScratchInfoLocale() {
	}

	public static final FromScratchInfoLocale en = new FromScratchInfoLocale(FromScratchInfoLocaleValue.en);
	public static final FromScratchInfoLocale fr = new FromScratchInfoLocale(FromScratchInfoLocaleValue.fr);
	public static final FromScratchInfoLocale de = new FromScratchInfoLocale(FromScratchInfoLocaleValue.de);
	public static final FromScratchInfoLocale it = new FromScratchInfoLocale(FromScratchInfoLocaleValue.it);
	public static final FromScratchInfoLocale nl = new FromScratchInfoLocale(FromScratchInfoLocaleValue.nl);
	public static final FromScratchInfoLocale es = new FromScratchInfoLocale(FromScratchInfoLocaleValue.es);
	public static final FromScratchInfoLocale pl = new FromScratchInfoLocale(FromScratchInfoLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FromScratchInfoLocale(FromScratchInfoLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratchInfoLocale#Value Value}.
	 */
	public FromScratchInfoLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratchInfoLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FromScratchInfoLocaleValue Value) {
		this.Value = Value;
	}
}
