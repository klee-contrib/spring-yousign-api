////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class ElectronicSealDocument implements Serializable {
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
	private Integer total_pages;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String created_at;

	/**
	 * No arg constructor.
	 */
	public ElectronicSealDocument() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealDocument#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for total_pages.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealDocument#total_pages total_pages}.
	 */
	public Integer getTotal_pages() {
		return this.total_pages;
	}

	/**
	 * Getter for created_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealDocument#created_at created_at}.
	 */
	public String getCreated_at() {
		return this.created_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealDocument#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealDocument#total_pages total_pages}.
	 * @param total_pages value to set
	 */
	public void setTotal_pages(Integer total_pages) {
		this.total_pages = total_pages;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealDocument#created_at created_at}.
	 * @param created_at value to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
}
