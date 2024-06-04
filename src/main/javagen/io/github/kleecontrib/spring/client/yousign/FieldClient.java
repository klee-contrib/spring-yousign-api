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

import io.github.kleecontrib.spring.model.dtos.yousign.CreateField;
import io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequestsSignatureRequestIdDocumentsDocumentIdFields200Response;
import io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequestsSignatureRequestIdDocumentsDocumentIdFields200ResponseDataInner;
import io.github.kleecontrib.spring.model.dtos.yousign.UpdateField;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface FieldClient {


	/**
	 * Delete a Field.
	 * @param documentId Document Id
	 * @param fieldId Field Id
	 * @param signatureRequestId Signature Request Id
	 */
	@DeleteExchange(value = "signature_requests/{signatureRequestId}/documents/{documentId}/fields/{fieldId}")
	void deleteSignatureRequestsSignatureRequestIdDocumentsDocumentIdFieldsFieldId(@PathVariable("documentId") String documentId, @PathVariable("fieldId") String fieldId, @PathVariable("signatureRequestId") String signatureRequestId);

	/**
	 * Lists the Fields of a Signature Request Document.
	 * @param documentId Document ID
	 * @param signatureRequestId Signature Request Id
	 * @param after After cursor (pagination)
	 * @param types[] Filter by Field type.
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/documents/{documentId}/fields")
	GetSignatureRequestsSignatureRequestIdDocumentsDocumentIdFields200Response getSignatureRequestsSignatureRequestIdDocumentsDocumentIdFields(@PathVariable("documentId") String documentId, @PathVariable("signatureRequestId") String signatureRequestId, @RequestParam(value = "after", required = false) String after, @RequestParam(value = "types[]", required = false) List<String> types[]);

	/**
	 * Create a new Field on a Document.
	 * @param body Non documenté
	 * @param documentId Document ID
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/documents/{documentId}/fields")
	GetSignatureRequestsSignatureRequestIdDocumentsDocumentIdFields200ResponseDataInner postSignatureRequestsSignatureRequestIdDocumentsDocumentIdFields(@PathVariable("documentId") String documentId, @PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid CreateField body);

	/**
	 * Update a Field.
	 * @param body Non documenté
	 * @param documentId Document Id
	 * @param fieldId Field Id
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@PatchExchange(value = "signature_requests/{signatureRequestId}/documents/{documentId}/fields/{fieldId}")
	GetSignatureRequestsSignatureRequestIdDocumentsDocumentIdFields200ResponseDataInner updateSignatureRequestsSignatureRequestIdDocumentsDocumentIdFieldsFieldId(@PathVariable("documentId") String documentId, @PathVariable("fieldId") String fieldId, @PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid UpdateField body);
}
