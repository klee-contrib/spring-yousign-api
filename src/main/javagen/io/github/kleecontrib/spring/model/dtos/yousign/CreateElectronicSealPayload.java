////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import io.github.kleecontrib.spring.model.enums.yousign.CreateElectronicSealPayloadSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateElectronicSealPayload implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Specify which Electronic Seal Document to use for creating an Electronic Seal.
	 */
	@NotNull
	private String document_id;

	/**
	 * Specify which Electronic Seal Image to use for creating an Electronic Seal.
	 */
	private String image_id;

	/**
	 * Store a custom id that will be added to webhooks.
	 */
	private String external_id;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean timestamp;

	/**
	 * Non documenté.
	 */
	private List<CreateElectronicSealPayloadFieldsInner> fields;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayloadSignatureLevel#getValue() CreateElectronicSealPayloadSignatureLevel#getValue()} 
	 */
	private CreateElectronicSealPayloadSignatureLevelValue SignatureLevel;

	/**
	 * Specify which certificate to use for creating an Electronic Seal (only available for advanced_electronic_signature level).
	 */
	private String certificate_id;

	/**
	 * No arg constructor.
	 */
	public CreateElectronicSealPayload() {
	}

	/**
	 * Getter for document_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#document_id document_id}.
	 */
	public String getDocument_id() {
		return this.document_id;
	}

	/**
	 * Getter for image_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#image_id image_id}.
	 */
	public String getImage_id() {
		return this.image_id;
	}

	/**
	 * Getter for external_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#external_id external_id}.
	 */
	public String getExternal_id() {
		return this.external_id;
	}

	/**
	 * Getter for timestamp.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#timestamp timestamp}.
	 */
	public Boolean getTimestamp() {
		return this.timestamp;
	}

	/**
	 * Getter for fields.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#fields fields}.
	 */
	public List<CreateElectronicSealPayloadFieldsInner> getFields() {
		return this.fields;
	}

	/**
	 * Getter for SignatureLevel.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#SignatureLevel SignatureLevel}.
	 */
	public CreateElectronicSealPayloadSignatureLevelValue getSignatureLevel() {
		return this.SignatureLevel;
	}

	/**
	 * Getter for certificate_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#certificate_id certificate_id}.
	 */
	public String getCertificate_id() {
		return this.certificate_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#document_id document_id}.
	 * @param document_id value to set
	 */
	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#image_id image_id}.
	 * @param image_id value to set
	 */
	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#external_id external_id}.
	 * @param external_id value to set
	 */
	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#timestamp timestamp}.
	 * @param timestamp value to set
	 */
	public void setTimestamp(Boolean timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#fields fields}.
	 * @param fields value to set
	 */
	public void setFields(List<CreateElectronicSealPayloadFieldsInner> fields) {
		this.fields = fields;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#SignatureLevel SignatureLevel}.
	 * @param SignatureLevel value to set
	 */
	public void setSignatureLevel(CreateElectronicSealPayloadSignatureLevelValue SignatureLevel) {
		this.SignatureLevel = SignatureLevel;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload#certificate_id certificate_id}.
	 * @param certificate_id value to set
	 */
	public void setCertificate_id(String certificate_id) {
		this.certificate_id = certificate_id;
	}
}
