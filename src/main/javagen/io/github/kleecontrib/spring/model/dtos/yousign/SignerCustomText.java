////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignerCustomText implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private String request_subject;

	/**
	 * Non documenté.
	 */
	private String request_body;

	/**
	 * Non documenté.
	 */
	private String reminder_subject;

	/**
	 * Non documenté.
	 */
	private String reminder_body;

	/**
	 * No arg constructor.
	 */
	public SignerCustomText() {
	}

	/**
	 * Getter for request_subject.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerCustomText#request_subject request_subject}.
	 */
	public String getRequest_subject() {
		return this.request_subject;
	}

	/**
	 * Getter for request_body.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerCustomText#request_body request_body}.
	 */
	public String getRequest_body() {
		return this.request_body;
	}

	/**
	 * Getter for reminder_subject.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerCustomText#reminder_subject reminder_subject}.
	 */
	public String getReminder_subject() {
		return this.reminder_subject;
	}

	/**
	 * Getter for reminder_body.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerCustomText#reminder_body reminder_body}.
	 */
	public String getReminder_body() {
		return this.reminder_body;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerCustomText#request_subject request_subject}.
	 * @param request_subject value to set
	 */
	public void setRequest_subject(String request_subject) {
		this.request_subject = request_subject;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerCustomText#request_body request_body}.
	 * @param request_body value to set
	 */
	public void setRequest_body(String request_body) {
		this.request_body = request_body;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerCustomText#reminder_subject reminder_subject}.
	 * @param reminder_subject value to set
	 */
	public void setReminder_subject(String reminder_subject) {
		this.reminder_subject = reminder_subject;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignerCustomText#reminder_body reminder_body}.
	 * @param reminder_body value to set
	 */
	public void setReminder_body(String reminder_body) {
		this.reminder_body = reminder_body;
	}
}
