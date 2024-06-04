////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestAuditTrailLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de AuditTrailLocale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestAuditTrailLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestAuditTrailLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestAuditTrailLocale() {
	}

	public static final SignatureRequestAuditTrailLocale de = new SignatureRequestAuditTrailLocale(SignatureRequestAuditTrailLocaleValue.de);
	public static final SignatureRequestAuditTrailLocale en = new SignatureRequestAuditTrailLocale(SignatureRequestAuditTrailLocaleValue.en);
	public static final SignatureRequestAuditTrailLocale es = new SignatureRequestAuditTrailLocale(SignatureRequestAuditTrailLocaleValue.es);
	public static final SignatureRequestAuditTrailLocale fr = new SignatureRequestAuditTrailLocale(SignatureRequestAuditTrailLocaleValue.fr);
	public static final SignatureRequestAuditTrailLocale it = new SignatureRequestAuditTrailLocale(SignatureRequestAuditTrailLocaleValue.it);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestAuditTrailLocale(SignatureRequestAuditTrailLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestAuditTrailLocale#Value Value}.
	 */
	public SignatureRequestAuditTrailLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestAuditTrailLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestAuditTrailLocaleValue Value) {
		this.Value = Value;
	}
}
