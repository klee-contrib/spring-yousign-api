////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import io.github.kleecontrib.spring.model.enums.yousign.CustomExperienceSourceValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CustomExperience implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String id;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String name;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean landing_page_disabled;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean side_panel_disabled;

	/**
	 * Non documenté.
	 */
	private String background_color;

	/**
	 * Non documenté.
	 */
	private String button_color;

	/**
	 * Non documenté.
	 */
	private String text_color;

	/**
	 * Non documenté.
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
	@NotNull
	private Boolean email_logo_disabled;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean email_header_text_disabled;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean email_footer_signature_disabled;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean email_expiration_text_disabled;

	/**
	 * Non documenté.
	 */
	private CustomExperienceRedirectUrls redirect_urls;

	/**
	 * Non documenté.
	 */
	private String logo;

	/**
	 * Custom Experience Source.
	 * Alias of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperienceSource#getValue() CustomExperienceSource#getValue()} 
	 */
	private CustomExperienceSourceValue Source;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String created_at;

	/**
	 * No arg constructor.
	 */
	public CustomExperience() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter for landing_page_disabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#landing_page_disabled landing_page_disabled}.
	 */
	public Boolean getLanding_page_disabled() {
		return this.landing_page_disabled;
	}

	/**
	 * Getter for side_panel_disabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#side_panel_disabled side_panel_disabled}.
	 */
	public Boolean getSide_panel_disabled() {
		return this.side_panel_disabled;
	}

	/**
	 * Getter for background_color.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#background_color background_color}.
	 */
	public String getBackground_color() {
		return this.background_color;
	}

	/**
	 * Getter for button_color.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#button_color button_color}.
	 */
	public String getButton_color() {
		return this.button_color;
	}

	/**
	 * Getter for text_color.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#text_color text_color}.
	 */
	public String getText_color() {
		return this.text_color;
	}

	/**
	 * Getter for text_button_color.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#text_button_color text_button_color}.
	 */
	public String getText_button_color() {
		return this.text_button_color;
	}

	/**
	 * Getter for disabled_notifications.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#disabled_notifications disabled_notifications}.
	 */
	public List<String> getDisabled_notifications() {
		return this.disabled_notifications;
	}

	/**
	 * Getter for email_logo_disabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#email_logo_disabled email_logo_disabled}.
	 */
	public Boolean getEmail_logo_disabled() {
		return this.email_logo_disabled;
	}

	/**
	 * Getter for email_header_text_disabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#email_header_text_disabled email_header_text_disabled}.
	 */
	public Boolean getEmail_header_text_disabled() {
		return this.email_header_text_disabled;
	}

	/**
	 * Getter for email_footer_signature_disabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#email_footer_signature_disabled email_footer_signature_disabled}.
	 */
	public Boolean getEmail_footer_signature_disabled() {
		return this.email_footer_signature_disabled;
	}

	/**
	 * Getter for email_expiration_text_disabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#email_expiration_text_disabled email_expiration_text_disabled}.
	 */
	public Boolean getEmail_expiration_text_disabled() {
		return this.email_expiration_text_disabled;
	}

	/**
	 * Getter for redirect_urls.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#redirect_urls redirect_urls}.
	 */
	public CustomExperienceRedirectUrls getRedirect_urls() {
		return this.redirect_urls;
	}

	/**
	 * Getter for logo.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#logo logo}.
	 */
	public String getLogo() {
		return this.logo;
	}

	/**
	 * Getter for Source.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#Source Source}.
	 */
	public CustomExperienceSourceValue getSource() {
		return this.Source;
	}

	/**
	 * Getter for created_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#created_at created_at}.
	 */
	public String getCreated_at() {
		return this.created_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#landing_page_disabled landing_page_disabled}.
	 * @param landing_page_disabled value to set
	 */
	public void setLanding_page_disabled(Boolean landing_page_disabled) {
		this.landing_page_disabled = landing_page_disabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#side_panel_disabled side_panel_disabled}.
	 * @param side_panel_disabled value to set
	 */
	public void setSide_panel_disabled(Boolean side_panel_disabled) {
		this.side_panel_disabled = side_panel_disabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#background_color background_color}.
	 * @param background_color value to set
	 */
	public void setBackground_color(String background_color) {
		this.background_color = background_color;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#button_color button_color}.
	 * @param button_color value to set
	 */
	public void setButton_color(String button_color) {
		this.button_color = button_color;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#text_color text_color}.
	 * @param text_color value to set
	 */
	public void setText_color(String text_color) {
		this.text_color = text_color;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#text_button_color text_button_color}.
	 * @param text_button_color value to set
	 */
	public void setText_button_color(String text_button_color) {
		this.text_button_color = text_button_color;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#disabled_notifications disabled_notifications}.
	 * @param disabled_notifications value to set
	 */
	public void setDisabled_notifications(List<String> disabled_notifications) {
		this.disabled_notifications = disabled_notifications;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#email_logo_disabled email_logo_disabled}.
	 * @param email_logo_disabled value to set
	 */
	public void setEmail_logo_disabled(Boolean email_logo_disabled) {
		this.email_logo_disabled = email_logo_disabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#email_header_text_disabled email_header_text_disabled}.
	 * @param email_header_text_disabled value to set
	 */
	public void setEmail_header_text_disabled(Boolean email_header_text_disabled) {
		this.email_header_text_disabled = email_header_text_disabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#email_footer_signature_disabled email_footer_signature_disabled}.
	 * @param email_footer_signature_disabled value to set
	 */
	public void setEmail_footer_signature_disabled(Boolean email_footer_signature_disabled) {
		this.email_footer_signature_disabled = email_footer_signature_disabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#email_expiration_text_disabled email_expiration_text_disabled}.
	 * @param email_expiration_text_disabled value to set
	 */
	public void setEmail_expiration_text_disabled(Boolean email_expiration_text_disabled) {
		this.email_expiration_text_disabled = email_expiration_text_disabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#redirect_urls redirect_urls}.
	 * @param redirect_urls value to set
	 */
	public void setRedirect_urls(CustomExperienceRedirectUrls redirect_urls) {
		this.redirect_urls = redirect_urls;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#logo logo}.
	 * @param logo value to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#Source Source}.
	 * @param Source value to set
	 */
	public void setSource(CustomExperienceSourceValue Source) {
		this.Source = Source;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience#created_at created_at}.
	 * @param created_at value to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
}
