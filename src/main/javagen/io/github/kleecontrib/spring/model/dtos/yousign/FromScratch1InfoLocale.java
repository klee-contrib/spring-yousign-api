////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FromScratch1InfoLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromScratch1InfoLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private FromScratch1InfoLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public FromScratch1InfoLocale() {
	}

	public static final FromScratch1InfoLocale en = new FromScratch1InfoLocale(FromScratch1InfoLocaleValue.en);
	public static final FromScratch1InfoLocale fr = new FromScratch1InfoLocale(FromScratch1InfoLocaleValue.fr);
	public static final FromScratch1InfoLocale de = new FromScratch1InfoLocale(FromScratch1InfoLocaleValue.de);
	public static final FromScratch1InfoLocale it = new FromScratch1InfoLocale(FromScratch1InfoLocaleValue.it);
	public static final FromScratch1InfoLocale nl = new FromScratch1InfoLocale(FromScratch1InfoLocaleValue.nl);
	public static final FromScratch1InfoLocale es = new FromScratch1InfoLocale(FromScratch1InfoLocaleValue.es);
	public static final FromScratch1InfoLocale pl = new FromScratch1InfoLocale(FromScratch1InfoLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FromScratch1InfoLocale(FromScratch1InfoLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1InfoLocale#Value Value}.
	 */
	public FromScratch1InfoLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1InfoLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FromScratch1InfoLocaleValue Value) {
		this.Value = Value;
	}
}
