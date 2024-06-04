////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.LocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class Locale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private LocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public Locale() {
	}

	public static final Locale en = new Locale(LocaleValue.en);
	public static final Locale fr = new Locale(LocaleValue.fr);
	public static final Locale de = new Locale(LocaleValue.de);
	public static final Locale it = new Locale(LocaleValue.it);
	public static final Locale nl = new Locale(LocaleValue.nl);
	public static final Locale es = new Locale(LocaleValue.es);
	public static final Locale pl = new Locale(LocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public Locale(LocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Locale#Value Value}.
	 */
	public LocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Locale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(LocaleValue Value) {
		this.Value = Value;
	}
}
