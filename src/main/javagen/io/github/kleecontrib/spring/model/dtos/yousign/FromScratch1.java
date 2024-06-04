////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import io.github.kleecontrib.spring.model.enums.yousign.FromScratch1DeliveryModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.FromScratch1SignatureAuthenticationModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.FromScratch1SignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Create a new signer from scratch.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FromScratch1 extends CreateSigner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private FromScratch1Info info;

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
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1SignatureLevel#getValue() FromScratch1SignatureLevel#getValue()} 
	 */
	@NotNull
	private FromScratch1SignatureLevelValue SignatureLevel;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1SignatureAuthenticationMode#getValue() FromScratch1SignatureAuthenticationMode#getValue()} 
	 */
	private FromScratch1SignatureAuthenticationModeValue SignatureAuthenticationMode;

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
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1DeliveryMode#getValue() FromScratch1DeliveryMode#getValue()} 
	 */
	private FromScratch1DeliveryModeValue DeliveryMode;

	/**
	 * Non documenté.
	 */
	private String identification_attestation_id;

	/**
	 * No arg constructor.
	 */
	public FromScratch1() {
		super();
	}

	/**
	 * Getter for info.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#info info}.
	 */
	public FromScratch1Info getInfo() {
		return this.info;
	}

	/**
	 * Getter for fields.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#fields fields}.
	 */
	public List<FieldsInput> getFields() {
		return this.fields;
	}

	/**
	 * Getter for insert_after_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#insert_after_id insert_after_id}.
	 */
	public String getInsert_after_id() {
		return this.insert_after_id;
	}

	/**
	 * Getter for SignatureLevel.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#SignatureLevel SignatureLevel}.
	 */
	public FromScratch1SignatureLevelValue getSignatureLevel() {
		return this.SignatureLevel;
	}

	/**
	 * Getter for SignatureAuthenticationMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 */
	public FromScratch1SignatureAuthenticationModeValue getSignatureAuthenticationMode() {
		return this.SignatureAuthenticationMode;
	}

	/**
	 * Getter for redirect_urls.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#redirect_urls redirect_urls}.
	 */
	public FromScratch1RedirectUrls getRedirect_urls() {
		return this.redirect_urls;
	}

	/**
	 * Getter for custom_text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#custom_text custom_text}.
	 */
	public FromScratch1CustomText getCustom_text() {
		return this.custom_text;
	}

	/**
	 * Getter for DeliveryMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#DeliveryMode DeliveryMode}.
	 */
	public FromScratch1DeliveryModeValue getDeliveryMode() {
		return this.DeliveryMode;
	}

	/**
	 * Getter for identification_attestation_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#identification_attestation_id identification_attestation_id}.
	 */
	public String getIdentification_attestation_id() {
		return this.identification_attestation_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#info info}.
	 * @param info value to set
	 */
	public void setInfo(FromScratch1Info info) {
		this.info = info;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#fields fields}.
	 * @param fields value to set
	 */
	public void setFields(List<FieldsInput> fields) {
		this.fields = fields;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#insert_after_id insert_after_id}.
	 * @param insert_after_id value to set
	 */
	public void setInsert_after_id(String insert_after_id) {
		this.insert_after_id = insert_after_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#SignatureLevel SignatureLevel}.
	 * @param SignatureLevel value to set
	 */
	public void setSignatureLevel(FromScratch1SignatureLevelValue SignatureLevel) {
		this.SignatureLevel = SignatureLevel;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 * @param SignatureAuthenticationMode value to set
	 */
	public void setSignatureAuthenticationMode(FromScratch1SignatureAuthenticationModeValue SignatureAuthenticationMode) {
		this.SignatureAuthenticationMode = SignatureAuthenticationMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#redirect_urls redirect_urls}.
	 * @param redirect_urls value to set
	 */
	public void setRedirect_urls(FromScratch1RedirectUrls redirect_urls) {
		this.redirect_urls = redirect_urls;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#custom_text custom_text}.
	 * @param custom_text value to set
	 */
	public void setCustom_text(FromScratch1CustomText custom_text) {
		this.custom_text = custom_text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#DeliveryMode DeliveryMode}.
	 * @param DeliveryMode value to set
	 */
	public void setDeliveryMode(FromScratch1DeliveryModeValue DeliveryMode) {
		this.DeliveryMode = DeliveryMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1#identification_attestation_id identification_attestation_id}.
	 * @param identification_attestation_id value to set
	 */
	public void setIdentification_attestation_id(String identification_attestation_id) {
		this.identification_attestation_id = identification_attestation_id;
	}
}
