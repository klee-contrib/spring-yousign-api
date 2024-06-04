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

import io.github.kleecontrib.spring.model.dtos.yousign.Contact;
import io.github.kleecontrib.spring.model.dtos.yousign.CreateContact;
import io.github.kleecontrib.spring.model.dtos.yousign.GetContacts200Response;
import io.github.kleecontrib.spring.model.dtos.yousign.UpdateContact;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface ContactClient {


	/**
	 * Delete a Contact.
	 * @param contactId Contact Id
	 */
	@DeleteExchange(value = "contacts/{contactId}")
	void deleteContactsContactId(@PathVariable("contactId") String contactId);

	/**
	 * List Contacts.
	 * @param after After cursor (pagination)
	 * @param limit The limit of items count to retrieve.
	 * @return Non documenté
	 */
	@GetExchange(value = "contacts")
	GetContacts200Response getContacts(@RequestParam(value = "after", required = false) String after, @RequestParam(value = "limit", required = false) Integer limit);

	/**
	 * Get a Contact.
	 * @param contactId Contact Id
	 * @return Non documenté
	 */
	@GetExchange(value = "contacts/{contactId}")
	Contact getContactsContactId(@PathVariable("contactId") String contactId);

	/**
	 * Update a Contact.
	 * @param body Non documenté
	 * @param contactId Contact Id
	 * @return Non documenté
	 */
	@PatchExchange(value = "contacts/{contactId}")
	Contact patchContactsContactId(@PathVariable("contactId") String contactId, @RequestBody @Valid UpdateContact body);

	/**
	 * Create a Contact.
	 * @param body Non documenté
	 * @return Non documenté
	 */
	@PostExchange(value = "contacts")
	Contact postContact(@RequestBody @Valid CreateContact body);
}
