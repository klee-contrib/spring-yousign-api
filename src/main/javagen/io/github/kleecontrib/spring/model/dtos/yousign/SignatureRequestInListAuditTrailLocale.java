////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestInListAuditTrailLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de AuditTrailLocale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestInListAuditTrailLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestInListAuditTrailLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestInListAuditTrailLocale() {
	}

	public static final SignatureRequestInListAuditTrailLocale de = new SignatureRequestInListAuditTrailLocale(SignatureRequestInListAuditTrailLocaleValue.de);
	public static final SignatureRequestInListAuditTrailLocale en = new SignatureRequestInListAuditTrailLocale(SignatureRequestInListAuditTrailLocaleValue.en);
	public static final SignatureRequestInListAuditTrailLocale es = new SignatureRequestInListAuditTrailLocale(SignatureRequestInListAuditTrailLocaleValue.es);
	public static final SignatureRequestInListAuditTrailLocale fr = new SignatureRequestInListAuditTrailLocale(SignatureRequestInListAuditTrailLocaleValue.fr);
	public static final SignatureRequestInListAuditTrailLocale it = new SignatureRequestInListAuditTrailLocale(SignatureRequestInListAuditTrailLocaleValue.it);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestInListAuditTrailLocale(SignatureRequestInListAuditTrailLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListAuditTrailLocale#Value Value}.
	 */
	public SignatureRequestInListAuditTrailLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListAuditTrailLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestInListAuditTrailLocaleValue Value) {
		this.Value = Value;
	}
}
