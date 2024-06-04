////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class Consumption implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private ConsumptionApp app;

	/**
	 * Non documenté.
	 */
	private ConsumptionApi api;

	/**
	 * Non documenté.
	 */
	private ConsumptionApp connector;

	/**
	 * No arg constructor.
	 */
	public Consumption() {
	}

	/**
	 * Getter for app.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Consumption#app app}.
	 */
	public ConsumptionApp getApp() {
		return this.app;
	}

	/**
	 * Getter for api.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Consumption#api api}.
	 */
	public ConsumptionApi getApi() {
		return this.api;
	}

	/**
	 * Getter for connector.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Consumption#connector connector}.
	 */
	public ConsumptionApp getConnector() {
		return this.connector;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Consumption#app app}.
	 * @param app value to set
	 */
	public void setApp(ConsumptionApp app) {
		this.app = app;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Consumption#api api}.
	 * @param api value to set
	 */
	public void setApi(ConsumptionApi api) {
		this.api = api;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Consumption#connector connector}.
	 * @param connector value to set
	 */
	public void setConnector(ConsumptionApp connector) {
		this.connector = connector;
	}
}
