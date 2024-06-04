////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSignerFromInfoInputSignatureAuthenticationModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSignerFromInfoInputSignatureLevelValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Create a signer from info.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestSignerFromInfoInput extends CreateSignatureRequestSignersInner implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * create new signer.
	 */
	private SignatureRequestSignerFromInfoInputInfo info;

	/**
	 * Non documenté.
	 */
	private List<FieldsInput> fields;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInputSignatureLevel#getValue() SignatureRequestSignerFromInfoInputSignatureLevel#getValue()} 
	 */
	@NotNull
	private SignatureRequestSignerFromInfoInputSignatureLevelValue SignatureLevel;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInputSignatureAuthenticationMode#getValue() SignatureRequestSignerFromInfoInputSignatureAuthenticationMode#getValue()} 
	 */
	private SignatureRequestSignerFromInfoInputSignatureAuthenticationModeValue SignatureAuthenticationMode;

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
	public SignatureRequestSignerFromInfoInput() {
		super();
	}

	/**
	 * Getter for info.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInput#info info}.
	 */
	public SignatureRequestSignerFromInfoInputInfo getInfo() {
		return this.info;
	}

	/**
	 * Getter for fields.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInput#fields fields}.
	 */
	public List<FieldsInput> getFields() {
		return this.fields;
	}

	/**
	 * Getter for SignatureLevel.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInput#SignatureLevel SignatureLevel}.
	 */
	public SignatureRequestSignerFromInfoInputSignatureLevelValue getSignatureLevel() {
		return this.SignatureLevel;
	}

	/**
	 * Getter for SignatureAuthenticationMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInput#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 */
	public SignatureRequestSignerFromInfoInputSignatureAuthenticationModeValue getSignatureAuthenticationMode() {
		return this.SignatureAuthenticationMode;
	}

	/**
	 * Getter for redirect_urls.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInput#redirect_urls redirect_urls}.
	 */
	public FromScratch1RedirectUrls getRedirect_urls() {
		return this.redirect_urls;
	}

	/**
	 * Getter for custom_text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInput#custom_text custom_text}.
	 */
	public FromScratch1CustomText getCustom_text() {
		return this.custom_text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInput#info info}.
	 * @param info value to set
	 */
	public void setInfo(SignatureRequestSignerFromInfoInputInfo info) {
		this.info = info;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInput#fields fields}.
	 * @param fields value to set
	 */
	public void setFields(List<FieldsInput> fields) {
		this.fields = fields;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInput#SignatureLevel SignatureLevel}.
	 * @param SignatureLevel value to set
	 */
	public void setSignatureLevel(SignatureRequestSignerFromInfoInputSignatureLevelValue SignatureLevel) {
		this.SignatureLevel = SignatureLevel;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInput#SignatureAuthenticationMode SignatureAuthenticationMode}.
	 * @param SignatureAuthenticationMode value to set
	 */
	public void setSignatureAuthenticationMode(SignatureRequestSignerFromInfoInputSignatureAuthenticationModeValue SignatureAuthenticationMode) {
		this.SignatureAuthenticationMode = SignatureAuthenticationMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInput#redirect_urls redirect_urls}.
	 * @param redirect_urls value to set
	 */
	public void setRedirect_urls(FromScratch1RedirectUrls redirect_urls) {
		this.redirect_urls = redirect_urls;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSignerFromInfoInput#custom_text custom_text}.
	 * @param custom_text value to set
	 */
	public void setCustom_text(FromScratch1CustomText custom_text) {
		this.custom_text = custom_text;
	}
}
