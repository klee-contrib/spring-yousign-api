////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateFollowersInnerLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateFollowersInner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	@Email(message = "Le mail '$validatedValue' n'est pas valide")
	private String email;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollowersInnerLocale#getValue() CreateFollowersInnerLocale#getValue()} 
	 */
	@NotNull
	private CreateFollowersInnerLocaleValue Locale;

	/**
	 * No arg constructor.
	 */
	public CreateFollowersInner() {
	}

	/**
	 * Getter for email.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollowersInner#email email}.
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Getter for Locale.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollowersInner#Locale Locale}.
	 */
	public CreateFollowersInnerLocaleValue getLocale() {
		return this.Locale;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollowersInner#email email}.
	 * @param email value to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollowersInner#Locale Locale}.
	 * @param Locale value to set
	 */
	public void setLocale(CreateFollowersInnerLocaleValue Locale) {
		this.Locale = Locale;
	}
}
