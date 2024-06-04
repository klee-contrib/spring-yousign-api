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
public class ElectronicSealAuditTrail implements Serializable {
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
	private String classification;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String organization;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String seal;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String document;

	/**
	 * No arg constructor.
	 */
	public ElectronicSealAuditTrail() {
	}

	/**
	 * Getter for version.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealAuditTrail#version version}.
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * Getter for classification.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealAuditTrail#classification classification}.
	 */
	public String getClassification() {
		return this.classification;
	}

	/**
	 * Getter for organization.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealAuditTrail#organization organization}.
	 */
	public String getOrganization() {
		return this.organization;
	}

	/**
	 * Getter for seal.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealAuditTrail#seal seal}.
	 */
	public String getSeal() {
		return this.seal;
	}

	/**
	 * Getter for document.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealAuditTrail#document document}.
	 */
	public String getDocument() {
		return this.document;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealAuditTrail#version version}.
	 * @param version value to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealAuditTrail#classification classification}.
	 * @param classification value to set
	 */
	public void setClassification(String classification) {
		this.classification = classification;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealAuditTrail#organization organization}.
	 * @param organization value to set
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealAuditTrail#seal seal}.
	 * @param seal value to set
	 */
	public void setSeal(String seal) {
		this.seal = seal;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealAuditTrail#document document}.
	 * @param document value to set
	 */
	public void setDocument(String document) {
		this.document = document;
	}
}
