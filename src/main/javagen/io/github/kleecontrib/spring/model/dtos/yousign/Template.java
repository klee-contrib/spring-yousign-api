////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.TemplateStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class Template implements Serializable {
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
	private String description;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.TemplateStatus#getValue() TemplateStatus#getValue()} 
	 */
	@NotNull
	private TemplateStatusValue Status;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String created_at;

	/**
	 * Non documenté.
	 */
	private String workspace_id;

	/**
	 * No arg constructor.
	 */
	public Template() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Template#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Template#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for description.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Template#description description}.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Getter for Status.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Template#Status Status}.
	 */
	public TemplateStatusValue getStatus() {
		return this.Status;
	}

	/**
	 * Getter for created_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Template#created_at created_at}.
	 */
	public String getCreated_at() {
		return this.created_at;
	}

	/**
	 * Getter for workspace_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Template#workspace_id workspace_id}.
	 */
	public String getWorkspace_id() {
		return this.workspace_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Template#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Template#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Template#description description}.
	 * @param description value to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Template#Status Status}.
	 * @param Status value to set
	 */
	public void setStatus(TemplateStatusValue Status) {
		this.Status = Status;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Template#created_at created_at}.
	 * @param created_at value to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Template#workspace_id workspace_id}.
	 * @param workspace_id value to set
	 */
	public void setWorkspace_id(String workspace_id) {
		this.workspace_id = workspace_id;
	}
}
