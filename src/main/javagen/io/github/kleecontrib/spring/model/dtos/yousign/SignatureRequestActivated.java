////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestActivatedAuditTrailLocaleValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestActivatedDeliveryModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestActivatedStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestActivated implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedStatus#getValue() SignatureRequestActivatedStatus#getValue()} 
	 */
	@NotNull
	private SignatureRequestActivatedStatusValue Status;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String name;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedDeliveryMode#getValue() SignatureRequestActivatedDeliveryMode#getValue()} 
	 */
	@NotNull
	private SignatureRequestActivatedDeliveryModeValue DeliveryMode;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String created_at;

	/**
	 * Enable an ordered workflow, each signer will be requested to sign in a sequential order.
	 */
	@NotNull
	private Boolean ordered_signers;

	/**
	 * Non documenté.
	 */
	private SignatureRequestInListReminderSettings reminder_settings;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String timezone;

	/**
	 * Non documenté.
	 */
	private String email_custom_note;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String expiration_date;

	/**
	 * Non documenté.
	 */
	private List<EmbeddedSignerWithSignatureLink> signers;

	/**
	 * Non documenté.
	 */
	private List<ApproverToNotify> approvers;

	/**
	 * Non documenté.
	 */
	private List<SignatureRequestActivatedDocumentsInner> documents;

	/**
	 * Non documenté.
	 */
	private String external_id;

	/**
	 * Non documenté.
	 */
	private String branding_id;

	/**
	 * Non documenté.
	 */
	private String custom_experience_id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedAuditTrailLocale#getValue() SignatureRequestActivatedAuditTrailLocale#getValue()} 
	 */
	@NotNull
	private SignatureRequestActivatedAuditTrailLocaleValue AuditTrailLocale;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestActivated() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for Status.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#Status Status}.
	 */
	public SignatureRequestActivatedStatusValue getStatus() {
		return this.Status;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for DeliveryMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#DeliveryMode DeliveryMode}.
	 */
	public SignatureRequestActivatedDeliveryModeValue getDeliveryMode() {
		return this.DeliveryMode;
	}

	/**
	 * Getter for created_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#created_at created_at}.
	 */
	public String getCreated_at() {
		return this.created_at;
	}

	/**
	 * Getter for ordered_signers.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#ordered_signers ordered_signers}.
	 */
	public Boolean getOrdered_signers() {
		return this.ordered_signers;
	}

	/**
	 * Getter for reminder_settings.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#reminder_settings reminder_settings}.
	 */
	public SignatureRequestInListReminderSettings getReminder_settings() {
		return this.reminder_settings;
	}

	/**
	 * Getter for timezone.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#timezone timezone}.
	 */
	public String getTimezone() {
		return this.timezone;
	}

	/**
	 * Getter for email_custom_note.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#email_custom_note email_custom_note}.
	 */
	public String getEmail_custom_note() {
		return this.email_custom_note;
	}

	/**
	 * Getter for expiration_date.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#expiration_date expiration_date}.
	 */
	public String getExpiration_date() {
		return this.expiration_date;
	}

	/**
	 * Getter for signers.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#signers signers}.
	 */
	public List<EmbeddedSignerWithSignatureLink> getSigners() {
		return this.signers;
	}

	/**
	 * Getter for approvers.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#approvers approvers}.
	 */
	public List<ApproverToNotify> getApprovers() {
		return this.approvers;
	}

	/**
	 * Getter for documents.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#documents documents}.
	 */
	public List<SignatureRequestActivatedDocumentsInner> getDocuments() {
		return this.documents;
	}

	/**
	 * Getter for external_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#external_id external_id}.
	 */
	public String getExternal_id() {
		return this.external_id;
	}

	/**
	 * Getter for branding_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#branding_id branding_id}.
	 */
	public String getBranding_id() {
		return this.branding_id;
	}

	/**
	 * Getter for custom_experience_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#custom_experience_id custom_experience_id}.
	 */
	public String getCustom_experience_id() {
		return this.custom_experience_id;
	}

	/**
	 * Getter for AuditTrailLocale.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#AuditTrailLocale AuditTrailLocale}.
	 */
	public SignatureRequestActivatedAuditTrailLocaleValue getAuditTrailLocale() {
		return this.AuditTrailLocale;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#Status Status}.
	 * @param Status value to set
	 */
	public void setStatus(SignatureRequestActivatedStatusValue Status) {
		this.Status = Status;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#DeliveryMode DeliveryMode}.
	 * @param DeliveryMode value to set
	 */
	public void setDeliveryMode(SignatureRequestActivatedDeliveryModeValue DeliveryMode) {
		this.DeliveryMode = DeliveryMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#created_at created_at}.
	 * @param created_at value to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#ordered_signers ordered_signers}.
	 * @param ordered_signers value to set
	 */
	public void setOrdered_signers(Boolean ordered_signers) {
		this.ordered_signers = ordered_signers;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#reminder_settings reminder_settings}.
	 * @param reminder_settings value to set
	 */
	public void setReminder_settings(SignatureRequestInListReminderSettings reminder_settings) {
		this.reminder_settings = reminder_settings;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#timezone timezone}.
	 * @param timezone value to set
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#email_custom_note email_custom_note}.
	 * @param email_custom_note value to set
	 */
	public void setEmail_custom_note(String email_custom_note) {
		this.email_custom_note = email_custom_note;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#expiration_date expiration_date}.
	 * @param expiration_date value to set
	 */
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#signers signers}.
	 * @param signers value to set
	 */
	public void setSigners(List<EmbeddedSignerWithSignatureLink> signers) {
		this.signers = signers;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#approvers approvers}.
	 * @param approvers value to set
	 */
	public void setApprovers(List<ApproverToNotify> approvers) {
		this.approvers = approvers;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#documents documents}.
	 * @param documents value to set
	 */
	public void setDocuments(List<SignatureRequestActivatedDocumentsInner> documents) {
		this.documents = documents;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#external_id external_id}.
	 * @param external_id value to set
	 */
	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#branding_id branding_id}.
	 * @param branding_id value to set
	 */
	public void setBranding_id(String branding_id) {
		this.branding_id = branding_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#custom_experience_id custom_experience_id}.
	 * @param custom_experience_id value to set
	 */
	public void setCustom_experience_id(String custom_experience_id) {
		this.custom_experience_id = custom_experience_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated#AuditTrailLocale AuditTrailLocale}.
	 * @param AuditTrailLocale value to set
	 */
	public void setAuditTrailLocale(SignatureRequestActivatedAuditTrailLocaleValue AuditTrailLocale) {
		this.AuditTrailLocale = AuditTrailLocale;
	}
}
