////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignerInfoLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignerInfoLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignerInfoLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public SignerInfoLocale() {
	}

	public static final SignerInfoLocale en = new SignerInfoLocale(SignerInfoLocaleValue.en);
	public static final SignerInfoLocale fr = new SignerInfoLocale(SignerInfoLocaleValue.fr);
	public static final SignerInfoLocale de = new SignerInfoLocale(SignerInfoLocaleValue.de);
	public static final SignerInfoLocale it = new SignerInfoLocale(SignerInfoLocaleValue.it);
	public static final SignerInfoLocale nl = new SignerInfoLocale(SignerInfoLocaleValue.nl);
	public static final SignerInfoLocale es = new SignerInfoLocale(SignerInfoLocaleValue.es);
	public static final SignerInfoLocale pl = new SignerInfoLocale(SignerInfoLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignerInfoLocale(SignerInfoLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerInfoLocale#Value Value}.
	 */
	public SignerInfoLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerInfoLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignerInfoLocaleValue Value) {
		this.Value = Value;
	}
}
