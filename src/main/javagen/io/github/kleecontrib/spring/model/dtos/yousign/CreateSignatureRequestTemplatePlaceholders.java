////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;
import java.util.List;

import jakarta.annotation.Generated;

/**
 * When creating a signature request from a template, all substituting data for placeholders defined in the given template.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateSignatureRequestTemplatePlaceholders implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Substituting data for placeholder signers.
	 */
	private List<CreateSignatureRequestTemplatePlaceholdersSignersInner> signers;

	/**
	 * Substituting data for placeholder read_only_text fields.
	 */
	private List<SignatureRequestPlaceholderReadOnlyTextFieldSubstituteInput> read_only_text_fields;

	/**
	 * No arg constructor.
	 */
	public CreateSignatureRequestTemplatePlaceholders() {
	}

	/**
	 * Getter for signers.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestTemplatePlaceholders#signers signers}.
	 */
	public List<CreateSignatureRequestTemplatePlaceholdersSignersInner> getSigners() {
		return this.signers;
	}

	/**
	 * Getter for read_only_text_fields.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestTemplatePlaceholders#read_only_text_fields read_only_text_fields}.
	 */
	public List<SignatureRequestPlaceholderReadOnlyTextFieldSubstituteInput> getRead_only_text_fields() {
		return this.read_only_text_fields;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestTemplatePlaceholders#signers signers}.
	 * @param signers value to set
	 */
	public void setSigners(List<CreateSignatureRequestTemplatePlaceholdersSignersInner> signers) {
		this.signers = signers;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateSignatureRequestTemplatePlaceholders#read_only_text_fields read_only_text_fields}.
	 * @param read_only_text_fields value to set
	 */
	public void setRead_only_text_fields(List<SignatureRequestPlaceholderReadOnlyTextFieldSubstituteInput> read_only_text_fields) {
		this.read_only_text_fields = read_only_text_fields;
	}
}
