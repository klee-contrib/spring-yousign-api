////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Locale.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue Value;

	/**
	 * No arg constructor.
	 */
	public PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale() {
	}

	public static final PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale en = new PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale(PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue.en);
	public static final PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale fr = new PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale(PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue.fr);
	public static final PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale de = new PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale(PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue.de);
	public static final PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale it = new PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale(PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue.it);
	public static final PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale nl = new PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale(PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue.nl);
	public static final PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale es = new PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale(PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue.es);
	public static final PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale pl = new PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale(PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue.pl);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale(PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale#Value Value}.
	 */
	public PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocale#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(PatchSignatureRequestsSignatureRequestIdApproversApproverIdRequestInfoLocaleValue Value) {
		this.Value = Value;
	}
}
