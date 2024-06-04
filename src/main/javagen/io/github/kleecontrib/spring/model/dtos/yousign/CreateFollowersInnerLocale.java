////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateFollowersInnerLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateFollowersInnerLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private CreateFollowersInnerLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public CreateFollowersInnerLocale() {
	}

	public static final CreateFollowersInnerLocale en = new CreateFollowersInnerLocale(CreateFollowersInnerLocaleValue.en);
	public static final CreateFollowersInnerLocale fr = new CreateFollowersInnerLocale(CreateFollowersInnerLocaleValue.fr);
	public static final CreateFollowersInnerLocale de = new CreateFollowersInnerLocale(CreateFollowersInnerLocaleValue.de);
	public static final CreateFollowersInnerLocale it = new CreateFollowersInnerLocale(CreateFollowersInnerLocaleValue.it);
	public static final CreateFollowersInnerLocale nl = new CreateFollowersInnerLocale(CreateFollowersInnerLocaleValue.nl);
	public static final CreateFollowersInnerLocale es = new CreateFollowersInnerLocale(CreateFollowersInnerLocaleValue.es);
	public static final CreateFollowersInnerLocale pl = new CreateFollowersInnerLocale(CreateFollowersInnerLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public CreateFollowersInnerLocale(CreateFollowersInnerLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollowersInnerLocale#Value Value}.
	 */
	public CreateFollowersInnerLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollowersInnerLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(CreateFollowersInnerLocaleValue Value) {
		this.Value = Value;
	}
}
