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
public class CreateSignerDocumentRequest implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String title;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean optional;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String signer_ids;

	/**
	 * No arg constructor.
	 */
	public CreateSignerDocumentRequest() {
	}

	/**
	 * Getter for title.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignerDocumentRequest#title title}.
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Getter for optional.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignerDocumentRequest#optional optional}.
	 */
	public Boolean getOptional() {
		return this.optional;
	}

	/**
	 * Getter for signer_ids.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignerDocumentRequest#signer_ids signer_ids}.
	 */
	public String getSigner_ids() {
		return this.signer_ids;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignerDocumentRequest#title title}.
	 * @param title value to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignerDocumentRequest#optional optional}.
	 * @param optional value to set
	 */
	public void setOptional(Boolean optional) {
		this.optional = optional;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignerDocumentRequest#signer_ids signer_ids}.
	 * @param signer_ids value to set
	 */
	public void setSigner_ids(String signer_ids) {
		this.signer_ids = signer_ids;
	}
}
