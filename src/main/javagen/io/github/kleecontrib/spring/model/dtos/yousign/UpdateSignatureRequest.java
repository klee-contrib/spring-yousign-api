////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.UpdateSignatureRequestDeliveryModeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateSignatureRequest implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String name;

	/**
	 * Delivery mode to notify signers.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequestDeliveryMode#getValue() UpdateSignatureRequestDeliveryMode#getValue()} 
	 */
	@NotNull
	private UpdateSignatureRequestDeliveryModeValue DeliveryMode;

	/**
	 * Enable an ordered workflow, each signer will be requested to sign in a sequential order.
	 */
	@NotNull
	private Boolean ordered_signers;

	/**
	 * Non documenté.
	 */
	private UpdateSignatureRequestReminderSettings reminder_settings;

	/**
	 * tz database format.
	 */
	@NotNull
	private String timezone;

	/**
	 * Non documenté.
	 */
	private String email_custom_note;

	/**
	 * Due date of the signature request (yyyy-mm-dd).
	 */
	@NotNull
	private String expiration_date;

	/**
	 * Non documenté.
	 */
	private String external_id;

	/**
	 * Non documenté.
	 */
	private String branding_id;

	/**
	 * Use a specific Custom Experience to customize the signature experience.
	 */
	private String custom_experience_id;

	/**
	 * Allowing signers to decline to sign.
	 */
	@NotNull
	private Boolean signers_allowed_to_decline;

	/**
	 * Transfer the Signature Request into a given Workspace.
	 */
	private String workspace_id;

	/**
	 * Define the locale for the generated audit trail.
	 */
	private String audit_trail_locale;

	/**
	 * Non documenté.
	 */
	private SignatureRequestEmailNotification email_notification;

	/**
	 * No arg constructor.
	 */
	public UpdateSignatureRequest() {
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for DeliveryMode.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#DeliveryMode DeliveryMode}.
	 */
	public UpdateSignatureRequestDeliveryModeValue getDeliveryMode() {
		return this.DeliveryMode;
	}

	/**
	 * Getter for ordered_signers.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#ordered_signers ordered_signers}.
	 */
	public Boolean getOrdered_signers() {
		return this.ordered_signers;
	}

	/**
	 * Getter for reminder_settings.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#reminder_settings reminder_settings}.
	 */
	public UpdateSignatureRequestReminderSettings getReminder_settings() {
		return this.reminder_settings;
	}

	/**
	 * Getter for timezone.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#timezone timezone}.
	 */
	public String getTimezone() {
		return this.timezone;
	}

	/**
	 * Getter for email_custom_note.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#email_custom_note email_custom_note}.
	 */
	public String getEmail_custom_note() {
		return this.email_custom_note;
	}

	/**
	 * Getter for expiration_date.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#expiration_date expiration_date}.
	 */
	public String getExpiration_date() {
		return this.expiration_date;
	}

	/**
	 * Getter for external_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#external_id external_id}.
	 */
	public String getExternal_id() {
		return this.external_id;
	}

	/**
	 * Getter for branding_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#branding_id branding_id}.
	 */
	public String getBranding_id() {
		return this.branding_id;
	}

	/**
	 * Getter for custom_experience_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#custom_experience_id custom_experience_id}.
	 */
	public String getCustom_experience_id() {
		return this.custom_experience_id;
	}

	/**
	 * Getter for signers_allowed_to_decline.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#signers_allowed_to_decline signers_allowed_to_decline}.
	 */
	public Boolean getSigners_allowed_to_decline() {
		return this.signers_allowed_to_decline;
	}

	/**
	 * Getter for workspace_id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#workspace_id workspace_id}.
	 */
	public String getWorkspace_id() {
		return this.workspace_id;
	}

	/**
	 * Getter for audit_trail_locale.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#audit_trail_locale audit_trail_locale}.
	 */
	public String getAudit_trail_locale() {
		return this.audit_trail_locale;
	}

	/**
	 * Getter for email_notification.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#email_notification email_notification}.
	 */
	public SignatureRequestEmailNotification getEmail_notification() {
		return this.email_notification;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#DeliveryMode DeliveryMode}.
	 * @param DeliveryMode value to set
	 */
	public void setDeliveryMode(UpdateSignatureRequestDeliveryModeValue DeliveryMode) {
		this.DeliveryMode = DeliveryMode;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#ordered_signers ordered_signers}.
	 * @param ordered_signers value to set
	 */
	public void setOrdered_signers(Boolean ordered_signers) {
		this.ordered_signers = ordered_signers;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#reminder_settings reminder_settings}.
	 * @param reminder_settings value to set
	 */
	public void setReminder_settings(UpdateSignatureRequestReminderSettings reminder_settings) {
		this.reminder_settings = reminder_settings;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#timezone timezone}.
	 * @param timezone value to set
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#email_custom_note email_custom_note}.
	 * @param email_custom_note value to set
	 */
	public void setEmail_custom_note(String email_custom_note) {
		this.email_custom_note = email_custom_note;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#expiration_date expiration_date}.
	 * @param expiration_date value to set
	 */
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#external_id external_id}.
	 * @param external_id value to set
	 */
	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#branding_id branding_id}.
	 * @param branding_id value to set
	 */
	public void setBranding_id(String branding_id) {
		this.branding_id = branding_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#custom_experience_id custom_experience_id}.
	 * @param custom_experience_id value to set
	 */
	public void setCustom_experience_id(String custom_experience_id) {
		this.custom_experience_id = custom_experience_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#signers_allowed_to_decline signers_allowed_to_decline}.
	 * @param signers_allowed_to_decline value to set
	 */
	public void setSigners_allowed_to_decline(Boolean signers_allowed_to_decline) {
		this.signers_allowed_to_decline = signers_allowed_to_decline;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#workspace_id workspace_id}.
	 * @param workspace_id value to set
	 */
	public void setWorkspace_id(String workspace_id) {
		this.workspace_id = workspace_id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#audit_trail_locale audit_trail_locale}.
	 * @param audit_trail_locale value to set
	 */
	public void setAudit_trail_locale(String audit_trail_locale) {
		this.audit_trail_locale = audit_trail_locale;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest#email_notification email_notification}.
	 * @param email_notification value to set
	 */
	public void setEmail_notification(SignatureRequestEmailNotification email_notification) {
		this.email_notification = email_notification;
	}
}
