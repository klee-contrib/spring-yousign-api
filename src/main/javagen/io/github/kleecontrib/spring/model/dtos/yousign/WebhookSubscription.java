////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class WebhookSubscription implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String id;

	/**
	 * Https target URL of the webhook.
	 */
	@NotNull
	private String endpoint;

	/**
	 * Short description of the webhook.
	 */
	private String description;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean sandbox;

	/**
	 * Non documenté.
	 */
	private WebhookSubscriptionSubscribedEvents subscribed_events;

	/**
	 * Autogenerated 32 bytes key.
	 */
	@NotNull
	private String secret_key;

	/**
	 * Non documenté.
	 */
	private WebhookSubscriptionScopes scopes;

	/**
	 * If a Webhook request fails for any reason, Yousign will retry the request 8 times using a back-off mechanism after: 2, 6, 30, 60, 300, 1080, 1440, 2880 min.
	 */
	@NotNull
	private Boolean auto_retry;

	/**
	 * Is the webhook enabled?.
	 */
	@NotNull
	private Boolean enabled;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String created_at;

	/**
	 * Non documenté.
	 */
	private String updated_at;

	/**
	 * No arg constructor.
	 */
	public WebhookSubscription() {
	}

	/**
	 * Getter for id.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#id id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Getter for endpoint.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#endpoint endpoint}.
	 */
	public String getEndpoint() {
		return this.endpoint;
	}

	/**
	 * Getter for description.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#description description}.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Getter for sandbox.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#sandbox sandbox}.
	 */
	public Boolean getSandbox() {
		return this.sandbox;
	}

	/**
	 * Getter for subscribed_events.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#subscribed_events subscribed_events}.
	 */
	public WebhookSubscriptionSubscribedEvents getSubscribed_events() {
		return this.subscribed_events;
	}

	/**
	 * Getter for secret_key.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#secret_key secret_key}.
	 */
	public String getSecret_key() {
		return this.secret_key;
	}

	/**
	 * Getter for scopes.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#scopes scopes}.
	 */
	public WebhookSubscriptionScopes getScopes() {
		return this.scopes;
	}

	/**
	 * Getter for auto_retry.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#auto_retry auto_retry}.
	 */
	public Boolean getAuto_retry() {
		return this.auto_retry;
	}

	/**
	 * Getter for enabled.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#enabled enabled}.
	 */
	public Boolean getEnabled() {
		return this.enabled;
	}

	/**
	 * Getter for created_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#created_at created_at}.
	 */
	public String getCreated_at() {
		return this.created_at;
	}

	/**
	 * Getter for updated_at.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#updated_at updated_at}.
	 */
	public String getUpdated_at() {
		return this.updated_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#id id}.
	 * @param id value to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#endpoint endpoint}.
	 * @param endpoint value to set
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#description description}.
	 * @param description value to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#sandbox sandbox}.
	 * @param sandbox value to set
	 */
	public void setSandbox(Boolean sandbox) {
		this.sandbox = sandbox;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#subscribed_events subscribed_events}.
	 * @param subscribed_events value to set
	 */
	public void setSubscribed_events(WebhookSubscriptionSubscribedEvents subscribed_events) {
		this.subscribed_events = subscribed_events;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#secret_key secret_key}.
	 * @param secret_key value to set
	 */
	public void setSecret_key(String secret_key) {
		this.secret_key = secret_key;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#scopes scopes}.
	 * @param scopes value to set
	 */
	public void setScopes(WebhookSubscriptionScopes scopes) {
		this.scopes = scopes;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#auto_retry auto_retry}.
	 * @param auto_retry value to set
	 */
	public void setAuto_retry(Boolean auto_retry) {
		this.auto_retry = auto_retry;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#enabled enabled}.
	 * @param enabled value to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#created_at created_at}.
	 * @param created_at value to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription#updated_at updated_at}.
	 * @param updated_at value to set
	 */
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
}
