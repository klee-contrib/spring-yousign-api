////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.UpdateContactLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateContactLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private UpdateContactLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public UpdateContactLocale() {
	}

	public static final UpdateContactLocale en = new UpdateContactLocale(UpdateContactLocaleValue.en);
	public static final UpdateContactLocale fr = new UpdateContactLocale(UpdateContactLocaleValue.fr);
	public static final UpdateContactLocale de = new UpdateContactLocale(UpdateContactLocaleValue.de);
	public static final UpdateContactLocale it = new UpdateContactLocale(UpdateContactLocaleValue.it);
	public static final UpdateContactLocale nl = new UpdateContactLocale(UpdateContactLocaleValue.nl);
	public static final UpdateContactLocale es = new UpdateContactLocale(UpdateContactLocaleValue.es);
	public static final UpdateContactLocale pl = new UpdateContactLocale(UpdateContactLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public UpdateContactLocale(UpdateContactLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContactLocale#Value Value}.
	 */
	public UpdateContactLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContactLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(UpdateContactLocaleValue Value) {
		this.Value = Value;
	}
}
