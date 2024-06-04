////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.ApproverStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Approver.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class Approver implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.ApproverStatus#getValue() ApproverStatus#getValue()} 
	 */
	@NotNull
	private ApproverStatusValue Status;

	/**
	 * Non documenté.
	 */
	private ApproverInfo info;

	/**
	 * Non documenté.
	 */
	private String approval_link;

	/**
	 * Non documenté.
	 */
	private String approval_link_expiration_date;

	/**
	 * No arg constructor.
	 */
	public Approver() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Approver#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for Status.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Approver#Status Status}.
	 */
	public ApproverStatusValue getStatus() {
		return this.Status;
	}

	/**
	 * Getter for info.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Approver#info info}.
	 */
	public ApproverInfo getInfo() {
		return this.info;
	}

	/**
	 * Getter for approval_link.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Approver#approval_link approval_link}.
	 */
	public String getApproval_link() {
		return this.approval_link;
	}

	/**
	 * Getter for approval_link_expiration_date.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Approver#approval_link_expiration_date approval_link_expiration_date}.
	 */
	public String getApproval_link_expiration_date() {
		return this.approval_link_expiration_date;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Approver#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Approver#Status Status}.
	 * @param Status value to set
	 */
	public void setStatus(ApproverStatusValue Status) {
		this.Status = Status;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Approver#info info}.
	 * @param info value to set
	 */
	public void setInfo(ApproverInfo info) {
		this.info = info;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Approver#approval_link approval_link}.
	 * @param approval_link value to set
	 */
	public void setApproval_link(String approval_link) {
		this.approval_link = approval_link;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Approver#approval_link_expiration_date approval_link_expiration_date}.
	 * @param approval_link_expiration_date value to set
	 */
	public void setApproval_link_expiration_date(String approval_link_expiration_date) {
		this.approval_link_expiration_date = approval_link_expiration_date;
	}
}
