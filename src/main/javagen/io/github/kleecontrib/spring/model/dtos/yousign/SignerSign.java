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
public class SignerSign implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private String otp;

	/**
	 * Non documenté.
	 */
	private SignerSIPAddress ip_address;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String consent_given_at;

	/**
	 * No arg constructor.
	 */
	public SignerSign() {
	}

	/**
	 * Getter for otp.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerSign#otp otp}.
	 */
	public String getOtp() {
		return this.otp;
	}

	/**
	 * Getter for ip_address.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerSign#ip_address ip_address}.
	 */
	public SignerSIPAddress getIp_address() {
		return this.ip_address;
	}

	/**
	 * Getter for consent_given_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerSign#consent_given_at consent_given_at}.
	 */
	public String getConsent_given_at() {
		return this.consent_given_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerSign#otp otp}.
	 * @param otp value to set
	 */
	public void setOtp(String otp) {
		this.otp = otp;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerSign#ip_address ip_address}.
	 * @param ip_address value to set
	 */
	public void setIp_address(SignerSIPAddress ip_address) {
		this.ip_address = ip_address;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerSign#consent_given_at consent_given_at}.
	 * @param consent_given_at value to set
	 */
	public void setConsent_given_at(String consent_given_at) {
		this.consent_given_at = consent_given_at;
	}
}
