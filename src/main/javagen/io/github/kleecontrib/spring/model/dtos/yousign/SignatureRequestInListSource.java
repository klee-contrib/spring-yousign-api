////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestInListSourceValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Source.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestInListSource implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestInListSourceValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestInListSource() {
	}

	public static final SignatureRequestInListSource app = new SignatureRequestInListSource(SignatureRequestInListSourceValue.app);
	public static final SignatureRequestInListSource public_api = new SignatureRequestInListSource(SignatureRequestInListSourceValue.public_api);
	public static final SignatureRequestInListSource connector_hubspot_api = new SignatureRequestInListSource(SignatureRequestInListSourceValue.connector_hubspot_api);
	public static final SignatureRequestInListSource connector_salesforce_api = new SignatureRequestInListSource(SignatureRequestInListSourceValue.connector_salesforce_api);
	public static final SignatureRequestInListSource connector_google_api = new SignatureRequestInListSource(SignatureRequestInListSourceValue.connector_google_api);
	public static final SignatureRequestInListSource connector_zapier_api = new SignatureRequestInListSource(SignatureRequestInListSourceValue.connector_zapier_api);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestInListSource(SignatureRequestInListSourceValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListSource#Value Value}.
	 */
	public SignatureRequestInListSourceValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestInListSource#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestInListSourceValue Value) {
		this.Value = Value;
	}
}
