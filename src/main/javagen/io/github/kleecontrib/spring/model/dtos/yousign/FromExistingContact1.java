////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import io.github.kleecontrib.spring.model.enums.yousign.FromExistingContact1DeliveryModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.FromExistingContact1SignatureAuthenticationModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.FromExistingContact1SignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Create a new signer from an existing contact.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromExistingContact1 extends CreateSigner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Create signer from an existing contact.
	 */
	@NotNull
	private String contact_id;

	/**
	 * Non documenté.
	 */
	private List<FieldsInput> fields;

	/**
	 * Insert just after the position of the specified signer id.
	 */
	private String insert_after_id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1SignatureLevel#getValue() FromExistingContact1SignatureLevel#getValue()} 
	 */
	@NotNull
	private FromExistingContact1SignatureLevelValue SignatureLevel;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1SignatureAuthenticationMode#getValue() FromExistingContact1SignatureAuthenticationMode#getValue()} 
	 */
	private FromExistingContact1SignatureAuthenticationModeValue SignatureAuthenticationMode;

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
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1DeliveryMode#getValue() FromExistingContact1DeliveryMode#getValue()} 
	 */
	private FromExistingContact1DeliveryModeValue DeliveryMode;

	/**
	 * Non documenté.
	 */
	private String identification_attestation_id;

	/**
	 * No arg constructor.
	 */
	public FromExistingContact1() {
		super();
	}

	/**
	 * Getter for contact_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#contact_id contact_id}.
	 */
	public String getContact_id() {
		return this.contact_id;
	}

	/**
	 * Getter for fields.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#fields fields}.
	 */
	public List<FieldsInput> getFields() {
		return this.fields;
	}

	/**
	 * Getter for insert_after_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#insert_after_id insert_after_id}.
	 */
	public String getInsert_after_id() {
		return this.insert_after_id;
	}

	/**
	 * Getter for SignatureLevel.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#SignatureLevel SignatureLevel}.
	 */
	public FromExistingContact1SignatureLevelValue getSignatureLevel() {
		return this.SignatureLevel;
	}

	/**
	 * Getter for SignatureAuthenticationMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 */
	public FromExistingContact1SignatureAuthenticationModeValue getSignatureAuthenticationMode() {
		return this.SignatureAuthenticationMode;
	}

	/**
	 * Getter for redirect_urls.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#redirect_urls redirect_urls}.
	 */
	public FromScratch1RedirectUrls getRedirect_urls() {
		return this.redirect_urls;
	}

	/**
	 * Getter for custom_text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#custom_text custom_text}.
	 */
	public FromScratch1CustomText getCustom_text() {
		return this.custom_text;
	}

	/**
	 * Getter for DeliveryMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#DeliveryMode DeliveryMode}.
	 */
	public FromExistingContact1DeliveryModeValue getDeliveryMode() {
		return this.DeliveryMode;
	}

	/**
	 * Getter for identification_attestation_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#identification_attestation_id identification_attestation_id}.
	 */
	public String getIdentification_attestation_id() {
		return this.identification_attestation_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#contact_id contact_id}.
	 * @param contact_id value to set
	 */
	public void setContact_id(String contact_id) {
		this.contact_id = contact_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#fields fields}.
	 * @param fields value to set
	 */
	public void setFields(List<FieldsInput> fields) {
		this.fields = fields;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#insert_after_id insert_after_id}.
	 * @param insert_after_id value to set
	 */
	public void setInsert_after_id(String insert_after_id) {
		this.insert_after_id = insert_after_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#SignatureLevel SignatureLevel}.
	 * @param SignatureLevel value to set
	 */
	public void setSignatureLevel(FromExistingContact1SignatureLevelValue SignatureLevel) {
		this.SignatureLevel = SignatureLevel;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 * @param SignatureAuthenticationMode value to set
	 */
	public void setSignatureAuthenticationMode(FromExistingContact1SignatureAuthenticationModeValue SignatureAuthenticationMode) {
		this.SignatureAuthenticationMode = SignatureAuthenticationMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#redirect_urls redirect_urls}.
	 * @param redirect_urls value to set
	 */
	public void setRedirect_urls(FromScratch1RedirectUrls redirect_urls) {
		this.redirect_urls = redirect_urls;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#custom_text custom_text}.
	 * @param custom_text value to set
	 */
	public void setCustom_text(FromScratch1CustomText custom_text) {
		this.custom_text = custom_text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#DeliveryMode DeliveryMode}.
	 * @param DeliveryMode value to set
	 */
	public void setDeliveryMode(FromExistingContact1DeliveryModeValue DeliveryMode) {
		this.DeliveryMode = DeliveryMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromExistingContact1#identification_attestation_id identification_attestation_id}.
	 * @param identification_attestation_id value to set
	 */
	public void setIdentification_attestation_id(String identification_attestation_id) {
		this.identification_attestation_id = identification_attestation_id;
	}
}
