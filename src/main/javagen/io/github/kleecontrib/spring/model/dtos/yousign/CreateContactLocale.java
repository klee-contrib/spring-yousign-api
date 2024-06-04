////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateContactLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateContactLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private CreateContactLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public CreateContactLocale() {
	}

	public static final CreateContactLocale en = new CreateContactLocale(CreateContactLocaleValue.en);
	public static final CreateContactLocale fr = new CreateContactLocale(CreateContactLocaleValue.fr);
	public static final CreateContactLocale de = new CreateContactLocale(CreateContactLocaleValue.de);
	public static final CreateContactLocale it = new CreateContactLocale(CreateContactLocaleValue.it);
	public static final CreateContactLocale nl = new CreateContactLocale(CreateContactLocaleValue.nl);
	public static final CreateContactLocale es = new CreateContactLocale(CreateContactLocaleValue.es);
	public static final CreateContactLocale pl = new CreateContactLocale(CreateContactLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public CreateContactLocale(CreateContactLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateContactLocale#Value Value}.
	 */
	public CreateContactLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateContactLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(CreateContactLocaleValue Value) {
		this.Value = Value;
	}
}
