////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestSourceValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Source.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestSource implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestSourceValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestSource() {
	}

	public static final SignatureRequestSource app = new SignatureRequestSource(SignatureRequestSourceValue.app);
	public static final SignatureRequestSource public_api = new SignatureRequestSource(SignatureRequestSourceValue.public_api);
	public static final SignatureRequestSource connector_hubspot_api = new SignatureRequestSource(SignatureRequestSourceValue.connector_hubspot_api);
	public static final SignatureRequestSource connector_salesforce_api = new SignatureRequestSource(SignatureRequestSourceValue.connector_salesforce_api);
	public static final SignatureRequestSource connector_google_api = new SignatureRequestSource(SignatureRequestSourceValue.connector_google_api);
	public static final SignatureRequestSource connector_zapier_api = new SignatureRequestSource(SignatureRequestSourceValue.connector_zapier_api);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestSource(SignatureRequestSourceValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSource#Value Value}.
	 */
	public SignatureRequestSourceValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestSource#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestSourceValue Value) {
		this.Value = Value;
	}
}
