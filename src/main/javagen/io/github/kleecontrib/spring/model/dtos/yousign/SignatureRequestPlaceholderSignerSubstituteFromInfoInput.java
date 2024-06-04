////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Create a placeholder signer substitute from info.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderSignerSubstituteFromInfoInput extends CreateSignatureRequestTemplatePlaceholdersSignersInner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String label;

	/**
	 * Create new signer.
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfo info;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel#getValue() SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevel#getValue()} 
	 */
	@NotNull
	private SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue SignatureLevel;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode#getValue() SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationMode#getValue()} 
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationModeValue SignatureAuthenticationMode;

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
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryMode#getValue() SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryMode#getValue()} 
	 */
	private SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryModeValue DeliveryMode;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInput() {
		super();
	}

	/**
	 * Getter for label.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#label label}.
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * Getter for info.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#info info}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfo getInfo() {
		return this.info;
	}

	/**
	 * Getter for SignatureLevel.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#SignatureLevel SignatureLevel}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue getSignatureLevel() {
		return this.SignatureLevel;
	}

	/**
	 * Getter for SignatureAuthenticationMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationModeValue getSignatureAuthenticationMode() {
		return this.SignatureAuthenticationMode;
	}

	/**
	 * Getter for redirect_urls.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#redirect_urls redirect_urls}.
	 */
	public FromScratch1RedirectUrls getRedirect_urls() {
		return this.redirect_urls;
	}

	/**
	 * Getter for custom_text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#custom_text custom_text}.
	 */
	public FromScratch1CustomText getCustom_text() {
		return this.custom_text;
	}

	/**
	 * Getter for DeliveryMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#DeliveryMode DeliveryMode}.
	 */
	public SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryModeValue getDeliveryMode() {
		return this.DeliveryMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#label label}.
	 * @param label value to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#info info}.
	 * @param info value to set
	 */
	public void setInfo(SignatureRequestPlaceholderSignerSubstituteFromInfoInputInfo info) {
		this.info = info;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#SignatureLevel SignatureLevel}.
	 * @param SignatureLevel value to set
	 */
	public void setSignatureLevel(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureLevelValue SignatureLevel) {
		this.SignatureLevel = SignatureLevel;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 * @param SignatureAuthenticationMode value to set
	 */
	public void setSignatureAuthenticationMode(SignatureRequestPlaceholderSignerSubstituteFromInfoInputSignatureAuthenticationModeValue SignatureAuthenticationMode) {
		this.SignatureAuthenticationMode = SignatureAuthenticationMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#redirect_urls redirect_urls}.
	 * @param redirect_urls value to set
	 */
	public void setRedirect_urls(FromScratch1RedirectUrls redirect_urls) {
		this.redirect_urls = redirect_urls;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#custom_text custom_text}.
	 * @param custom_text value to set
	 */
	public void setCustom_text(FromScratch1CustomText custom_text) {
		this.custom_text = custom_text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderSignerSubstituteFromInfoInput#DeliveryMode DeliveryMode}.
	 * @param DeliveryMode value to set
	 */
	public void setDeliveryMode(SignatureRequestPlaceholderSignerSubstituteFromInfoInputDeliveryModeValue DeliveryMode) {
		this.DeliveryMode = DeliveryMode;
	}
}
