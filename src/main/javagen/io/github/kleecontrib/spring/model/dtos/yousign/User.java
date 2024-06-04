////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import io.github.kleecontrib.spring.model.enums.yousign.UserRoleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class User implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String id;

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
	 */
	@NotNull
	private String locale;

	/**
	 * Non documenté.
	 */
	private String avatar;

	/**
	 * Non documenté.
	 */
	private String job_title;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean is_active;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.UserRole#getValue() UserRole#getValue()} 
	 */
	@NotNull
	private UserRoleValue Role;

	/**
	 * Non documenté.
	 */
	private List<UserWorkspacesInner> workspaces;

	/**
	 * No arg constructor.
	 */
	public User() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for first_name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#first_name first_name}.
	 */
	public String getFirst_name() {
		return this.first_name;
	}

	/**
	 * Getter for last_name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#last_name last_name}.
	 */
	public String getLast_name() {
		return this.last_name;
	}

	/**
	 * Getter for email.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#email email}.
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Getter for phone_number.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#phone_number phone_number}.
	 */
	public String getPhone_number() {
		return this.phone_number;
	}

	/**
	 * Getter for locale.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#locale locale}.
	 */
	public String getLocale() {
		return this.locale;
	}

	/**
	 * Getter for avatar.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#avatar avatar}.
	 */
	public String getAvatar() {
		return this.avatar;
	}

	/**
	 * Getter for job_title.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#job_title job_title}.
	 */
	public String getJob_title() {
		return this.job_title;
	}

	/**
	 * Getter for is_active.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#is_active is_active}.
	 */
	public Boolean getIs_active() {
		return this.is_active;
	}

	/**
	 * Getter for Role.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#Role Role}.
	 */
	public UserRoleValue getRole() {
		return this.Role;
	}

	/**
	 * Getter for workspaces.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#workspaces workspaces}.
	 */
	public List<UserWorkspacesInner> getWorkspaces() {
		return this.workspaces;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#first_name first_name}.
	 * @param first_name value to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#last_name last_name}.
	 * @param last_name value to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#email email}.
	 * @param email value to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#phone_number phone_number}.
	 * @param phone_number value to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#locale locale}.
	 * @param locale value to set
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#avatar avatar}.
	 * @param avatar value to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#job_title job_title}.
	 * @param job_title value to set
	 */
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#is_active is_active}.
	 * @param is_active value to set
	 */
	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#Role Role}.
	 * @param Role value to set
	 */
	public void setRole(UserRoleValue Role) {
		this.Role = Role;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.User#workspaces workspaces}.
	 * @param workspaces value to set
	 */
	public void setWorkspaces(List<UserWorkspacesInner> workspaces) {
		this.workspaces = workspaces;
	}
}
