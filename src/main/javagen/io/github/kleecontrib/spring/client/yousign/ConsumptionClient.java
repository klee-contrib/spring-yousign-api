////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.Consumption;

import jakarta.annotation.Generated;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface ConsumptionClient {


	/**
	 * Get Consumptions.
	 * @param authentication_key Non documenté
	 * @param from The "from" date must not be more than 1 year in the past
	
	 * @param to The "to" date must be more recent than the "from" date
	
	 * @return Non documenté
	 */
	@GetExchange(value = "consumptions")
	Consumption getConsumptions(@RequestParam(value = "authentication_key", required = false) String authentication_key, @RequestParam(value = "from", required = false) String from, @RequestParam(value = "to", required = false) String to);

	/**
	 * Export Consumption data.
	 * @param authentication_key Non documenté
	 * @param from The "from" date must not be more than 1 year in the past
	
	 * @param to The "to" date must be more recent than the "from" date
	
	 * @return Non documenté
	 */
	@GetExchange(value = "consumptions/export")
	String getConsumptionsExport(@RequestParam(value = "authentication_key", required = false) String authentication_key, @RequestParam(value = "from", required = false) String from, @RequestParam(value = "to", required = false) String to);
}
