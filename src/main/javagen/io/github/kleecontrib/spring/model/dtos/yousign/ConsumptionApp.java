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
public class ConsumptionApp implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer electronic_signature;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer advanced_electronic_signature;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer advanced_electronic_signature_with_qualified_certificate;

	/**
	 * Non documenté.
	 */
	private ConsumptionAppQualifiedElectronicSignatureIdentificationMode qualified_electronic_signature_identification_mode;

	/**
	 * No arg constructor.
	 */
	public ConsumptionApp() {
	}

	/**
	 * Getter for electronic_signature.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApp#electronic_signature electronic_signature}.
	 */
	public Integer getElectronic_signature() {
		return this.electronic_signature;
	}

	/**
	 * Getter for advanced_electronic_signature.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApp#advanced_electronic_signature advanced_electronic_signature}.
	 */
	public Integer getAdvanced_electronic_signature() {
		return this.advanced_electronic_signature;
	}

	/**
	 * Getter for advanced_electronic_signature_with_qualified_certificate.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApp#advanced_electronic_signature_with_qualified_certificate advanced_electronic_signature_with_qualified_certificate}.
	 */
	public Integer getAdvanced_electronic_signature_with_qualified_certificate() {
		return this.advanced_electronic_signature_with_qualified_certificate;
	}

	/**
	 * Getter for qualified_electronic_signature_identification_mode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApp#qualified_electronic_signature_identification_mode qualified_electronic_signature_identification_mode}.
	 */
	public ConsumptionAppQualifiedElectronicSignatureIdentificationMode getQualified_electronic_signature_identification_mode() {
		return this.qualified_electronic_signature_identification_mode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApp#electronic_signature electronic_signature}.
	 * @param electronic_signature value to set
	 */
	public void setElectronic_signature(Integer electronic_signature) {
		this.electronic_signature = electronic_signature;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApp#advanced_electronic_signature advanced_electronic_signature}.
	 * @param advanced_electronic_signature value to set
	 */
	public void setAdvanced_electronic_signature(Integer advanced_electronic_signature) {
		this.advanced_electronic_signature = advanced_electronic_signature;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApp#advanced_electronic_signature_with_qualified_certificate advanced_electronic_signature_with_qualified_certificate}.
	 * @param advanced_electronic_signature_with_qualified_certificate value to set
	 */
	public void setAdvanced_electronic_signature_with_qualified_certificate(Integer advanced_electronic_signature_with_qualified_certificate) {
		this.advanced_electronic_signature_with_qualified_certificate = advanced_electronic_signature_with_qualified_certificate;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApp#qualified_electronic_signature_identification_mode qualified_electronic_signature_identification_mode}.
	 * @param qualified_electronic_signature_identification_mode value to set
	 */
	public void setQualified_electronic_signature_identification_mode(ConsumptionAppQualifiedElectronicSignatureIdentificationMode qualified_electronic_signature_identification_mode) {
		this.qualified_electronic_signature_identification_mode = qualified_electronic_signature_identification_mode;
	}
}
