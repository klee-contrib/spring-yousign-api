////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.EmbeddedSignerWithSignatureLinkStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class EmbeddedSignerWithSignatureLink implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.EmbeddedSignerWithSignatureLinkStatus#getValue() EmbeddedSignerWithSignatureLinkStatus#getValue()} 
	 */
	@NotNull
	private EmbeddedSignerWithSignatureLinkStatusValue Status;

	/**
	 * Non documenté.
	 */
	private String signature_link;

	/**
	 * Non documenté.
	 */
	private String signature_link_expiration_date;

	/**
	 * No arg constructor.
	 */
	public EmbeddedSignerWithSignatureLink() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.EmbeddedSignerWithSignatureLink#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for Status.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.EmbeddedSignerWithSignatureLink#Status Status}.
	 */
	public EmbeddedSignerWithSignatureLinkStatusValue getStatus() {
		return this.Status;
	}

	/**
	 * Getter for signature_link.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.EmbeddedSignerWithSignatureLink#signature_link signature_link}.
	 */
	public String getSignature_link() {
		return this.signature_link;
	}

	/**
	 * Getter for signature_link_expiration_date.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.EmbeddedSignerWithSignatureLink#signature_link_expiration_date signature_link_expiration_date}.
	 */
	public String getSignature_link_expiration_date() {
		return this.signature_link_expiration_date;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.EmbeddedSignerWithSignatureLink#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.EmbeddedSignerWithSignatureLink#Status Status}.
	 * @param Status value to set
	 */
	public void setStatus(EmbeddedSignerWithSignatureLinkStatusValue Status) {
		this.Status = Status;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.EmbeddedSignerWithSignatureLink#signature_link signature_link}.
	 * @param signature_link value to set
	 */
	public void setSignature_link(String signature_link) {
		this.signature_link = signature_link;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.EmbeddedSignerWithSignatureLink#signature_link_expiration_date signature_link_expiration_date}.
	 * @param signature_link_expiration_date value to set
	 */
	public void setSignature_link_expiration_date(String signature_link_expiration_date) {
		this.signature_link_expiration_date = signature_link_expiration_date;
	}
}
