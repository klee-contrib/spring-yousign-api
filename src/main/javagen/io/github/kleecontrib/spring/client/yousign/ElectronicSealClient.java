////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealPayload;
import io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSeal;
import io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealAuditTrail;
import io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealDocument;
import io.github.kleecontrib.spring.model.dtos.yousign.ElectronicSealImage;
import io.github.kleecontrib.spring.model.dtos.yousign.ListElectronicSealImages200Response;
import io.github.kleecontrib.spring.model.dtos.yousign.UploadElectronicSealDocument;
import io.github.kleecontrib.spring.model.dtos.yousign.UploadElectronicSealImage;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface ElectronicSealClient {


	/**
	 * Delete an Electronic Seal Image.
	 * @param electronicSealImageId Non documenté
	 */
	@DeleteExchange(value = "electronic_seal_images/{electronicSealImageId}")
	void deleteElectronicSealImage(@PathVariable("electronicSealImageId") String electronicSealImageId);

	/**
	 * Download an Electronic Seal Document.
	 * @param electronicSealDocumentId Non documenté
	 * @return Non documenté
	 */
	@GetExchange(value = "electronic_seal_documents/{electronicSealDocumentId}/download")
	byte[] downloadElectronicSealDocument(@PathVariable("electronicSealDocumentId") String electronicSealDocumentId);

	/**
	 * Download an Electronic Seal Image.
	 * @param electronicSealImageId Non documenté
	 * @return Non documenté
	 */
	@GetExchange(value = "electronic_seal_images/{electronicSealImageId}/download")
	byte[] downloadElectronicSealImage(@PathVariable("electronicSealImageId") String electronicSealImageId);

	/**
	 * Download an Electronic Seal Audit Trail.
	 * @param electronicSealId Non documenté
	 * @return Non documenté
	 */
	@GetExchange(value = "electronic_seals/{electronicSealId}/audit_trails/download")
	byte[] downloadElectronicSealAuditTrail(@PathVariable("electronicSealId") String electronicSealId);

	/**
	 * Get an Electronic Seal.
	 * @param electronicSealId Non documenté
	 * @return Non documenté
	 */
	@GetExchange(value = "electronic_seals/{electronicSealId}")
	ElectronicSeal getElectronicSeal(@PathVariable("electronicSealId") String electronicSealId);

	/**
	 * Get an Electronic Seal Audit Trail.
	 * @param electronicSealId Non documenté
	 * @return Non documenté
	 */
	@GetExchange(value = "electronic_seals/{electronicSealId}/audit_trails")
	ElectronicSealAuditTrail getElectronicSealAuditTrail(@PathVariable("electronicSealId") String electronicSealId);

	/**
	 * List Electronic Seal Images.
	 * @param after After cursor (pagination)
	 * @return Non documenté
	 */
	@GetExchange(value = "electronic_seal_images")
	ListElectronicSealImages200Response listElectronicSealImages(@RequestParam(value = "after", required = false) String after);

	/**
	 * Create an Electronic Seal.
	 * @param body Non documenté
	 * @return Non documenté
	 */
	@PostExchange(value = "electronic_seals")
	ElectronicSeal postElectronicSeals(@RequestBody @Valid CreateElectronicSealPayload body);

	/**
	 * Upload an Electronic Seal Document.
	 * @param body Non documenté
	 * @return Non documenté
	 */
	@PostExchange(value = "electronic_seal_documents")
	ElectronicSealDocument uploadElectronicSealDocument(@RequestBody @Valid UploadElectronicSealDocument body);

	/**
	 * Upload an Electronic Seal Image.
	 * @param body Non documenté
	 * @return Non documenté
	 */
	@PostExchange(value = "electronic_seal_images")
	ElectronicSealImage uploadElectronicSealImage(@RequestBody @Valid UploadElectronicSealImage body);
}
