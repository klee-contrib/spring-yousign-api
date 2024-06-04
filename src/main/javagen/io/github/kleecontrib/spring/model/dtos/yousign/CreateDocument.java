////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateDocumentNatureValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateDocument implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Binary file.
	 */
	@NotNull
	private byte[] file;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocumentNature#getValue() CreateDocumentNature#getValue()} 
	 */
	@NotNull
	private CreateDocumentNatureValue Nature;

	/**
	 * Insert just after the position of the specified document id.
	 */
	@NotNull
	private String insert_after_id;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String password;

	/**
	 * Non documenté.
	 */
	private InitialsArea initials;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean parse_anchors;

	/**
	 * No arg constructor.
	 */
	public CreateDocument() {
	}

	/**
	 * Getter for file.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument#file file}.
	 */
	public byte[] getFile() {
		return this.file;
	}

	/**
	 * Getter for Nature.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument#Nature Nature}.
	 */
	public CreateDocumentNatureValue getNature() {
		return this.Nature;
	}

	/**
	 * Getter for insert_after_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument#insert_after_id insert_after_id}.
	 */
	public String getInsert_after_id() {
		return this.insert_after_id;
	}

	/**
	 * Getter for password.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument#password password}.
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Getter for initials.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument#initials initials}.
	 */
	public InitialsArea getInitials() {
		return this.initials;
	}

	/**
	 * Getter for parse_anchors.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument#parse_anchors parse_anchors}.
	 */
	public Boolean getParse_anchors() {
		return this.parse_anchors;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument#file file}.
	 * @param file value to set
	 */
	public void setFile(byte[] file) {
		this.file = file;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument#Nature Nature}.
	 * @param Nature value to set
	 */
	public void setNature(CreateDocumentNatureValue Nature) {
		this.Nature = Nature;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument#insert_after_id insert_after_id}.
	 * @param insert_after_id value to set
	 */
	public void setInsert_after_id(String insert_after_id) {
		this.insert_after_id = insert_after_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument#password password}.
	 * @param password value to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument#initials initials}.
	 * @param initials value to set
	 */
	public void setInitials(InitialsArea initials) {
		this.initials = initials;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument#parse_anchors parse_anchors}.
	 * @param parse_anchors value to set
	 */
	public void setParse_anchors(Boolean parse_anchors) {
		this.parse_anchors = parse_anchors;
	}
}
