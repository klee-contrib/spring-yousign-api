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
public class ConsumptionAppQualifiedElectronicSignatureIdentificationModeIdentityVerification implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer succeeded;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Integer rejected;

	/**
	 * No arg constructor.
	 */
	public ConsumptionAppQualifiedElectronicSignatureIdentificationModeIdentityVerification() {
	}

	/**
	 * Getter for succeeded.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionAppQualifiedElectronicSignatureIdentificationModeIdentityVerification#succeeded succeeded}.
	 */
	public Integer getSucceeded() {
		return this.succeeded;
	}

	/**
	 * Getter for rejected.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionAppQualifiedElectronicSignatureIdentificationModeIdentityVerification#rejected rejected}.
	 */
	public Integer getRejected() {
		return this.rejected;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionAppQualifiedElectronicSignatureIdentificationModeIdentityVerification#succeeded succeeded}.
	 * @param succeeded value to set
	 */
	public void setSucceeded(Integer succeeded) {
		this.succeeded = succeeded;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ConsumptionAppQualifiedElectronicSignatureIdentificationModeIdentityVerification#rejected rejected}.
	 * @param rejected value to set
	 */
	public void setRejected(Integer rejected) {
		this.rejected = rejected;
	}
}
