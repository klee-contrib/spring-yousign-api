////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateFollowerLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

/**
 * A list of Follower objects to be added to the signature request.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateFollower implements Serializable {
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
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollowerLocale#getValue() CreateFollowerLocale#getValue()} 
	 */
	@NotNull
	private CreateFollowerLocaleValue Locale;

	/**
	 * No arg constructor.
	 */
	public CreateFollower() {
	}

	/**
	 * Getter for email.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollower#email email}.
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Getter for Locale.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollower#Locale Locale}.
	 */
	public CreateFollowerLocaleValue getLocale() {
		return this.Locale;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollower#email email}.
	 * @param email value to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateFollower#Locale Locale}.
	 * @param Locale value to set
	 */
	public void setLocale(CreateFollowerLocaleValue Locale) {
		this.Locale = Locale;
	}
}
