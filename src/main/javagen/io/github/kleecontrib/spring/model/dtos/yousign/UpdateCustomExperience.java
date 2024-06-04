////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UpdateCustomExperience implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String name;

	/**
	 * Non documenté.
	 */
	private Boolean landing_page_disabled;

	/**
	 * Non documenté.
	 */
	private Boolean side_panel_disabled;

	/**
	 * Hexadecimal color value.
	 */
	private String background_color;

	/**
	 * Hexadecimal color value.
	 */
	private String button_color;

	/**
	 * Hexadecimal color value.
	 */
	private String text_color;

	/**
	 * Hexadecimal color value.
	 */
	private String text_button_color;

	/**
	 * Non documenté.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperienceDisabledNotificationsType#getValue() CustomExperienceDisabledNotificationsType#getValue()} 
	 */
	@NotNull
	private List<String> disabled_notifications;

	/**
	 * Non documenté.
	 */
	private Boolean email_logo_disabled;

	/**
	 * Non documenté.
	 */
	private Boolean email_header_text_disabled;

	/**
	 * Non documenté.
	 */
	private Boolean email_footer_signature_disabled;

	/**
	 * Non documenté.
	 */
	private Boolean email_expiration_text_disabled;

	/**
	 * Non documenté.
	 */
	private CreateCustomExperienceRedirectUrls redirect_urls;

	/**
	 * No arg constructor.
	 */
	public UpdateCustomExperience() {
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for landing_page_disabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#landing_page_disabled landing_page_disabled}.
	 */
	public Boolean getLanding_page_disabled() {
		return this.landing_page_disabled;
	}

	/**
	 * Getter for side_panel_disabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#side_panel_disabled side_panel_disabled}.
	 */
	public Boolean getSide_panel_disabled() {
		return this.side_panel_disabled;
	}

	/**
	 * Getter for background_color.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#background_color background_color}.
	 */
	public String getBackground_color() {
		return this.background_color;
	}

	/**
	 * Getter for button_color.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#button_color button_color}.
	 */
	public String getButton_color() {
		return this.button_color;
	}

	/**
	 * Getter for text_color.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#text_color text_color}.
	 */
	public String getText_color() {
		return this.text_color;
	}

	/**
	 * Getter for text_button_color.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#text_button_color text_button_color}.
	 */
	public String getText_button_color() {
		return this.text_button_color;
	}

	/**
	 * Getter for disabled_notifications.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#disabled_notifications disabled_notifications}.
	 */
	public List<String> getDisabled_notifications() {
		return this.disabled_notifications;
	}

	/**
	 * Getter for email_logo_disabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#email_logo_disabled email_logo_disabled}.
	 */
	public Boolean getEmail_logo_disabled() {
		return this.email_logo_disabled;
	}

	/**
	 * Getter for email_header_text_disabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#email_header_text_disabled email_header_text_disabled}.
	 */
	public Boolean getEmail_header_text_disabled() {
		return this.email_header_text_disabled;
	}

	/**
	 * Getter for email_footer_signature_disabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#email_footer_signature_disabled email_footer_signature_disabled}.
	 */
	public Boolean getEmail_footer_signature_disabled() {
		return this.email_footer_signature_disabled;
	}

	/**
	 * Getter for email_expiration_text_disabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#email_expiration_text_disabled email_expiration_text_disabled}.
	 */
	public Boolean getEmail_expiration_text_disabled() {
		return this.email_expiration_text_disabled;
	}

	/**
	 * Getter for redirect_urls.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#redirect_urls redirect_urls}.
	 */
	public CreateCustomExperienceRedirectUrls getRedirect_urls() {
		return this.redirect_urls;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#landing_page_disabled landing_page_disabled}.
	 * @param landing_page_disabled value to set
	 */
	public void setLanding_page_disabled(Boolean landing_page_disabled) {
		this.landing_page_disabled = landing_page_disabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#side_panel_disabled side_panel_disabled}.
	 * @param side_panel_disabled value to set
	 */
	public void setSide_panel_disabled(Boolean side_panel_disabled) {
		this.side_panel_disabled = side_panel_disabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#background_color background_color}.
	 * @param background_color value to set
	 */
	public void setBackground_color(String background_color) {
		this.background_color = background_color;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#button_color button_color}.
	 * @param button_color value to set
	 */
	public void setButton_color(String button_color) {
		this.button_color = button_color;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#text_color text_color}.
	 * @param text_color value to set
	 */
	public void setText_color(String text_color) {
		this.text_color = text_color;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#text_button_color text_button_color}.
	 * @param text_button_color value to set
	 */
	public void setText_button_color(String text_button_color) {
		this.text_button_color = text_button_color;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#disabled_notifications disabled_notifications}.
	 * @param disabled_notifications value to set
	 */
	public void setDisabled_notifications(List<String> disabled_notifications) {
		this.disabled_notifications = disabled_notifications;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#email_logo_disabled email_logo_disabled}.
	 * @param email_logo_disabled value to set
	 */
	public void setEmail_logo_disabled(Boolean email_logo_disabled) {
		this.email_logo_disabled = email_logo_disabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#email_header_text_disabled email_header_text_disabled}.
	 * @param email_header_text_disabled value to set
	 */
	public void setEmail_header_text_disabled(Boolean email_header_text_disabled) {
		this.email_header_text_disabled = email_header_text_disabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#email_footer_signature_disabled email_footer_signature_disabled}.
	 * @param email_footer_signature_disabled value to set
	 */
	public void setEmail_footer_signature_disabled(Boolean email_footer_signature_disabled) {
		this.email_footer_signature_disabled = email_footer_signature_disabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#email_expiration_text_disabled email_expiration_text_disabled}.
	 * @param email_expiration_text_disabled value to set
	 */
	public void setEmail_expiration_text_disabled(Boolean email_expiration_text_disabled) {
		this.email_expiration_text_disabled = email_expiration_text_disabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience#redirect_urls redirect_urls}.
	 * @param redirect_urls value to set
	 */
	public void setRedirect_urls(CreateCustomExperienceRedirectUrls redirect_urls) {
		this.redirect_urls = redirect_urls;
	}
}
