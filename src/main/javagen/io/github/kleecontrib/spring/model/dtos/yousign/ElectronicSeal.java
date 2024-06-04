////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.ElectronicSealSignatureLevelValue;
import io.github.kleecontrib.spring.model.enums.yousign.ElectronicSealStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class ElectronicSeal implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealStatus#getValue() ElectronicSealStatus#getValue()} 
	 */
	@NotNull
	private ElectronicSealStatusValue Status;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String created_at;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String document_id;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean timestamp;

	/**
	 * Non documenté.
	 */
	private String image_id;

	/**
	 * Store a custom id that will be added to webhooks.
	 */
	private String external_id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealSignatureLevel#getValue() ElectronicSealSignatureLevel#getValue()} 
	 */
	@NotNull
	private ElectronicSealSignatureLevelValue SignatureLevel;

	/**
	 * No arg constructor.
	 */
	public ElectronicSeal() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for Status.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#Status Status}.
	 */
	public ElectronicSealStatusValue getStatus() {
		return this.Status;
	}

	/**
	 * Getter for created_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#created_at created_at}.
	 */
	public String getCreated_at() {
		return this.created_at;
	}

	/**
	 * Getter for document_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#document_id document_id}.
	 */
	public String getDocument_id() {
		return this.document_id;
	}

	/**
	 * Getter for timestamp.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#timestamp timestamp}.
	 */
	public Boolean getTimestamp() {
		return this.timestamp;
	}

	/**
	 * Getter for image_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#image_id image_id}.
	 */
	public String getImage_id() {
		return this.image_id;
	}

	/**
	 * Getter for external_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#external_id external_id}.
	 */
	public String getExternal_id() {
		return this.external_id;
	}

	/**
	 * Getter for SignatureLevel.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#SignatureLevel SignatureLevel}.
	 */
	public ElectronicSealSignatureLevelValue getSignatureLevel() {
		return this.SignatureLevel;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#Status Status}.
	 * @param Status value to set
	 */
	public void setStatus(ElectronicSealStatusValue Status) {
		this.Status = Status;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#created_at created_at}.
	 * @param created_at value to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#document_id document_id}.
	 * @param document_id value to set
	 */
	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#timestamp timestamp}.
	 * @param timestamp value to set
	 */
	public void setTimestamp(Boolean timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#image_id image_id}.
	 * @param image_id value to set
	 */
	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#external_id external_id}.
	 * @param external_id value to set
	 */
	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal#SignatureLevel SignatureLevel}.
	 * @param SignatureLevel value to set
	 */
	public void setSignatureLevel(ElectronicSealSignatureLevelValue SignatureLevel) {
		this.SignatureLevel = SignatureLevel;
	}
}
