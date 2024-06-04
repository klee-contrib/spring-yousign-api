////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import io.github.kleecontrib.spring.model.enums.yousign.SignerDeliveryModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignerSignatureAuthenticationModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignerSignatureLevelValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignerStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Signer.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class Signer implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String id;

	/**
	 * Non documenté.
	 */
	private SignerInfo info;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerStatus#getValue() SignerStatus#getValue()} 
	 */
	@NotNull
	private SignerStatusValue Status;

	/**
	 * Non documenté.
	 */
	private List<SignerFieldsInner> fields;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerSignatureLevel#getValue() SignerSignatureLevel#getValue()} 
	 */
	@NotNull
	private SignerSignatureLevelValue SignatureLevel;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerSignatureAuthenticationMode#getValue() SignerSignatureAuthenticationMode#getValue()} 
	 */
	private SignerSignatureAuthenticationModeValue SignatureAuthenticationMode;

	/**
	 * Non documenté.
	 */
	private String signature_link;

	/**
	 * Non documenté.
	 */
	private String signature_link_expiration_date;

	/**
	 * Non documenté.
	 */
	private String signature_image_preview;

	/**
	 * Non documenté.
	 */
	private SignerRedirectUrls redirect_urls;

	/**
	 * Non documenté.
	 */
	private SignerCustomText custom_text;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDeliveryMode#getValue() SignerDeliveryMode#getValue()} 
	 */
	private SignerDeliveryModeValue DeliveryMode;

	/**
	 * Non documenté.
	 */
	private String identification_attestation_id;

	/**
	 * No arg constructor.
	 */
	public Signer() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for info.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#info info}.
	 */
	public SignerInfo getInfo() {
		return this.info;
	}

	/**
	 * Getter for Status.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#Status Status}.
	 */
	public SignerStatusValue getStatus() {
		return this.Status;
	}

	/**
	 * Getter for fields.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#fields fields}.
	 */
	public List<SignerFieldsInner> getFields() {
		return this.fields;
	}

	/**
	 * Getter for SignatureLevel.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#SignatureLevel SignatureLevel}.
	 */
	public SignerSignatureLevelValue getSignatureLevel() {
		return this.SignatureLevel;
	}

	/**
	 * Getter for SignatureAuthenticationMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 */
	public SignerSignatureAuthenticationModeValue getSignatureAuthenticationMode() {
		return this.SignatureAuthenticationMode;
	}

	/**
	 * Getter for signature_link.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#signature_link signature_link}.
	 */
	public String getSignature_link() {
		return this.signature_link;
	}

	/**
	 * Getter for signature_link_expiration_date.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#signature_link_expiration_date signature_link_expiration_date}.
	 */
	public String getSignature_link_expiration_date() {
		return this.signature_link_expiration_date;
	}

	/**
	 * Getter for signature_image_preview.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#signature_image_preview signature_image_preview}.
	 */
	public String getSignature_image_preview() {
		return this.signature_image_preview;
	}

	/**
	 * Getter for redirect_urls.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#redirect_urls redirect_urls}.
	 */
	public SignerRedirectUrls getRedirect_urls() {
		return this.redirect_urls;
	}

	/**
	 * Getter for custom_text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#custom_text custom_text}.
	 */
	public SignerCustomText getCustom_text() {
		return this.custom_text;
	}

	/**
	 * Getter for DeliveryMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#DeliveryMode DeliveryMode}.
	 */
	public SignerDeliveryModeValue getDeliveryMode() {
		return this.DeliveryMode;
	}

	/**
	 * Getter for identification_attestation_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#identification_attestation_id identification_attestation_id}.
	 */
	public String getIdentification_attestation_id() {
		return this.identification_attestation_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#info info}.
	 * @param info value to set
	 */
	public void setInfo(SignerInfo info) {
		this.info = info;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#Status Status}.
	 * @param Status value to set
	 */
	public void setStatus(SignerStatusValue Status) {
		this.Status = Status;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#fields fields}.
	 * @param fields value to set
	 */
	public void setFields(List<SignerFieldsInner> fields) {
		this.fields = fields;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#SignatureLevel SignatureLevel}.
	 * @param SignatureLevel value to set
	 */
	public void setSignatureLevel(SignerSignatureLevelValue SignatureLevel) {
		this.SignatureLevel = SignatureLevel;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 * @param SignatureAuthenticationMode value to set
	 */
	public void setSignatureAuthenticationMode(SignerSignatureAuthenticationModeValue SignatureAuthenticationMode) {
		this.SignatureAuthenticationMode = SignatureAuthenticationMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#signature_link signature_link}.
	 * @param signature_link value to set
	 */
	public void setSignature_link(String signature_link) {
		this.signature_link = signature_link;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#signature_link_expiration_date signature_link_expiration_date}.
	 * @param signature_link_expiration_date value to set
	 */
	public void setSignature_link_expiration_date(String signature_link_expiration_date) {
		this.signature_link_expiration_date = signature_link_expiration_date;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#signature_image_preview signature_image_preview}.
	 * @param signature_image_preview value to set
	 */
	public void setSignature_image_preview(String signature_image_preview) {
		this.signature_image_preview = signature_image_preview;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#redirect_urls redirect_urls}.
	 * @param redirect_urls value to set
	 */
	public void setRedirect_urls(SignerRedirectUrls redirect_urls) {
		this.redirect_urls = redirect_urls;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#custom_text custom_text}.
	 * @param custom_text value to set
	 */
	public void setCustom_text(SignerCustomText custom_text) {
		this.custom_text = custom_text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#DeliveryMode DeliveryMode}.
	 * @param DeliveryMode value to set
	 */
	public void setDeliveryMode(SignerDeliveryModeValue DeliveryMode) {
		this.DeliveryMode = DeliveryMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Signer#identification_attestation_id identification_attestation_id}.
	 * @param identification_attestation_id value to set
	 */
	public void setIdentification_attestation_id(String identification_attestation_id) {
		this.identification_attestation_id = identification_attestation_id;
	}
}
