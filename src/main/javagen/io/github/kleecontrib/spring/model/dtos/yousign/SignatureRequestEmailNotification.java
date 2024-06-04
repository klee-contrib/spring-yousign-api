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
public class SignatureRequestEmailNotification implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	private SignatureRequestEmailNotificationSender sender;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestEmailNotification() {
	}

	/**
	 * Getter for sender.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestEmailNotification#sender sender}.
	 */
	public SignatureRequestEmailNotificationSender getSender() {
		return this.sender;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestEmailNotification#sender sender}.
	 * @param sender value to set
	 */
	public void setSender(SignatureRequestEmailNotificationSender sender) {
		this.sender = sender;
	}
}
