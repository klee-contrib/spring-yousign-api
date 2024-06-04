////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Signer Document.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignerDocument implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the signer document.
	 */
	@NotNull
	private String id;

	/**
	 * Title of the document request.
	 */
	@NotNull
	private String title;

	/**
	 * Non documenté.
	 */
	private String filename;

	/**
	 * No arg constructor.
	 */
	public SignerDocument() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocument#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for title.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocument#title title}.
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Getter for filename.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocument#filename filename}.
	 */
	public String getFilename() {
		return this.filename;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocument#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocument#title title}.
	 * @param title value to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerDocument#filename filename}.
	 * @param filename value to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
}
