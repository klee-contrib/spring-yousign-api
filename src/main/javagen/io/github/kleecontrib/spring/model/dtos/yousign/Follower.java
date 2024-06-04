////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.FollowerLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class Follower implements Serializable {
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
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.FollowerLocale#getValue() FollowerLocale#getValue()} 
	 */
	@NotNull
	private FollowerLocaleValue Locale;

	/**
	 * Non documenté.
	 */
	private String follower_link;

	/**
	 * No arg constructor.
	 */
	public Follower() {
	}

	/**
	 * Getter for email.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Follower#email email}.
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Getter for Locale.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Follower#Locale Locale}.
	 */
	public FollowerLocaleValue getLocale() {
		return this.Locale;
	}

	/**
	 * Getter for follower_link.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Follower#follower_link follower_link}.
	 */
	public String getFollower_link() {
		return this.follower_link;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Follower#email email}.
	 * @param email value to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Follower#Locale Locale}.
	 * @param Locale value to set
	 */
	public void setLocale(FollowerLocaleValue Locale) {
		this.Locale = Locale;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Follower#follower_link follower_link}.
	 * @param follower_link value to set
	 */
	public void setFollower_link(String follower_link) {
		this.follower_link = follower_link;
	}
}
