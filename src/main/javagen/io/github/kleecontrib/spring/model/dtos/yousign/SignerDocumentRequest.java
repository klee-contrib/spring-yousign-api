////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Signer Document Request attached to a Signature Request.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignerDocumentRequest implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the Signer Document Request.
	 */
	@NotNull
	private String id;

	/**
	 * Title of the document request.
	 */
	@NotNull
	private String title;

	/**
	 * Define if the document request is optional for the Signers.
	 */
	@NotNull
	private Boolean optional;

	/**
	 * Ids of Signers to request a document.
	 */
	@NotNull
	private String signer_ids;

	/**
	 * No arg constructor.
	 */
	public SignerDocumentRequest() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocumentRequest#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for title.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocumentRequest#title title}.
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Getter for optional.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocumentRequest#optional optional}.
	 */
	public Boolean getOptional() {
		return this.optional;
	}

	/**
	 * Getter for signer_ids.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocumentRequest#signer_ids signer_ids}.
	 */
	public String getSigner_ids() {
		return this.signer_ids;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocumentRequest#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocumentRequest#title title}.
	 * @param title value to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocumentRequest#optional optional}.
	 * @param optional value to set
	 */
	public void setOptional(Boolean optional) {
		this.optional = optional;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocumentRequest#signer_ids signer_ids}.
	 * @param signer_ids value to set
	 */
	public void setSigner_ids(String signer_ids) {
		this.signer_ids = signer_ids;
	}
}
