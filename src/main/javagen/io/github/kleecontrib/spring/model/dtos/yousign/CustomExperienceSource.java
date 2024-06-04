////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.CustomExperienceSourceValue;

import jakarta.annotation.Generated;

/**
 * enum pour les valeurs de Source.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class CustomExperienceSource implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Custom Experience Source.
	 */
	private CustomExperienceSourceValue Value;

	/**
	 * No arg constructor.
	 */
	public CustomExperienceSource() {
	}

	public static final CustomExperienceSource app = new CustomExperienceSource(CustomExperienceSourceValue.app);
	public static final CustomExperienceSource public_api = new CustomExperienceSource(CustomExperienceSourceValue.public_api);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public CustomExperienceSource(CustomExperienceSourceValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperienceSource#Value Value}.
	 */
	public CustomExperienceSourceValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.CustomExperienceSource#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(CustomExperienceSourceValue Value) {
		this.Value = Value;
	}
}
