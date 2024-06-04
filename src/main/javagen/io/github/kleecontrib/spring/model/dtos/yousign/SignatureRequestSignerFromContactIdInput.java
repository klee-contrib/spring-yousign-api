////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSignerFromContactIdInputSignatureAuthenticationModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSignerFromContactIdInputSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Create signer from a contact.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestSignerFromContactIdInput extends CreateSignatureRequestSignersInner implements Serializable {
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
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInputSignatureLevel#getValue() SignatureRequestSignerFromContactIdInputSignatureLevel#getValue()} 
	 */
	@NotNull
	private SignatureRequestSignerFromContactIdInputSignatureLevelValue SignatureLevel;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode#getValue() SignatureRequestSignerFromContactIdInputSignatureAuthenticationMode#getValue()} 
	 */
	private SignatureRequestSignerFromContactIdInputSignatureAuthenticationModeValue SignatureAuthenticationMode;

	/**
	 * Non documenté.
	 */
	private FromScratch1RedirectUrls redirect_urls;

	/**
	 * Non documenté.
	 */
	private FromScratch1CustomText custom_text;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestSignerFromContactIdInput() {
		super();
	}

	/**
	 * Getter for contact_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInput#contact_id contact_id}.
	 */
	public String getContact_id() {
		return this.contact_id;
	}

	/**
	 * Getter for fields.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInput#fields fields}.
	 */
	public List<FieldsInput> getFields() {
		return this.fields;
	}

	/**
	 * Getter for SignatureLevel.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInput#SignatureLevel SignatureLevel}.
	 */
	public SignatureRequestSignerFromContactIdInputSignatureLevelValue getSignatureLevel() {
		return this.SignatureLevel;
	}

	/**
	 * Getter for SignatureAuthenticationMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInput#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 */
	public SignatureRequestSignerFromContactIdInputSignatureAuthenticationModeValue getSignatureAuthenticationMode() {
		return this.SignatureAuthenticationMode;
	}

	/**
	 * Getter for redirect_urls.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInput#redirect_urls redirect_urls}.
	 */
	public FromScratch1RedirectUrls getRedirect_urls() {
		return this.redirect_urls;
	}

	/**
	 * Getter for custom_text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInput#custom_text custom_text}.
	 */
	public FromScratch1CustomText getCustom_text() {
		return this.custom_text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInput#contact_id contact_id}.
	 * @param contact_id value to set
	 */
	public void setContact_id(String contact_id) {
		this.contact_id = contact_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInput#fields fields}.
	 * @param fields value to set
	 */
	public void setFields(List<FieldsInput> fields) {
		this.fields = fields;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInput#SignatureLevel SignatureLevel}.
	 * @param SignatureLevel value to set
	 */
	public void setSignatureLevel(SignatureRequestSignerFromContactIdInputSignatureLevelValue SignatureLevel) {
		this.SignatureLevel = SignatureLevel;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInput#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 * @param SignatureAuthenticationMode value to set
	 */
	public void setSignatureAuthenticationMode(SignatureRequestSignerFromContactIdInputSignatureAuthenticationModeValue SignatureAuthenticationMode) {
		this.SignatureAuthenticationMode = SignatureAuthenticationMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInput#redirect_urls redirect_urls}.
	 * @param redirect_urls value to set
	 */
	public void setRedirect_urls(FromScratch1RedirectUrls redirect_urls) {
		this.redirect_urls = redirect_urls;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromContactIdInput#custom_text custom_text}.
	 * @param custom_text value to set
	 */
	public void setCustom_text(FromScratch1CustomText custom_text) {
		this.custom_text = custom_text;
	}
}
