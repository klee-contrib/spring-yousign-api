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
public class ConsumptionApi implements Serializable {
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
	@NotNull
	private Integer electronic_seal;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer advanced_electronic_seal;

	/**
	 * Non documenté.
	 */
	private ConsumptionAppQualifiedElectronicSignatureIdentificationMode qualified_electronic_signature_identification_mode;

	/**
	 * No arg constructor.
	 */
	public ConsumptionApi() {
	}

	/**
	 * Getter for electronic_signature.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApi#electronic_signature electronic_signature}.
	 */
	public Integer getElectronic_signature() {
		return this.electronic_signature;
	}

	/**
	 * Getter for advanced_electronic_signature.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApi#advanced_electronic_signature advanced_electronic_signature}.
	 */
	public Integer getAdvanced_electronic_signature() {
		return this.advanced_electronic_signature;
	}

	/**
	 * Getter for advanced_electronic_signature_with_qualified_certificate.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApi#advanced_electronic_signature_with_qualified_certificate advanced_electronic_signature_with_qualified_certificate}.
	 */
	public Integer getAdvanced_electronic_signature_with_qualified_certificate() {
		return this.advanced_electronic_signature_with_qualified_certificate;
	}

	/**
	 * Getter for electronic_seal.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApi#electronic_seal electronic_seal}.
	 */
	public Integer getElectronic_seal() {
		return this.electronic_seal;
	}

	/**
	 * Getter for advanced_electronic_seal.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApi#advanced_electronic_seal advanced_electronic_seal}.
	 */
	public Integer getAdvanced_electronic_seal() {
		return this.advanced_electronic_seal;
	}

	/**
	 * Getter for qualified_electronic_signature_identification_mode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApi#qualified_electronic_signature_identification_mode qualified_electronic_signature_identification_mode}.
	 */
	public ConsumptionAppQualifiedElectronicSignatureIdentificationMode getQualified_electronic_signature_identification_mode() {
		return this.qualified_electronic_signature_identification_mode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApi#electronic_signature electronic_signature}.
	 * @param electronic_signature value to set
	 */
	public void setElectronic_signature(Integer electronic_signature) {
		this.electronic_signature = electronic_signature;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApi#advanced_electronic_signature advanced_electronic_signature}.
	 * @param advanced_electronic_signature value to set
	 */
	public void setAdvanced_electronic_signature(Integer advanced_electronic_signature) {
		this.advanced_electronic_signature = advanced_electronic_signature;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApi#advanced_electronic_signature_with_qualified_certificate advanced_electronic_signature_with_qualified_certificate}.
	 * @param advanced_electronic_signature_with_qualified_certificate value to set
	 */
	public void setAdvanced_electronic_signature_with_qualified_certificate(Integer advanced_electronic_signature_with_qualified_certificate) {
		this.advanced_electronic_signature_with_qualified_certificate = advanced_electronic_signature_with_qualified_certificate;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApi#electronic_seal electronic_seal}.
	 * @param electronic_seal value to set
	 */
	public void setElectronic_seal(Integer electronic_seal) {
		this.electronic_seal = electronic_seal;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApi#advanced_electronic_seal advanced_electronic_seal}.
	 * @param advanced_electronic_seal value to set
	 */
	public void setAdvanced_electronic_seal(Integer advanced_electronic_seal) {
		this.advanced_electronic_seal = advanced_electronic_seal;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionApi#qualified_electronic_signature_identification_mode qualified_electronic_signature_identification_mode}.
	 * @param qualified_electronic_signature_identification_mode value to set
	 */
	public void setQualified_electronic_signature_identification_mode(ConsumptionAppQualifiedElectronicSignatureIdentificationMode qualified_electronic_signature_identification_mode) {
		this.qualified_electronic_signature_identification_mode = qualified_electronic_signature_identification_mode;
	}
}
