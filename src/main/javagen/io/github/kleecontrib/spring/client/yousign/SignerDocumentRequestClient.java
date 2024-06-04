////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.CreateSignerDocumentRequest;
import io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequestsSignatureRequestIdSignersSignerIdDocuments200Response;
import io.github.kleecontrib.spring.model.dtos.yousign.SignerDocumentRequest;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface SignerDocumentRequestClient {


	/**
	 * Delete the Documents uploaded by a Signer.
	 * @param signatureRequestId Signature Request Id
	 * @param signerId Signer Id
	 */
	@DeleteExchange(value = "signature_requests/{signatureRequestId}/signers/{signerId}/documents")
	void deleteSignatureRequestsSignatureRequestIdSignersSignerIdDocuments(@PathVariable("signatureRequestId") String signatureRequestId, @PathVariable("signerId") String signerId);

	/**
	 * List the Signer Documents of a Signer.
	 * @param signatureRequestId Signature Request Id
	 * @param signerId Signer Id
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/signers/{signerId}/documents")
	GetSignatureRequestsSignatureRequestIdSignersSignerIdDocuments200Response getSignatureRequestsSignatureRequestIdSignersSignerIdDocuments(@PathVariable("signatureRequestId") String signatureRequestId, @PathVariable("signerId") String signerId);

	/**
	 * Download a Signer Document.
	 * @param signatureRequestId Signature Request Id
	 * @param signerDocumentId Signer Document Id
	 * @param signerId Signer Id
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/signers/{signerId}/documents/{signerDocumentId}/download")
	byte[] getSignatureRequestsSignatureRequestIdSignersSignerIdDocumentsSignerDocumentId(@PathVariable("signatureRequestId") String signatureRequestId, @PathVariable("signerDocumentId") String signerDocumentId, @PathVariable("signerId") String signerId);

	/**
	 * Add Signer Document Request to a Signature Request.
	 * @param body Non documenté
	 * @param signatureRequestId Signature Request Id
	 * @return Signer Document Request attached to a Signature Request
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/document_requests")
	SignerDocumentRequest postSignatureRequestsSignatureRequestIdDocumentRequests(@PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid CreateSignerDocumentRequest body);
}
