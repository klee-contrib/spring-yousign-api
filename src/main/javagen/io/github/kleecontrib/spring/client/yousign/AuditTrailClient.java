////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.SignerAuditTrail;

import jakarta.annotation.Generated;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface AuditTrailClient {


	/**
	 * Download Signature Request Audit Trails.
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/audit_trails/download")
	byte[] getSignatureRequestsSignatureRequestIdAuditTrailsDownload(@PathVariable("signatureRequestId") String signatureRequestId);

	/**
	 * Get Signer Audit Trail.
	 * @param signatureRequestId Signature Request Id
	 * @param signerId Signer Id
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/signers/{signerId}/audit_trails")
	SignerAuditTrail getSignatureRequestsSignatureRequestIdSignersSignerIdAuditTrails(@PathVariable("signatureRequestId") String signatureRequestId, @PathVariable("signerId") String signerId);

	/**
	 * Download Audit Trail PDF.
	 * @param signatureRequestId Signature Request Id
	 * @param signerId Signer Id
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/signers/{signerId}/audit_trails/download")
	byte[] getSignersSignerIdAuditTrailsDownload(@PathVariable("signatureRequestId") String signatureRequestId, @PathVariable("signerId") String signerId);
}
