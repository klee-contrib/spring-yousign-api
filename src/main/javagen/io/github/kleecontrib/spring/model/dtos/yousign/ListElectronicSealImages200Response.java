////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import jakarta.annotation.Generated;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class ListElectronicSealImages200Response implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Cursor based pagination.
	 */
	private Pagination meta;

	/**
	 * Non documenté.
	 */
	private List<ElectronicSealImage> data;

	/**
	 * No arg constructor.
	 */
	public ListElectronicSealImages200Response() {
	}

	/**
	 * Getter for meta.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ListElectronicSealImages200Response#meta meta}.
	 */
	public Pagination getMeta() {
		return this.meta;
	}

	/**
	 * Getter for data.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ListElectronicSealImages200Response#data data}.
	 */
	public List<ElectronicSealImage> getData() {
		return this.data;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ListElectronicSealImages200Response#meta meta}.
	 * @param meta value to set
	 */
	public void setMeta(Pagination meta) {
		this.meta = meta;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.ListElectronicSealImages200Response#data data}.
	 * @param data value to set
	 */
	public void setData(List<ElectronicSealImage> data) {
		this.data = data;
	}
}
