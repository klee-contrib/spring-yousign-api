////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PatchExchange;
import org.springframework.web.service.annotation.PostExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.CreateDocument;
import io.github.kleecontrib.spring.model.dtos.yousign.Document;
import io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdDocumentsDocumentIdReplaceRequest;
import io.github.kleecontrib.spring.model.dtos.yousign.UpdateDocument;
import io.github.kleecontrib.spring.model.enums.yousign.GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersionValue;
import io.github.kleecontrib.spring.model.enums.yousign.GetSignatureRequestsSignatureRequestIdDocumentsNatureValue;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface DocumentClient {


	/**
	 * Delete a Document.
	 * @param documentId Document Id
	 * @param signatureRequestId Signature Request Id
	 */
	@DeleteExchange(value = "signature_requests/{signatureRequestId}/documents/{documentId}")
	void deleteSignatureRequestsSignatureRequestIdDocumentsDocumentId(@PathVariable("documentId") String documentId, @PathVariable("signatureRequestId") String signatureRequestId);

	/**
	 * List Signature Request's Documents.
	 * @param signatureRequestId Signature Request Id
	 * @param Nature Filter by nature
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/documents")
	List<Document> getSignatureRequestsSignatureRequestIdDocuments(@PathVariable("signatureRequestId") String signatureRequestId, @RequestParam(value = "Nature", required = true) GetSignatureRequestsSignatureRequestIdDocumentsNatureValue Nature);

	/**
	 * Get a Document.
	 * @param documentId Document Id
	 * @param signatureRequestId Signature Request Id
	 * @return Document to attach to a Signature Request
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/documents/{documentId}")
	Document getSignatureRequestsSignatureRequestIdDocumentsDocumentId(@PathVariable("documentId") String documentId, @PathVariable("signatureRequestId") String signatureRequestId);

	/**
	 * Download a single Signature Request's Document.
	 * @param documentId Document Id
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/documents/{documentId}/download")
	byte[] getSignatureRequestsSignatureRequestIdDocumentsDocumentsIdDownload(@PathVariable("documentId") String documentId, @PathVariable("signatureRequestId") String signatureRequestId);

	/**
	 * Download Signature Request's Documents.
	 * @param signatureRequestId Signature Request Id
	 * @param archive Force zip archive download
	 * @param Version Specify Documents version to download, "completed" is only available when the Signature Request status is "done".
	
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/documents/download")
	byte[] getSignatureRequestsSignatureRequestIdDocumentsDownload(@PathVariable("signatureRequestId") String signatureRequestId, @RequestParam(value = "archive", required = false) Boolean archive, @RequestParam(value = "Version", required = true) GetSignatureRequestsSignatureRequestIdDocumentsDownloadVersionValue Version);

	/**
	 * Update a Document.
	 * @param body Non documenté
	 * @param documentId Document Id
	 * @param signatureRequestId Signature Request Id
	 * @return Document to attach to a Signature Request
	 */
	@PatchExchange(value = "signature_requests/{signatureRequestId}/documents/{documentId}")
	Document patchSignatureRequestsSignatureRequestIdDocumentsDocumentId(@PathVariable("documentId") String documentId, @PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid UpdateDocument body);

	/**
	 * Upload a Document.
	 * @param body Non documenté
	 * @return Document to attach to a Signature Request
	 */
	@PostExchange(value = "documents")
	Document postDocuments(@RequestBody @Valid CreateDocument body);

	/**
	 * Add Document to a Signature Request.
	 * @param body Non documenté
	 * @param signatureRequestId Signature Request Id
	 * @return Document to attach to a Signature Request
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/documents")
	Document postSignatureRequestsSignatureRequestIdDocuments(@PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid CreateDocument body);

	/**
	 * Replace a Document in a Signature Request.
	 * @param body Non documenté
	 * @param documentId Document Id
	 * @param signatureRequestId Signature Request Id
	 * @return Document to attach to a Signature Request
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/documents/{documentId}/replace")
	Document postSignatureRequestsSignatureRequestIdDocumentsDocumentIdReplace(@PathVariable("documentId") String documentId, @PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid PostSignatureRequestsSignatureRequestIdDocumentsDocumentIdReplaceRequest body);
}
