////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestActivatedAuditTrailLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de AuditTrailLocale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestActivatedAuditTrailLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestActivatedAuditTrailLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestActivatedAuditTrailLocale() {
	}

	public static final SignatureRequestActivatedAuditTrailLocale de = new SignatureRequestActivatedAuditTrailLocale(SignatureRequestActivatedAuditTrailLocaleValue.de);
	public static final SignatureRequestActivatedAuditTrailLocale en = new SignatureRequestActivatedAuditTrailLocale(SignatureRequestActivatedAuditTrailLocaleValue.en);
	public static final SignatureRequestActivatedAuditTrailLocale es = new SignatureRequestActivatedAuditTrailLocale(SignatureRequestActivatedAuditTrailLocaleValue.es);
	public static final SignatureRequestActivatedAuditTrailLocale fr = new SignatureRequestActivatedAuditTrailLocale(SignatureRequestActivatedAuditTrailLocaleValue.fr);
	public static final SignatureRequestActivatedAuditTrailLocale it = new SignatureRequestActivatedAuditTrailLocale(SignatureRequestActivatedAuditTrailLocaleValue.it);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestActivatedAuditTrailLocale(SignatureRequestActivatedAuditTrailLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedAuditTrailLocale#Value Value}.
	 */
	public SignatureRequestActivatedAuditTrailLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedAuditTrailLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestActivatedAuditTrailLocaleValue Value) {
		this.Value = Value;
	}
}
