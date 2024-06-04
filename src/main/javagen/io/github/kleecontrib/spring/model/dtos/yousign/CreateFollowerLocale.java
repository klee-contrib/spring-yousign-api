////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateFollowerLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateFollowerLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private CreateFollowerLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public CreateFollowerLocale() {
	}

	public static final CreateFollowerLocale en = new CreateFollowerLocale(CreateFollowerLocaleValue.en);
	public static final CreateFollowerLocale fr = new CreateFollowerLocale(CreateFollowerLocaleValue.fr);
	public static final CreateFollowerLocale de = new CreateFollowerLocale(CreateFollowerLocaleValue.de);
	public static final CreateFollowerLocale it = new CreateFollowerLocale(CreateFollowerLocaleValue.it);
	public static final CreateFollowerLocale nl = new CreateFollowerLocale(CreateFollowerLocaleValue.nl);
	public static final CreateFollowerLocale es = new CreateFollowerLocale(CreateFollowerLocaleValue.es);
	public static final CreateFollowerLocale pl = new CreateFollowerLocale(CreateFollowerLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public CreateFollowerLocale(CreateFollowerLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollowerLocale#Value Value}.
	 */
	public CreateFollowerLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollowerLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(CreateFollowerLocaleValue Value) {
		this.Value = Value;
	}
}
