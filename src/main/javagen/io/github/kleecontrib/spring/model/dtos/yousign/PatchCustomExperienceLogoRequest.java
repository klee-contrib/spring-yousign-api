////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * Upload a file.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class PatchCustomExperienceLogoRequest implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private byte[] file;

	/**
	 * No arg constructor.
	 */
	public PatchCustomExperienceLogoRequest() {
	}

	/**
	 * Getter for file.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchCustomExperienceLogoRequest#file file}.
	 */
	public byte[] getFile() {
		return this.file;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchCustomExperienceLogoRequest#file file}.
	 * @param file value to set
	 */
	public void setFile(byte[] file) {
		this.file = file;
	}
}
