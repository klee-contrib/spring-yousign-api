////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PatchExchange;
import org.springframework.web.service.annotation.PostExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.Approver;
import io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequest;
import io.github.kleecontrib.spring.model.dtos.yousign.PostSignatureRequestsSignatureRequestIdApproversRequest;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface ApproverClient {


	/**
	 * Delete an Approver.
	 * @param approverId Approver Id
	 * @param signatureRequestId Signature Request Id
	 */
	@DeleteExchange(value = "signature_requests/{signatureRequestId}/approvers/{approverId}")
	void deleteSignatureRequestsSignatureRequestIdApproversApproverId(@PathVariable("approverId") String approverId, @PathVariable("signatureRequestId") String signatureRequestId);

	/**
	 * Get an Approver.
	 * @param approverId Approver Id
	 * @param signatureRequestId Signature Request Id
	 * @return Approver
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/approvers/{approverId}")
	Approver getSignatureRequestsSignatureRequestIdApproversApproverId(@PathVariable("approverId") String approverId, @PathVariable("signatureRequestId") String signatureRequestId);

	/**
	 * Update an Approver.
	 * @param body Non documenté
	 * @param approverId Approver Id
	 * @param signatureRequestId Signature Request Id
	 * @return Approver
	 */
	@PatchExchange(value = "signature_requests/{signatureRequestId}/approvers/{approverId}")
	Approver patchSignatureRequestsSignatureRequestIdApproversApproverId(@PathVariable("approverId") String approverId, @PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequest body);

	/**
	 * Create a new Approver.
	 * @param body Non documenté
	 * @param signatureRequestId Signature Request Id
	 * @return Approver
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/approvers")
	Approver postSignatureRequestsSignatureRequestIdApprovers(@PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid PostSignatureRequestsSignatureRequestIdApproversRequest body);
}
