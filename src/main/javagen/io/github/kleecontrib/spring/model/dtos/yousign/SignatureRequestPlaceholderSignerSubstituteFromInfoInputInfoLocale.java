////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale() {
	}

	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale en = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale(SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocaleValue.en);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale fr = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale(SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocaleValue.fr);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale de = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale(SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocaleValue.de);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale it = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale(SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocaleValue.it);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale nl = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale(SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocaleValue.nl);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale es = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale(SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocaleValue.es);
	public static final SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale pl = new SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale(SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale(SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale#Value Value}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfoLocaleValue Value) {
		this.Value = Value;
	}
}
