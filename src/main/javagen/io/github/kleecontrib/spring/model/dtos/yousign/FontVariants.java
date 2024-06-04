////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Non documenté.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class FontVariants implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean italic;

	/**
	 * Non documenté.
	 */
	@NotNull
	private Boolean bold;

	/**
	 * No arg constructor.
	 */
	public FontVariants() {
	}

	/**
	 * Getter for italic.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FontVariants#italic italic}.
	 */
	public Boolean getItalic() {
		return this.italic;
	}

	/**
	 * Getter for bold.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FontVariants#bold bold}.
	 */
	public Boolean getBold() {
		return this.bold;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FontVariants#italic italic}.
	 * @param italic value to set
	 */
	public void setItalic(Boolean italic) {
		this.italic = italic;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.FontVariants#bold bold}.
	 * @param bold value to set
	 */
	public void setBold(Boolean bold) {
		this.bold = bold;
	}
}
