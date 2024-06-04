////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestAuditTrailLocaleValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestDeliveryModeValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSourceValue;
import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequest implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestStatus#getValue() SignatureRequestStatus#getValue()} 
	 */
	@NotNull
	private SignatureRequestStatusValue Status;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String name;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestDeliveryMode#getValue() SignatureRequestDeliveryMode#getValue()} 
	 */
	@NotNull
	private SignatureRequestDeliveryModeValue DeliveryMode;

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
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSource#getValue() SignatureRequestSource#getValue()} 
	 */
	@NotNull
	private SignatureRequestSourceValue Source;

	/**
	 * Non documenté.
	 */
	private List<SignatureRequestInListSignersInner> signers;

	/**
	 * Non documenté.
	 */
	private List<SignatureRequestInListApproversInner> approvers;

	/**
	 * Non documenté.
	 */
	private List<SignatureRequestInListDocumentsInner> documents;

	/**
	 * Non documenté.
	 */
	private SignatureRequestInListSender sender;

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
	 */
	@NotNull
	private Boolean signers_allowed_to_decline;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String workspace_id;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestAuditTrailLocale#getValue() SignatureRequestAuditTrailLocale#getValue()} 
	 */
	@NotNull
	private SignatureRequestAuditTrailLocaleValue AuditTrailLocale;

	/**
	 * Non documenté.
	 */
	private SignatureRequestEmailNotification email_notification;

	/**
	 * Non documenté.
	 */
	private String bulk_send_batch_id;

	/**
	 * Non documenté.
	 */
	private SignatureRequestDeclineInformation decline_information;

	/**
	 * No arg constructor.
	 */
	public SignatureRequest() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for Status.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#Status Status}.
	 */
	public SignatureRequestStatusValue getStatus() {
		return this.Status;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for DeliveryMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#DeliveryMode DeliveryMode}.
	 */
	public SignatureRequestDeliveryModeValue getDeliveryMode() {
		return this.DeliveryMode;
	}

	/**
	 * Getter for created_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#created_at created_at}.
	 */
	public String getCreated_at() {
		return this.created_at;
	}

	/**
	 * Getter for ordered_signers.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#ordered_signers ordered_signers}.
	 */
	public Boolean getOrdered_signers() {
		return this.ordered_signers;
	}

	/**
	 * Getter for reminder_settings.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#reminder_settings reminder_settings}.
	 */
	public SignatureRequestInListReminderSettings getReminder_settings() {
		return this.reminder_settings;
	}

	/**
	 * Getter for timezone.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#timezone timezone}.
	 */
	public String getTimezone() {
		return this.timezone;
	}

	/**
	 * Getter for email_custom_note.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#email_custom_note email_custom_note}.
	 */
	public String getEmail_custom_note() {
		return this.email_custom_note;
	}

	/**
	 * Getter for expiration_date.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#expiration_date expiration_date}.
	 */
	public String getExpiration_date() {
		return this.expiration_date;
	}

	/**
	 * Getter for Source.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#Source Source}.
	 */
	public SignatureRequestSourceValue getSource() {
		return this.Source;
	}

	/**
	 * Getter for signers.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#signers signers}.
	 */
	public List<SignatureRequestInListSignersInner> getSigners() {
		return this.signers;
	}

	/**
	 * Getter for approvers.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#approvers approvers}.
	 */
	public List<SignatureRequestInListApproversInner> getApprovers() {
		return this.approvers;
	}

	/**
	 * Getter for documents.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#documents documents}.
	 */
	public List<SignatureRequestInListDocumentsInner> getDocuments() {
		return this.documents;
	}

	/**
	 * Getter for sender.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#sender sender}.
	 */
	public SignatureRequestInListSender getSender() {
		return this.sender;
	}

	/**
	 * Getter for external_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#external_id external_id}.
	 */
	public String getExternal_id() {
		return this.external_id;
	}

	/**
	 * Getter for branding_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#branding_id branding_id}.
	 */
	public String getBranding_id() {
		return this.branding_id;
	}

	/**
	 * Getter for custom_experience_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#custom_experience_id custom_experience_id}.
	 */
	public String getCustom_experience_id() {
		return this.custom_experience_id;
	}

	/**
	 * Getter for signers_allowed_to_decline.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#signers_allowed_to_decline signers_allowed_to_decline}.
	 */
	public Boolean getSigners_allowed_to_decline() {
		return this.signers_allowed_to_decline;
	}

	/**
	 * Getter for workspace_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#workspace_id workspace_id}.
	 */
	public String getWorkspace_id() {
		return this.workspace_id;
	}

	/**
	 * Getter for AuditTrailLocale.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#AuditTrailLocale AuditTrailLocale}.
	 */
	public SignatureRequestAuditTrailLocaleValue getAuditTrailLocale() {
		return this.AuditTrailLocale;
	}

	/**
	 * Getter for email_notification.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#email_notification email_notification}.
	 */
	public SignatureRequestEmailNotification getEmail_notification() {
		return this.email_notification;
	}

	/**
	 * Getter for bulk_send_batch_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#bulk_send_batch_id bulk_send_batch_id}.
	 */
	public String getBulk_send_batch_id() {
		return this.bulk_send_batch_id;
	}

	/**
	 * Getter for decline_information.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#decline_information decline_information}.
	 */
	public SignatureRequestDeclineInformation getDecline_information() {
		return this.decline_information;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#Status Status}.
	 * @param Status value to set
	 */
	public void setStatus(SignatureRequestStatusValue Status) {
		this.Status = Status;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#DeliveryMode DeliveryMode}.
	 * @param DeliveryMode value to set
	 */
	public void setDeliveryMode(SignatureRequestDeliveryModeValue DeliveryMode) {
		this.DeliveryMode = DeliveryMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#created_at created_at}.
	 * @param created_at value to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#ordered_signers ordered_signers}.
	 * @param ordered_signers value to set
	 */
	public void setOrdered_signers(Boolean ordered_signers) {
		this.ordered_signers = ordered_signers;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#reminder_settings reminder_settings}.
	 * @param reminder_settings value to set
	 */
	public void setReminder_settings(SignatureRequestInListReminderSettings reminder_settings) {
		this.reminder_settings = reminder_settings;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#timezone timezone}.
	 * @param timezone value to set
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#email_custom_note email_custom_note}.
	 * @param email_custom_note value to set
	 */
	public void setEmail_custom_note(String email_custom_note) {
		this.email_custom_note = email_custom_note;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#expiration_date expiration_date}.
	 * @param expiration_date value to set
	 */
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#Source Source}.
	 * @param Source value to set
	 */
	public void setSource(SignatureRequestSourceValue Source) {
		this.Source = Source;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#signers signers}.
	 * @param signers value to set
	 */
	public void setSigners(List<SignatureRequestInListSignersInner> signers) {
		this.signers = signers;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#approvers approvers}.
	 * @param approvers value to set
	 */
	public void setApprovers(List<SignatureRequestInListApproversInner> approvers) {
		this.approvers = approvers;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#documents documents}.
	 * @param documents value to set
	 */
	public void setDocuments(List<SignatureRequestInListDocumentsInner> documents) {
		this.documents = documents;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#sender sender}.
	 * @param sender value to set
	 */
	public void setSender(SignatureRequestInListSender sender) {
		this.sender = sender;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#external_id external_id}.
	 * @param external_id value to set
	 */
	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#branding_id branding_id}.
	 * @param branding_id value to set
	 */
	public void setBranding_id(String branding_id) {
		this.branding_id = branding_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#custom_experience_id custom_experience_id}.
	 * @param custom_experience_id value to set
	 */
	public void setCustom_experience_id(String custom_experience_id) {
		this.custom_experience_id = custom_experience_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#signers_allowed_to_decline signers_allowed_to_decline}.
	 * @param signers_allowed_to_decline value to set
	 */
	public void setSigners_allowed_to_decline(Boolean signers_allowed_to_decline) {
		this.signers_allowed_to_decline = signers_allowed_to_decline;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#workspace_id workspace_id}.
	 * @param workspace_id value to set
	 */
	public void setWorkspace_id(String workspace_id) {
		this.workspace_id = workspace_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#AuditTrailLocale AuditTrailLocale}.
	 * @param AuditTrailLocale value to set
	 */
	public void setAuditTrailLocale(SignatureRequestAuditTrailLocaleValue AuditTrailLocale) {
		this.AuditTrailLocale = AuditTrailLocale;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#email_notification email_notification}.
	 * @param email_notification value to set
	 */
	public void setEmail_notification(SignatureRequestEmailNotification email_notification) {
		this.email_notification = email_notification;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#bulk_send_batch_id bulk_send_batch_id}.
	 * @param bulk_send_batch_id value to set
	 */
	public void setBulk_send_batch_id(String bulk_send_batch_id) {
		this.bulk_send_batch_id = bulk_send_batch_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest#decline_information decline_information}.
	 * @param decline_information value to set
	 */
	public void setDecline_information(SignatureRequestDeclineInformation decline_information) {
		this.decline_information = decline_information;
	}
}
