////
//// ATTENTION CE FICHIER EST GENERE AUTOMATIQUEMENT !
////

package io.github.kleecontrib.spring.client.yousign;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PatchExchange;
import org.springframework.web.service.annotation.PostExchange;

import io.github.kleecontrib.spring.model.dtos.yousign.CreateCustomExperience;
import io.github.kleecontrib.spring.model.dtos.yousign.CustomExperience;
import io.github.kleecontrib.spring.model.dtos.yousign.GetCustomExperiences200Response;
import io.github.kleecontrib.spring.model.dtos.yousign.PatchCustomExperienceLogoRequest;
import io.github.kleecontrib.spring.model.dtos.yousign.UpdateCustomExperience;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated("TopModel : https://github.com/klee-contrib/topmodel")
public interface CustomExperienceClient {


	/**
	 * Delete a Custom Experience.
	 * @param customExperienceId Custom Experience Id
	 */
	@DeleteExchange(value = "custom_experiences/{customExperienceId}")
	void deleteCustomExperience(@PathVariable("customExperienceId") String customExperienceId);

	/**
	 * Delete a Custom Experience logo.
	 * @param customExperienceId Custom Experience Id
	 */
	@DeleteExchange(value = "custom_experiences/{customExperienceId}/logo")
	void deleteCustomExperienceLogo(@PathVariable("customExperienceId") String customExperienceId);

	/**
	 * List Custom Experiences.
	 * @param after After cursor (pagination)
	 * @return Non documenté
	 */
	@GetExchange(value = "custom_experiences")
	GetCustomExperiences200Response getCustomExperiences(@RequestParam(value = "after", required = false) String after);

	/**
	 * Get a Custom Experience.
	 * @param customExperienceId Custom Experience Id
	 * @return Non documenté
	 */
	@GetExchange(value = "custom_experiences/{customExperienceId}")
	CustomExperience getCustomExperiencesCustomExperienceId(@PathVariable("customExperienceId") String customExperienceId);

	/**
	 * Update a Custom Experience logo.
	 * @param body Upload a file
	 * @param customExperienceId Custom Experience Id
	 * @return Non documenté
	 */
	@PostExchange(value = "custom_experiences/{customExperienceId}/logo")
	CustomExperience patchCustomExperienceLogo(@PathVariable("customExperienceId") String customExperienceId, @RequestBody @Valid PatchCustomExperienceLogoRequest body);

	/**
	 * Update a Custom Experience.
	 * @param body Non documenté
	 * @param customExperienceId Custom Experience Id
	 * @return Non documenté
	 */
	@PatchExchange(value = "custom_experiences/{customExperienceId}")
	CustomExperience patchCustomExperiencesCustomExperienceId(@PathVariable("customExperienceId") String customExperienceId, @RequestBody @Valid UpdateCustomExperience body);

	/**
	 * Create a Custom Experience.
	 * @param body Non documenté
	 * @return Non documenté
	 */
	@PostExchange(value = "custom_experiences")
	CustomExperience postCustomExperience(@RequestBody @Valid CreateCustomExperience body);
}
