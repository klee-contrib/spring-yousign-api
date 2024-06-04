////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.GetUsers200Response;

import jakarta.annotation.Generated;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface UserClient {


	/**
	 * List Users.
	 * @param after After cursor (pagination)
	 * @param limit The limit of items count to retrieve.
	 * @return Non documenté
	 */
	@GetExchange(value = "users")
	GetUsers200Response getUsers(@RequestParam(value = "after", required = false) String after, @RequestParam(value = "limit", required = false) Integer limit);
}
