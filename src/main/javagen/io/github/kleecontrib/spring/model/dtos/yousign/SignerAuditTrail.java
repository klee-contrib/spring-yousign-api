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
public class SignerAuditTrail implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer version;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String signature_request;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String sender;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String signer;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String documents;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String organization;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String authentication;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String electronic_signature_level;

	/**
	 * No arg constructor.
	 */
	public SignerAuditTrail() {
	}

	/**
	 * Getter for version.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#version version}.
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * Getter for signature_request.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#signature_request signature_request}.
	 */
	public String getSignature_request() {
		return this.signature_request;
	}

	/**
	 * Getter for sender.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#sender sender}.
	 */
	public String getSender() {
		return this.sender;
	}

	/**
	 * Getter for signer.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#signer signer}.
	 */
	public String getSigner() {
		return this.signer;
	}

	/**
	 * Getter for documents.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#documents documents}.
	 */
	public String getDocuments() {
		return this.documents;
	}

	/**
	 * Getter for organization.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#organization organization}.
	 */
	public String getOrganization() {
		return this.organization;
	}

	/**
	 * Getter for authentication.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#authentication authentication}.
	 */
	public String getAuthentication() {
		return this.authentication;
	}

	/**
	 * Getter for electronic_signature_level.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#electronic_signature_level electronic_signature_level}.
	 */
	public String getElectronic_signature_level() {
		return this.electronic_signature_level;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#version version}.
	 * @param version value to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#signature_request signature_request}.
	 * @param signature_request value to set
	 */
	public void setSignature_request(String signature_request) {
		this.signature_request = signature_request;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#sender sender}.
	 * @param sender value to set
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#signer signer}.
	 * @param signer value to set
	 */
	public void setSigner(String signer) {
		this.signer = signer;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#documents documents}.
	 * @param documents value to set
	 */
	public void setDocuments(String documents) {
		this.documents = documents;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#organization organization}.
	 * @param organization value to set
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#authentication authentication}.
	 * @param authentication value to set
	 */
	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail#electronic_signature_level electronic_signature_level}.
	 * @param electronic_signature_level value to set
	 */
	public void setElectronic_signature_level(String electronic_signature_level) {
		this.electronic_signature_level = electronic_signature_level;
	}
}
