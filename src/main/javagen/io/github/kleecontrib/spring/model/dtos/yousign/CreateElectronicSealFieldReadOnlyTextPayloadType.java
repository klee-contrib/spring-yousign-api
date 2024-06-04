////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CreateElectronicSealFieldReadOnlyTextPayloadTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CreateElectronicSealFieldReadOnlyTextPayloadType implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private CreateElectronicSealFieldReadOnlyTextPayloadTypeValue Value;

	/**
	 * No arg constructor.
	 */
	public CreateElectronicSealFieldReadOnlyTextPayloadType() {
	}

	public static final CreateElectronicSealFieldReadOnlyTextPayloadType read_only_text = new CreateElectronicSealFieldReadOnlyTextPayloadType(CreateElectronicSealFieldReadOnlyTextPayloadTypeValue.read_only_text);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public CreateElectronicSealFieldReadOnlyTextPayloadType(CreateElectronicSealFieldReadOnlyTextPayloadTypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayloadType#Value Value}.
	 */
	public CreateElectronicSealFieldReadOnlyTextPayloadTypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CreateElectronicSealFieldReadOnlyTextPayloadType#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(CreateElectronicSealFieldReadOnlyTextPayloadTypeValue Value) {
		this.Value = Value;
	}
}
