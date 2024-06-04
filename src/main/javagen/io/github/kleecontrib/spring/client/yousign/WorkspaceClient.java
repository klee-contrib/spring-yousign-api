////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.GetWorkspaces200Response;
import jakarta.annotation.Generated;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface WorkspaceClient {

	/**
	 * List Workspaces.
	 * 
	 * @param after After cursor (pagination)
	 * @param limit with 10 as default The limit of items count to retrieve.
	 * @return Non documenté
	 */
	@GetExchange(value = "workspaces")
	GetWorkspaces200Response getWorkspaces(@RequestParam(value = "after", required = false) String after,
			@RequestParam(value = "limit", required = false) Integer limit);
}
