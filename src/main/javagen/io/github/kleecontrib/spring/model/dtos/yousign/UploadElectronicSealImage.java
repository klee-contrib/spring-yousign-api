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
public class UploadElectronicSealImage implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Seal image.
	 */
	@NotNull
	private byte[] file;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String name;

	/**
	 * No arg constructor.
	 */
	public UploadElectronicSealImage() {
	}

	/**
	 * Getter for file.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UploadElectronicSealImage#file file}.
	 */
	public byte[] getFile() {
		return this.file;
	}

	/**
	 * Getter for name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UploadElectronicSealImage#name name}.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UploadElectronicSealImage#file file}.
	 * @param file value to set
	 */
	public void setFile(byte[] file) {
		this.file = file;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UploadElectronicSealImage#name name}.
	 * @param name value to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
