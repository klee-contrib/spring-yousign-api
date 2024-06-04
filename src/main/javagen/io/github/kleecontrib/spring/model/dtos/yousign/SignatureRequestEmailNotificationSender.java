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
public class SignatureRequestEmailNotificationSender implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private String type;

	/**
	 * Non documenté.
	 */
	private String custom_name;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestEmailNotificationSender() {
	}

	/**
	 * Getter for type.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestEmailNotificationSender#type type}.
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Getter for custom_name.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestEmailNotificationSender#custom_name custom_name}.
	 */
	public String getCustom_name() {
		return this.custom_name;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestEmailNotificationSender#type type}.
	 * @param type value to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestEmailNotificationSender#custom_name custom_name}.
	 * @param custom_name value to set
	 */
	public void setCustom_name(String custom_name) {
		this.custom_name = custom_name;
	}
}
