////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.MentionTypeValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Type.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class MentionType implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private MentionTypeValue Value;

	/**
	 * No arg constructor.
	 */
	public MentionType() {
	}

	public static final MentionType mention = new MentionType(MentionTypeValue.mention);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public MentionType(MentionTypeValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.MentionType#Value Value}.
	 */
	public MentionTypeValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.MentionType#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(MentionTypeValue Value) {
		this.Value = Value;
	}
}
