////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.UpdateSignerInfoLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateSignerInfoLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private UpdateSignerInfoLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public UpdateSignerInfoLocale() {
	}

	public static final UpdateSignerInfoLocale en = new UpdateSignerInfoLocale(UpdateSignerInfoLocaleValue.en);
	public static final UpdateSignerInfoLocale fr = new UpdateSignerInfoLocale(UpdateSignerInfoLocaleValue.fr);
	public static final UpdateSignerInfoLocale de = new UpdateSignerInfoLocale(UpdateSignerInfoLocaleValue.de);
	public static final UpdateSignerInfoLocale it = new UpdateSignerInfoLocale(UpdateSignerInfoLocaleValue.it);
	public static final UpdateSignerInfoLocale nl = new UpdateSignerInfoLocale(UpdateSignerInfoLocaleValue.nl);
	public static final UpdateSignerInfoLocale es = new UpdateSignerInfoLocale(UpdateSignerInfoLocaleValue.es);
	public static final UpdateSignerInfoLocale pl = new UpdateSignerInfoLocale(UpdateSignerInfoLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public UpdateSignerInfoLocale(UpdateSignerInfoLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignerInfoLocale#Value Value}.
	 */
	public UpdateSignerInfoLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignerInfoLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(UpdateSignerInfoLocaleValue Value) {
		this.Value = Value;
	}
}
