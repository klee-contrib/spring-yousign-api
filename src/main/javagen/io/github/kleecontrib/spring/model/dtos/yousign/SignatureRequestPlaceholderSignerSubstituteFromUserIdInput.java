////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Create a placeholder signer substitute from a user.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromUserIdInput extends CreateSignatureRequestTemplatePlaceholdersSignersInner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String label;

	/**
	 * Create signer from an existing user.
	 */
	@NotNull
	private String user_id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel#getValue() SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevel#getValue()} 
	 */
	@NotNull
	private SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue SignatureLevel;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode#getValue() SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationMode#getValue()} 
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationModeValue SignatureAuthenticationMode;

	/**
	 * Non documenté.
	 */
	private FromScratch1RedirectUrls redirect_urls;

	/**
	 * Non documenté.
	 */
	private FromScratch1CustomText custom_text;

	/**
	 * Override the delivery mode of the Signature Request for this Signer.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryMode#getValue() SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryMode#getValue()} 
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryModeValue DeliveryMode;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInput() {
		super();
	}

	/**
	 * Getter for label.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#label label}.
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * Getter for user_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#user_id user_id}.
	 */
	public String getUser_id() {
		return this.user_id;
	}

	/**
	 * Getter for SignatureLevel.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#SignatureLevel SignatureLevel}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue getSignatureLevel() {
		return this.SignatureLevel;
	}

	/**
	 * Getter for SignatureAuthenticationMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationModeValue getSignatureAuthenticationMode() {
		return this.SignatureAuthenticationMode;
	}

	/**
	 * Getter for redirect_urls.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#redirect_urls redirect_urls}.
	 */
	public FromScratch1RedirectUrls getRedirect_urls() {
		return this.redirect_urls;
	}

	/**
	 * Getter for custom_text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#custom_text custom_text}.
	 */
	public FromScratch1CustomText getCustom_text() {
		return this.custom_text;
	}

	/**
	 * Getter for DeliveryMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#DeliveryMode DeliveryMode}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryModeValue getDeliveryMode() {
		return this.DeliveryMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#label label}.
	 * @param label value to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#user_id user_id}.
	 * @param user_id value to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#SignatureLevel SignatureLevel}.
	 * @param SignatureLevel value to set
	 */
	public void setSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureLevelValue SignatureLevel) {
		this.SignatureLevel = SignatureLevel;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 * @param SignatureAuthenticationMode value to set
	 */
	public void setSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputSignatureAuthenticationModeValue SignatureAuthenticationMode) {
		this.SignatureAuthenticationMode = SignatureAuthenticationMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#redirect_urls redirect_urls}.
	 * @param redirect_urls value to set
	 */
	public void setRedirect_urls(FromScratch1RedirectUrls redirect_urls) {
		this.redirect_urls = redirect_urls;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#custom_text custom_text}.
	 * @param custom_text value to set
	 */
	public void setCustom_text(FromScratch1CustomText custom_text) {
		this.custom_text = custom_text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromUserIdInput#DeliveryMode DeliveryMode}.
	 * @param DeliveryMode value to set
	 */
	public void setDeliveryMode(SignatureRequestPlaceholderSignerSubstituteFromUserIdInputDeliveryModeValue DeliveryMode) {
		this.DeliveryMode = DeliveryMode;
	}
}
