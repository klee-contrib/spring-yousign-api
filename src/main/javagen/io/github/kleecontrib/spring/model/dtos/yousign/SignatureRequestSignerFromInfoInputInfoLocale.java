////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSignerFromInfoInputInfoLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestSignerFromInfoInputInfoLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestSignerFromInfoInputInfoLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestSignerFromInfoInputInfoLocale() {
	}

	public static final SignatureRequestSignerFromInfoInputInfoLocale en = new SignatureRequestSignerFromInfoInputInfoLocale(SignatureRequestSignerFromInfoInputInfoLocaleValue.en);
	public static final SignatureRequestSignerFromInfoInputInfoLocale fr = new SignatureRequestSignerFromInfoInputInfoLocale(SignatureRequestSignerFromInfoInputInfoLocaleValue.fr);
	public static final SignatureRequestSignerFromInfoInputInfoLocale de = new SignatureRequestSignerFromInfoInputInfoLocale(SignatureRequestSignerFromInfoInputInfoLocaleValue.de);
	public static final SignatureRequestSignerFromInfoInputInfoLocale it = new SignatureRequestSignerFromInfoInputInfoLocale(SignatureRequestSignerFromInfoInputInfoLocaleValue.it);
	public static final SignatureRequestSignerFromInfoInputInfoLocale nl = new SignatureRequestSignerFromInfoInputInfoLocale(SignatureRequestSignerFromInfoInputInfoLocaleValue.nl);
	public static final SignatureRequestSignerFromInfoInputInfoLocale es = new SignatureRequestSignerFromInfoInputInfoLocale(SignatureRequestSignerFromInfoInputInfoLocaleValue.es);
	public static final SignatureRequestSignerFromInfoInputInfoLocale pl = new SignatureRequestSignerFromInfoInputInfoLocale(SignatureRequestSignerFromInfoInputInfoLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestSignerFromInfoInputInfoLocale(SignatureRequestSignerFromInfoInputInfoLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInputInfoLocale#Value Value}.
	 */
	public SignatureRequestSignerFromInfoInputInfoLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInputInfoLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestSignerFromInfoInputInfoLocaleValue Value) {
		this.Value = Value;
	}
}
