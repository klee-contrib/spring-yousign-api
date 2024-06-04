////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestMetadata;
import io.github.kleecontrib.spring.model.dtos.yousign.Metadata;
import io.github.kleecontrib.spring.model.dtos.yousign.UpdateSignatureRequestMetadata;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface MetadataClient {


	/**
	 * Delete the Signature Request Metadata.
	 * @param signatureRequestId Signature Request Id
	 */
	@DeleteExchange(value = "signature_requests/{signatureRequestId}/metadata")
	void deleteSignatureRequestsSignatureRequestIdMetadata(@PathVariable("signatureRequestId") String signatureRequestId);

	/**
	 * Get the Signature Request Metadata.
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/metadata")
	Metadata getSignatureRequestsSignatureRequestIdMetadata(@PathVariable("signatureRequestId") String signatureRequestId);

	/**
	 * Attach Metadata to a Signature Request.
	 * @param body Non documenté
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/metadata")
	Metadata postSignatureRequestsSignatureRequestIdMetadata(@PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid CreateSignatureRequestMetadata body);

	/**
	 * Update Metadata of a Signature Request.
	 * @param body Non documenté
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@PutExchange(value = "signature_requests/{signatureRequestId}/metadata")
	Metadata putSignatureRequestsSignatureRequestIdMetadata(@PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid UpdateSignatureRequestMetadata body);
}
