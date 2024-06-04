////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.SignatureRequestActivatedStatusValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Status.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class SignatureRequestActivatedStatus implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private SignatureRequestActivatedStatusValue Value;

	/**
	 * No arg constructor.
	 */
	public SignatureRequestActivatedStatus() {
	}

	public static final SignatureRequestActivatedStatus ongoing = new SignatureRequestActivatedStatus(SignatureRequestActivatedStatusValue.ongoing);
	public static final SignatureRequestActivatedStatus approval = new SignatureRequestActivatedStatus(SignatureRequestActivatedStatusValue.approval);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public SignatureRequestActivatedStatus(SignatureRequestActivatedStatusValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedStatus#Value Value}.
	 */
	public SignatureRequestActivatedStatusValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.SignatureRequestActivatedStatus#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(SignatureRequestActivatedStatusValue Value) {
		this.Value = Value;
	}
}
