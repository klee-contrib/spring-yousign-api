////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class Workspace implements Serializable {
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
	private String name;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String created_at;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String updated_at;

	/**
	 * Non documenté.
	 */
	private List<WorkspaceUsersInner> users;

	/**
	 * No arg constructor.
	 */
	public Workspace() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Workspace#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Workspace#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for created_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Workspace#created_at created_at}.
	 */
	public String getCreated_at() {
		return this.created_at;
	}

	/**
	 * Getter for updated_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Workspace#updated_at updated_at}.
	 */
	public String getUpdated_at() {
		return this.updated_at;
	}

	/**
	 * Getter for users.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Workspace#users users}.
	 */
	public List<WorkspaceUsersInner> getUsers() {
		return this.users;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Workspace#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Workspace#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Workspace#created_at created_at}.
	 * @param created_at value to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Workspace#updated_at updated_at}.
	 * @param updated_at value to set
	 */
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Workspace#users users}.
	 * @param users value to set
	 */
	public void setUsers(List<WorkspaceUsersInner> users) {
		this.users = users;
	}
}
