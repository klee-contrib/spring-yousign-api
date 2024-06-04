////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.AuditTrailLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de AuditTrailLocale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class AuditTrailLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private AuditTrailLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public AuditTrailLocale() {
	}

	public static final AuditTrailLocale de = new AuditTrailLocale(AuditTrailLocaleValue.de);
	public static final AuditTrailLocale en = new AuditTrailLocale(AuditTrailLocaleValue.en);
	public static final AuditTrailLocale es = new AuditTrailLocale(AuditTrailLocaleValue.es);
	public static final AuditTrailLocale fr = new AuditTrailLocale(AuditTrailLocaleValue.fr);
	public static final AuditTrailLocale it = new AuditTrailLocale(AuditTrailLocaleValue.it);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public AuditTrailLocale(AuditTrailLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.AuditTrailLocale#Value Value}.
	 */
	public AuditTrailLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.AuditTrailLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(AuditTrailLocaleValue Value) {
		this.Value = Value;
	}
}
