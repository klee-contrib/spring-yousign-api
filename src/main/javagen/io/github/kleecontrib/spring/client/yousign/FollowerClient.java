////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.CreateFollowersInner;
import io.github.kleecontrib.spring.model.dtos.yousign.Follower;
import io.github.kleecontrib.spring.model.dtos.yousign.GetSignatureRequestsSignatureRequestIdFollowers200Response;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface FollowerClient {


	/**
	 * List the Signature Request's Followers.
	 * @param signatureRequestId Signature Request Id
	 * @return A list of Followers added to the Signature Request.
	 */
	@GetExchange(value = "signature_requests/{signatureRequestId}/followers")
	GetSignatureRequestsSignatureRequestIdFollowers200Response getSignatureRequestsSignatureRequestIdFollowers(@PathVariable("signatureRequestId") String signatureRequestId);

	/**
	 * Create new Followers.
	 * @param body A list of Follower objects to be added to the signature request.
	 * @param signatureRequestId Signature Request Id
	 * @return A list of Followers added to the Signature Request.
	 */
	@PostExchange(value = "signature_requests/{signatureRequestId}/followers")
	List<Follower> postSignatureRequestsSignatureRequestIdFollowers(@PathVariable("signatureRequestId") String signatureRequestId, @RequestBody @Valid List<CreateFollowersInner> body);
}
