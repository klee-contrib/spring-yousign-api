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
public class UploadElectronicSealDocument implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * PDF file.
	 */
	@NotNull
	private byte[] file;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String password;

	/**
	 * No arg constructor.
	 */
	public UploadElectronicSealDocument() {
	}

	/**
	 * Getter for file.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UploadElectronicSealDocument#file file}.
	 */
	public byte[] getFile() {
		return this.file;
	}

	/**
	 * Getter for password.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UploadElectronicSealDocument#password password}.
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UploadElectronicSealDocument#file file}.
	 * @param file value to set
	 */
	public void setFile(byte[] file) {
		this.file = file;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UploadElectronicSealDocument#password password}.
	 * @param password value to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
