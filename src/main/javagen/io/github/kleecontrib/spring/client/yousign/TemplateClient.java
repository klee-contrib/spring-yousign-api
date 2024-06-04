////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.GetTemplates200Response;

import jakarta.annotation.Generated;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface TemplateClient {


	/**
	 * List Templates.
	 * @param after After cursor (pagination)
	 * @return Non documenté
	 */
	@GetExchange(value = "templates")
	GetTemplates200Response getTemplates(@RequestParam(value = "after", required = false) String after);
}
