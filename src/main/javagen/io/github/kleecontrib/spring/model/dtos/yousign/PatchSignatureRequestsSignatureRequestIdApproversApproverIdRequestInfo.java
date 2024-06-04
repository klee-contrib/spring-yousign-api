////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String first_name;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String last_name;

	/**
	 * Non documenté.
	 */
	@NotNull
	@Email(message = "Le mail '$validatedValue' n'est pas valide")
	private String email;

	/**
	 * E.164 format.
	 */
	@NotNull
	private String phone_number;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale#getValue() PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale#getValue()} 
	 */
	@NotNull
	private PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue Locale;

	/**
	 * No arg constructor.
	 */
	public PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo() {
	}

	/**
	 * Getter for first_name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo#first_name first_name}.
	 */
	public String getFirst_name() {
		return this.first_name;
	}

	/**
	 * Getter for last_name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo#last_name last_name}.
	 */
	public String getLast_name() {
		return this.last_name;
	}

	/**
	 * Getter for email.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo#email email}.
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Getter for phone_number.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo#phone_number phone_number}.
	 */
	public String getPhone_number() {
		return this.phone_number;
	}

	/**
	 * Getter for Locale.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo#Locale Locale}.
	 */
	public PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue getLocale() {
		return this.Locale;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo#first_name first_name}.
	 * @param first_name value to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo#last_name last_name}.
	 * @param last_name value to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo#email email}.
	 * @param email value to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo#phone_number phone_number}.
	 * @param phone_number value to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfo#Locale Locale}.
	 * @param Locale value to set
	 */
	public void setLocale(PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue Locale) {
		this.Locale = Locale;
	}
}
