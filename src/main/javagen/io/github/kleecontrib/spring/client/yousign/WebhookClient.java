////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PatchExchange;
import org.springframework.web.service.annotation.PostExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.CreateWebhookSubscription;
import io.github.kleecontrib.spring.model.dtos.yousign.UpdateWebhookSubscription;
import io.github.kleecontrib.spring.model.dtos.yousign.WebhookSubscription;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface WebhookClient {


	/**
	 * Delete a Webhook subscription.
	 * @param webhookId Webhook Id
	 */
	@DeleteExchange(value = "webhooks/{webhookId}")
	void deleteWebhooksWebhookId(@PathVariable("webhookId") String webhookId);

	/**
	 * List Webhook subscriptions.
	 * @return Non documenté
	 */
	@GetExchange(value = "webhooks")
	List<WebhookSubscription> getWebhooks();

	/**
	 * Get a Webhook subscription.
	 * @param webhookId Webhook Id
	 * @return Non documenté
	 */
	@GetExchange(value = "webhooks/{webhookId}")
	WebhookSubscription getWebhooksWebhookId(@PathVariable("webhookId") String webhookId);

	/**
	 * Update a Webhook subscription.
	 * @param body Non documenté
	 * @param webhookId Webhook Id
	 * @return Non documenté
	 */
	@PatchExchange(value = "webhooks/{webhookId}")
	WebhookSubscription patchWebhooksWebhookId(@PathVariable("webhookId") String webhookId, @RequestBody @Valid UpdateWebhookSubscription body);

	/**
	 * Create a Webhook subscription.
	 * @param body Non documenté
	 * @return Non documenté
	 */
	@PostExchange(value = "webhooks")
	WebhookSubscription postWebhooksSubscriptions(@RequestBody @Valid CreateWebhookSubscription body);
}
