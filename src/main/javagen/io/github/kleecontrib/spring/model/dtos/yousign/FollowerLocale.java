////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FollowerLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FollowerLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private FollowerLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public FollowerLocale() {
	}

	public static final FollowerLocale en = new FollowerLocale(FollowerLocaleValue.en);
	public static final FollowerLocale fr = new FollowerLocale(FollowerLocaleValue.fr);
	public static final FollowerLocale de = new FollowerLocale(FollowerLocaleValue.de);
	public static final FollowerLocale it = new FollowerLocale(FollowerLocaleValue.it);
	public static final FollowerLocale nl = new FollowerLocale(FollowerLocaleValue.nl);
	public static final FollowerLocale es = new FollowerLocale(FollowerLocaleValue.es);
	public static final FollowerLocale pl = new FollowerLocale(FollowerLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public FollowerLocale(FollowerLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FollowerLocale#Value Value}.
	 */
	public FollowerLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FollowerLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(FollowerLocaleValue Value) {
		this.Value = Value;
	}
}
