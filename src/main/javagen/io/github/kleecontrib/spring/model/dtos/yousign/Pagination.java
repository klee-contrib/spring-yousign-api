////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;

/**
 * Cursor based pagination.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class Pagination implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private String next_cursor;

	/**
	 * No arg constructor.
	 */
	public Pagination() {
	}

	/**
	 * Getter for next_cursor.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Pagination#next_cursor next_cursor}.
	 */
	public String getNext_cursor() {
		return this.next_cursor;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.Pagination#next_cursor next_cursor}.
	 * @param next_cursor value to set
	 */
	public void setNext_cursor(String next_cursor) {
		this.next_cursor = next_cursor;
	}
}
