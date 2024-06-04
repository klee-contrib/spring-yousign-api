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
public class FromScratch1RedirectUrls implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private String success;

	/**
	 * Non documenté.
	 */
	private String error;

	/**
	 * No arg constructor.
	 */
	public FromScratch1RedirectUrls() {
	}

	/**
	 * Getter for success.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1RedirectUrls#success success}.
	 */
	public String getSuccess() {
		return this.success;
	}

	/**
	 * Getter for error.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1RedirectUrls#error error}.
	 */
	public String getError() {
		return this.error;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1RedirectUrls#success success}.
	 * @param success value to set
	 */
	public void setSuccess(String success) {
		this.success = success;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FromScratch1RedirectUrls#error error}.
	 * @param error value to set
	 */
	public void setError(String error) {
		this.error = error;
	}
}
