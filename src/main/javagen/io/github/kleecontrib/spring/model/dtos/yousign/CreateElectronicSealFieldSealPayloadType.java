////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateElectronicSealFieldSealPayloadTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateElectronicSealFieldSealPayloadType implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private CreateElectronicSealFieldSealPayloadTypeValue Value;

	/**
	 * No arg constructor.
	 */
	public CreateElectronicSealFieldSealPayloadType() {
	}

	public static final CreateElectronicSealFieldSealPayloadType seal = new CreateElectronicSealFieldSealPayloadType(CreateElectronicSealFieldSealPayloadTypeValue.seal);
	public static final CreateElectronicSealFieldSealPayloadType read_only_text = new CreateElectronicSealFieldSealPayloadType(CreateElectronicSealFieldSealPayloadTypeValue.read_only_text);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public CreateElectronicSealFieldSealPayloadType(CreateElectronicSealFieldSealPayloadTypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayloadType#Value Value}.
	 */
	public CreateElectronicSealFieldSealPayloadTypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldSealPayloadType#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(CreateElectronicSealFieldSealPayloadTypeValue Value) {
		this.Value = Value;
	}
}
