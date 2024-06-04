////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.EmbeddedSignerWithSignatureLinkStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Status.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class EmbeddedSignerWithSignatureLinkStatus implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private EmbeddedSignerWithSignatureLinkStatusValue Value;

	/**
	 * No arg constructor.
	 */
	public EmbeddedSignerWithSignatureLinkStatus() {
	}

	public static final EmbeddedSignerWithSignatureLinkStatus initiated = new EmbeddedSignerWithSignatureLinkStatus(EmbeddedSignerWithSignatureLinkStatusValue.initiated);
	public static final EmbeddedSignerWithSignatureLinkStatus notified = new EmbeddedSignerWithSignatureLinkStatus(EmbeddedSignerWithSignatureLinkStatusValue.notified);
	public static final EmbeddedSignerWithSignatureLinkStatus verified = new EmbeddedSignerWithSignatureLinkStatus(EmbeddedSignerWithSignatureLinkStatusValue.verified);
	public static final EmbeddedSignerWithSignatureLinkStatus processing = new EmbeddedSignerWithSignatureLinkStatus(EmbeddedSignerWithSignatureLinkStatusValue.processing);
	public static final EmbeddedSignerWithSignatureLinkStatus consent_given = new EmbeddedSignerWithSignatureLinkStatus(EmbeddedSignerWithSignatureLinkStatusValue.consent_given);
	public static final EmbeddedSignerWithSignatureLinkStatus signed = new EmbeddedSignerWithSignatureLinkStatus(EmbeddedSignerWithSignatureLinkStatusValue.signed);
	public static final EmbeddedSignerWithSignatureLinkStatus aborted = new EmbeddedSignerWithSignatureLinkStatus(EmbeddedSignerWithSignatureLinkStatusValue.aborted);
	public static final EmbeddedSignerWithSignatureLinkStatus error = new EmbeddedSignerWithSignatureLinkStatus(EmbeddedSignerWithSignatureLinkStatusValue.error);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public EmbeddedSignerWithSignatureLinkStatus(EmbeddedSignerWithSignatureLinkStatusValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.EmbeddedSignerWithSignatureLinkStatus#Value Value}.
	 */
	public EmbeddedSignerWithSignatureLinkStatusValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.EmbeddedSignerWithSignatureLinkStatus#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(EmbeddedSignerWithSignatureLinkStatusValue Value) {
		this.Value = Value;
	}
}
