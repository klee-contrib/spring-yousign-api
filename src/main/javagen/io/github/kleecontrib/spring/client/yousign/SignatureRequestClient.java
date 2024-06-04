////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PatchExchange;
import org.springframework.web.service.annotation.PostExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequest;
import io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequests200Response;
import io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdCancelRequest;
import io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdReactivateRequest;
import io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequest;
import io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivated;
import io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequest;
import io.github.kleecontrib.spring.model.enums.yousign.GetSignatureRequestsStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface SignatureRequestClient {


	/**
	 * Delete a Signature Request.
	 * @param signatureRequestId Signature Request Id
	 * @param permanent_delete If true it will permanently delete the Signature Request. It will no longer be retrievable.
	 */
	@DeleteExchange(value = "signature_requests/{signatureRequestId}")
	void deleteSignatureRequestsSignatureRequestId(@PathVariable("signatureRequestId") String signatureRequestId, @RequestParam(value = "permanent_delete", required = false) Boolean permanent_delete);

	/**
	 * List Signature Requests.
	 * @param after After cursor (pagination)
	 * @param external_id Filter by external_id
	 * @param limit The limit of items count to retrieve.
	 * @param q Search on name
	 * @param source[] Filter by source
	 * @param Status Filter by status
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests")
	GetSignatureRequests200Response getSignatureRequests(@RequestParam(value = "after", required = false) String after, @RequestParam(value = "external_id", required = false) String external_id, @RequestParam(value = "limit", required = false) Integer limit, @RequestParam(value = "q", required = false) String q, @RequestParam(value = "source[]", required = false) String source[], @RequestParam(value = "Status", required = true) GetSignatureRequestsStatusValue Status);

	/**
	 * Fetch a Signature Request.
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}")
	SignatureRequest getSignatureRequestsSignatureRequestId(@PathVariable("signatureRequestId") String signatureRequestId);

	/**
	 * Update a Signature Request.
	 * @param body Non documenté
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@PatchExchange(value = "signature_requests/{signatureRequestId}")
	SignatureRequest patchSignatureRequestsSignatureRequestId(@PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid UpdateSignatureRequest body);

	/**
	 * Initiate a new Signature Request.
	 * @param body Non documenté
	 * @return Non documenté
	 */
	@PostExchange(value = "signature_requests")
	SignatureRequest postSignatureRequests(@RequestBody @Valid CreateSignatureRequest body);

	/**
	 * Cancel a Signature Request.
	 * @param body Non documenté
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/cancel")
	SignatureRequest postSignatureRequestsSignatureRequestIdCancel(@PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid PostSignatureRequestsSignatureRequestIdCancelRequest body);

	/**
	 * Reactivate an expired Signature Request.
	 * @param body Non documenté
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/reactivate")
	SignatureRequest postSignatureRequestsSignatureRequestIdReactivate(@PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid PostSignatureRequestsSignatureRequestIdReactivateRequest body);

	/**
	 * Activate a Signature Request.
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/activate")
	SignatureRequestActivated postSignatureRequestsSignatureRequestIdSignatures(@PathVariable("signatureRequestId") String signatureRequestId);
}
