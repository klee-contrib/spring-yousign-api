////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Create a placeholder read_only_text field substitute.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestPlaceholderReadOnlyTextFieldSubstituteInput implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String label;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String text;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestPlaceholderReadOnlyTextFieldSubstituteInput() {
	}

	/**
	 * Getter for label.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderReadOnlyTextFieldSubstituteInput#label label}.
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * Getter for text.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderReadOnlyTextFieldSubstituteInput#text text}.
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderReadOnlyTextFieldSubstituteInput#label label}.
	 * @param label value to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestPlaceholderReadOnlyTextFieldSubstituteInput#text text}.
	 * @param text value to set
	 */
	public void setText(String text) {
		this.text = text;
	}
}
