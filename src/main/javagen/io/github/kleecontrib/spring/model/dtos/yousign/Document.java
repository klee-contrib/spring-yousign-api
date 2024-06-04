////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.DocumentNatureValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Document to attach to a Signature Request.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class Document implements Serializable {
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
	private String filename;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.DocumentNature#getValue() DocumentNature#getValue()} 
	 */
	@NotNull
	private DocumentNatureValue Nature;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String content_type;

	/**
	 * Sha256 checksum.
	 */
	@NotNull
	private String sha256;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean is_protected;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean is_signed;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String created_at;

	/**
	 * Number of pages for signable document.
	 */
	private Integer total_pages;

	/**
	 * If protected by password and not yet unlocked.
	 */
	@NotNull
	private Boolean is_locked;

	/**
	 * Non documenté.
	 */
	private DocumentInitials initials;

	/**
	 * Number of parsed anchors from the document.
	 */
	@NotNull
	private Integer total_anchors;

	/**
	 * No arg constructor.
	 */
	public Document() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for filename.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#filename filename}.
	 */
	public String getFilename() {
		return this.filename;
	}

	/**
	 * Getter for Nature.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#Nature Nature}.
	 */
	public DocumentNatureValue getNature() {
		return this.Nature;
	}

	/**
	 * Getter for content_type.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#content_type content_type}.
	 */
	public String getContent_type() {
		return this.content_type;
	}

	/**
	 * Getter for sha256.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#sha256 sha256}.
	 */
	public String getSha256() {
		return this.sha256;
	}

	/**
	 * Getter for is_protected.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#is_protected is_protected}.
	 */
	public Boolean getIs_protected() {
		return this.is_protected;
	}

	/**
	 * Getter for is_signed.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#is_signed is_signed}.
	 */
	public Boolean getIs_signed() {
		return this.is_signed;
	}

	/**
	 * Getter for created_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#created_at created_at}.
	 */
	public String getCreated_at() {
		return this.created_at;
	}

	/**
	 * Getter for total_pages.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#total_pages total_pages}.
	 */
	public Integer getTotal_pages() {
		return this.total_pages;
	}

	/**
	 * Getter for is_locked.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#is_locked is_locked}.
	 */
	public Boolean getIs_locked() {
		return this.is_locked;
	}

	/**
	 * Getter for initials.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#initials initials}.
	 */
	public DocumentInitials getInitials() {
		return this.initials;
	}

	/**
	 * Getter for total_anchors.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#total_anchors total_anchors}.
	 */
	public Integer getTotal_anchors() {
		return this.total_anchors;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#filename filename}.
	 * @param filename value to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#Nature Nature}.
	 * @param Nature value to set
	 */
	public void setNature(DocumentNatureValue Nature) {
		this.Nature = Nature;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#content_type content_type}.
	 * @param content_type value to set
	 */
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#sha256 sha256}.
	 * @param sha256 value to set
	 */
	public void setSha256(String sha256) {
		this.sha256 = sha256;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#is_protected is_protected}.
	 * @param is_protected value to set
	 */
	public void setIs_protected(Boolean is_protected) {
		this.is_protected = is_protected;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#is_signed is_signed}.
	 * @param is_signed value to set
	 */
	public void setIs_signed(Boolean is_signed) {
		this.is_signed = is_signed;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#created_at created_at}.
	 * @param created_at value to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#total_pages total_pages}.
	 * @param total_pages value to set
	 */
	public void setTotal_pages(Integer total_pages) {
		this.total_pages = total_pages;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#is_locked is_locked}.
	 * @param is_locked value to set
	 */
	public void setIs_locked(Boolean is_locked) {
		this.is_locked = is_locked;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#initials initials}.
	 * @param initials value to set
	 */
	public void setInitials(DocumentInitials initials) {
		this.initials = initials;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Document#total_anchors total_anchors}.
	 * @param total_anchors value to set
	 */
	public void setTotal_anchors(Integer total_anchors) {
		this.total_anchors = total_anchors;
	}
}
