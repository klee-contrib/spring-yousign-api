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

import io.github.kleecontrib.spring.model.dtos.yousign.CreateSigner;
import io.github.kleecontrib.spring.model.dtos.yousign.Signer;
import io.github.kleecontrib.spring.model.dtos.yousign.SignerSign;
import io.github.kleecontrib.spring.model.dtos.yousign.UpdateSigner;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface SignerClient {


	/**
	 * Delete a Signer.
	 * @param signatureRequestId Signature Request Id
	 * @param signerId Signer Id
	 */
	@DeleteExchange(value = "signature_requests/{signatureRequestId}/signers/{signerId}")
	void deleteSignatureRequestsSignatureRequestIdSignersSignerId(@PathVariable("signatureRequestId") String signatureRequestId, @PathVariable("signerId") String signerId);

	/**
	 * List Signature Request's Signers.
	 * @param signatureRequestId Signature Request Id
	 * @return Non documenté
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/signers")
	List<Signer> getSignatureRequestsSignatureRequestIdSigners(@PathVariable("signatureRequestId") String signatureRequestId);

	/**
	 * Get a Signer.
	 * @param signatureRequestId Signature Request Id
	 * @param signerId Signer Id
	 * @return Signer
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/signers/{signerId}")
	Signer getSignersSignersId(@PathVariable("signatureRequestId") String signatureRequestId, @PathVariable("signerId") String signerId);

	/**
	 * Update a Signer.
	 * @param body Non documenté
	 * @param signatureRequestId Signature Request Id
	 * @param signerId Signer Id
	 * @return Signer
	 */
	@PatchExchange(value = "signature_requests/{signatureRequestId}/signers/{signerId}")
	Signer patchSignatureRequestsSignatureRequestIdSignersSignerId(@PathVariable("signatureRequestId") String signatureRequestId, @PathVariable("signerId") String signerId, @RequestBody @Valid UpdateSigner body);

	/**
	 * Create a new Signer.
	 * @param body Non documenté
	 * @param signatureRequestId Signature Request Id
	 * @return Signer
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/signers")
	Signer postSignatureRequestsSignatureRequestIdSigners(@PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid CreateSigner body);

	/**
	 * Send a One-Time Password (OTP) to a Signer.
	 * @param signatureRequestId Signature Request Id
	 * @param signerId Signer Id
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/signers/{signerId}/send_otp")
	void postSignatureRequestsSignatureRequestIdSignersSignerIdSendOtp(@PathVariable("signatureRequestId") String signatureRequestId, @PathVariable("signerId") String signerId);

	/**
	 * Send manual reminder to a Signer.
	 * @param signatureRequestId Signature Request Id
	 * @param signerId Signer Id
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/signers/{signerId}/send_reminder")
	void postSignatureRequestsSignatureRequestIdSignersSignerIdSendReminder(@PathVariable("signatureRequestId") String signatureRequestId, @PathVariable("signerId") String signerId);

	/**
	 * Sign a Signature Request.
	 * @param body Non documenté
	 * @param signatureRequestId Signature Request Id
	 * @param signerId Signer Id
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/signers/{signerId}/sign")
	void postSignatureRequestsSignatureRequestIdSignersSignerIdSign(@PathVariable("signatureRequestId") String signatureRequestId, @PathVariable("signerId") String signerId, @RequestBody @Valid SignerSign body);
}
