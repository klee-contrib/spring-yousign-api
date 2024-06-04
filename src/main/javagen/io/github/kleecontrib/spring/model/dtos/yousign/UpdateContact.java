////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.UpdateContactLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateContact implements Serializable {
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
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContactLocale#getValue() UpdateContactLocale#getValue()} 
	 */
	@NotNull
	private UpdateContactLocaleValue Locale;

	/**
	 * E.164 format.
	 */
	private String phone_number;

	/**
	 * Non documenté.
	 */
	private String company_name;

	/**
	 * This property cannot start or end with whitespace, does not allow HTML tags, URL or email.
	 */
	private String job_title;

	/**
	 * This property cannot start or end with whitespace, does not allow HTML tags, URL or email.
	 */
	private String address_line_1;

	/**
	 * This property cannot start or end with whitespace, does not allow HTML tags, URL or email.
	 */
	private String address_line_2;

	/**
	 * This property cannot start or end with whitespace, does not allow HTML tags, URL or email.
	 */
	private String address_city;

	/**
	 * This property cannot start or end with whitespace, does not allow HTML tags, URL or email.
	 */
	private String address_postal_code;

	/**
	 * This property cannot start or end with whitespace, does not allow HTML tags, URL or email.
	 */
	private String address_country;

	/**
	 * Non documenté.
	 */
	private String workspace_id;

	/**
	 * No arg constructor.
	 */
	public UpdateContact() {
	}

	/**
	 * Getter for first_name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#first_name first_name}.
	 */
	public String getFirst_name() {
		return this.first_name;
	}

	/**
	 * Getter for last_name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#last_name last_name}.
	 */
	public String getLast_name() {
		return this.last_name;
	}

	/**
	 * Getter for email.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#email email}.
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Getter for Locale.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#Locale Locale}.
	 */
	public UpdateContactLocaleValue getLocale() {
		return this.Locale;
	}

	/**
	 * Getter for phone_number.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#phone_number phone_number}.
	 */
	public String getPhone_number() {
		return this.phone_number;
	}

	/**
	 * Getter for company_name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#company_name company_name}.
	 */
	public String getCompany_name() {
		return this.company_name;
	}

	/**
	 * Getter for job_title.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#job_title job_title}.
	 */
	public String getJob_title() {
		return this.job_title;
	}

	/**
	 * Getter for address_line_1.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#address_line_1 address_line_1}.
	 */
	public String getAddress_line_1() {
		return this.address_line_1;
	}

	/**
	 * Getter for address_line_2.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#address_line_2 address_line_2}.
	 */
	public String getAddress_line_2() {
		return this.address_line_2;
	}

	/**
	 * Getter for address_city.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#address_city address_city}.
	 */
	public String getAddress_city() {
		return this.address_city;
	}

	/**
	 * Getter for address_postal_code.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#address_postal_code address_postal_code}.
	 */
	public String getAddress_postal_code() {
		return this.address_postal_code;
	}

	/**
	 * Getter for address_country.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#address_country address_country}.
	 */
	public String getAddress_country() {
		return this.address_country;
	}

	/**
	 * Getter for workspace_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#workspace_id workspace_id}.
	 */
	public String getWorkspace_id() {
		return this.workspace_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#first_name first_name}.
	 * @param first_name value to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#last_name last_name}.
	 * @param last_name value to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#email email}.
	 * @param email value to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#Locale Locale}.
	 * @param Locale value to set
	 */
	public void setLocale(UpdateContactLocaleValue Locale) {
		this.Locale = Locale;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#phone_number phone_number}.
	 * @param phone_number value to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#company_name company_name}.
	 * @param company_name value to set
	 */
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#job_title job_title}.
	 * @param job_title value to set
	 */
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#address_line_1 address_line_1}.
	 * @param address_line_1 value to set
	 */
	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#address_line_2 address_line_2}.
	 * @param address_line_2 value to set
	 */
	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#address_city address_city}.
	 * @param address_city value to set
	 */
	public void setAddress_city(String address_city) {
		this.address_city = address_city;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#address_postal_code address_postal_code}.
	 * @param address_postal_code value to set
	 */
	public void setAddress_postal_code(String address_postal_code) {
		this.address_postal_code = address_postal_code;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#address_country address_country}.
	 * @param address_country value to set
	 */
	public void setAddress_country(String address_country) {
		this.address_country = address_country;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact#workspace_id workspace_id}.
	 * @param workspace_id value to set
	 */
	public void setWorkspace_id(String workspace_id) {
		this.workspace_id = workspace_id;
	}
}
