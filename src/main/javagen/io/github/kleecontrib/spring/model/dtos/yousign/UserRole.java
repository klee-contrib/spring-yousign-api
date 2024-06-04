////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.model.dtos.yousign;

import java.io.Serializable;

import io.github.kleecontrib.spring.model.enums.yousign.UserRoleValue;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

/**
 * enum pour les valeurs de Role.
 */
@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public class UserRole implements Serializable {
	/** Serial ID */
	private static final long serialVersionUID = 1L;

	/**
	 * Non documenté.
	 */
	@NotNull
	private UserRoleValue Value;

	/**
	 * No arg constructor.
	 */
	public UserRole() {
	}

	public static final UserRole owner = new UserRole(UserRoleValue.owner);
	public static final UserRole admin = new UserRole(UserRoleValue.admin);
	public static final UserRole member = new UserRole(UserRoleValue.member);

	/**
	 * Enum constructor.
	 * @param Value Code dont on veut obtenir l'instance.
	 */
	public UserRole(UserRoleValue Value) {
		this.Value = Value;
	}

	/**
	 * Getter for Value.
	 *
	 * @return value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UserRole#Value Value}.
	 */
	public UserRoleValue getValue() {
		return this.Value;
	}

	/**
	 * Set the value of {@link io.github.kleecontrib.spring.model.dtos.yousign.UserRole#Value Value}.
	 * @param Value value to set
	 */
	public void setValue(UserRoleValue Value) {
		this.Value = Value;
	}
}
