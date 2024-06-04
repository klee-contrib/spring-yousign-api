////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Create a placeholder signer substitute from a contact.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromContactIdInput extends CreateSignatureRequestTemplatePlaceholdersSignersInner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String label;

	/**
	 * Create signer from an existing contact.
	 */
	@NotNull
	private String contact_id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel#getValue() SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevel#getValue()} 
	 */
	@NotNull
	private SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue SignatureLevel;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode#getValue() SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationMode#getValue()} 
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationModeValue SignatureAuthenticationMode;

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
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryMode#getValue() SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryMode#getValue()} 
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryModeValue DeliveryMode;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInput() {
		super();
	}

	/**
	 * Getter for label.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#label label}.
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * Getter for contact_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#contact_id contact_id}.
	 */
	public String getContact_id() {
		return this.contact_id;
	}

	/**
	 * Getter for SignatureLevel.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#SignatureLevel SignatureLevel}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue getSignatureLevel() {
		return this.SignatureLevel;
	}

	/**
	 * Getter for SignatureAuthenticationMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationModeValue getSignatureAuthenticationMode() {
		return this.SignatureAuthenticationMode;
	}

	/**
	 * Getter for redirect_urls.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#redirect_urls redirect_urls}.
	 */
	public FromScratch1RedirectUrls getRedirect_urls() {
		return this.redirect_urls;
	}

	/**
	 * Getter for custom_text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#custom_text custom_text}.
	 */
	public FromScratch1CustomText getCustom_text() {
		return this.custom_text;
	}

	/**
	 * Getter for DeliveryMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#DeliveryMode DeliveryMode}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryModeValue getDeliveryMode() {
		return this.DeliveryMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#label label}.
	 * @param label value to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#contact_id contact_id}.
	 * @param contact_id value to set
	 */
	public void setContact_id(String contact_id) {
		this.contact_id = contact_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#SignatureLevel SignatureLevel}.
	 * @param SignatureLevel value to set
	 */
	public void setSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureLevelValue SignatureLevel) {
		this.SignatureLevel = SignatureLevel;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 * @param SignatureAuthenticationMode value to set
	 */
	public void setSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputSignatureAuthenticationModeValue SignatureAuthenticationMode) {
		this.SignatureAuthenticationMode = SignatureAuthenticationMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#redirect_urls redirect_urls}.
	 * @param redirect_urls value to set
	 */
	public void setRedirect_urls(FromScratch1RedirectUrls redirect_urls) {
		this.redirect_urls = redirect_urls;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#custom_text custom_text}.
	 * @param custom_text value to set
	 */
	public void setCustom_text(FromScratch1CustomText custom_text) {
		this.custom_text = custom_text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromContactIdInput#DeliveryMode DeliveryMode}.
	 * @param DeliveryMode value to set
	 */
	public void setDeliveryMode(SignatureRequestPlaceholderSignerSubstituteFromContactIdInputDeliveryModeValue DeliveryMode) {
		this.DeliveryMode = DeliveryMode;
	}
}
