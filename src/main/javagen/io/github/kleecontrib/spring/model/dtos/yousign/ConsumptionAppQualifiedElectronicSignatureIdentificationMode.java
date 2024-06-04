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
public class ConsumptionAppQualifiedElectronicSignatureIdentificationMode implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private ConsumptionAppQualifiedElectronicSignatureIdentificationModeIdentityVerification identity_verification;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer saved_identity;

	/**
	 * No arg constructor.
	 */
	public ConsumptionAppQualifiedElectronicSignatureIdentificationMode() {
	}

	/**
	 * Getter for identity_verification.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionAppQualifiedElectronicSignatureIdentificationMode#identity_verification identity_verification}.
	 */
	public ConsumptionAppQualifiedElectronicSignatureIdentificationModeIdentityVerification getIdentity_verification() {
		return this.identity_verification;
	}

	/**
	 * Getter for saved_identity.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionAppQualifiedElectronicSignatureIdentificationMode#saved_identity saved_identity}.
	 */
	public Integer getSaved_identity() {
		return this.saved_identity;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionAppQualifiedElectronicSignatureIdentificationMode#identity_verification identity_verification}.
	 * @param identity_verification value to set
	 */
	public void setIdentity_verification(ConsumptionAppQualifiedElectronicSignatureIdentificationModeIdentityVerification identity_verification) {
		this.identity_verification = identity_verification;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionAppQualifiedElectronicSignatureIdentificationMode#saved_identity saved_identity}.
	 * @param saved_identity value to set
	 */
	public void setSaved_identity(Integer saved_identity) {
		this.saved_identity = saved_identity;
	}
}
