package com.caym.pokeapi.models.pokemon.pokemonSpecies;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.APIResource;
import com.caym.pokeapi.models.utility.commonModels.Description;
import com.caym.pokeapi.models.utility.commonModels.FlavorText;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class PokemonSpecies {

	Integer id;
	String name;
	Integer order;
	Integer gender_rate;
	Integer capture_rate;
	Integer base_happiness;
	Boolean is_baby;
	Boolean is_legendary;
	Boolean is_mythical;
	Integer hatch_counter;
	Boolean has_gender_differences;
	Boolean forms_switchable;
	NamedAPIResource growth_rate;
	List<PokemonSpeciesDexEntry> pokedex_numbers;
	List<NamedAPIResource> egg_groups;
	NamedAPIResource color;
	NamedAPIResource shape;
	NamedAPIResource evolves_from_species;
	APIResource evolution_chain;
	NamedAPIResource habitat;
	NamedAPIResource generation;
	List<Name> names;
	List<PalParkEncounterArea> pal_park_encounters;
	List<FlavorText> flavor_text_entries;
	List<Description> form_descriptions;
	List<Genus> genera;
	List<PokemonSpeciesVariety> varieties;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public Integer getGender_rate() {
		return gender_rate;
	}
	public void setGender_rate(Integer gender_rate) {
		this.gender_rate = gender_rate;
	}
	public Integer getCapture_rate() {
		return capture_rate;
	}
	public void setCapture_rate(Integer capture_rate) {
		this.capture_rate = capture_rate;
	}
	public Integer getBase_happiness() {
		return base_happiness;
	}
	public void setBase_happiness(Integer base_happiness) {
		this.base_happiness = base_happiness;
	}
	public Boolean getIs_baby() {
		return is_baby;
	}
	public void setIs_baby(Boolean is_baby) {
		this.is_baby = is_baby;
	}
	public Boolean getIs_legendary() {
		return is_legendary;
	}
	public void setIs_legendary(Boolean is_legendary) {
		this.is_legendary = is_legendary;
	}
	public Boolean getIs_mythical() {
		return is_mythical;
	}
	public void setIs_mythical(Boolean is_mythical) {
		this.is_mythical = is_mythical;
	}
	public Integer getHatch_counter() {
		return hatch_counter;
	}
	public void setHatch_counter(Integer hatch_counter) {
		this.hatch_counter = hatch_counter;
	}
	public Boolean getHas_gender_differences() {
		return has_gender_differences;
	}
	public void setHas_gender_differences(Boolean has_gender_differences) {
		this.has_gender_differences = has_gender_differences;
	}
	public Boolean getForms_switchable() {
		return forms_switchable;
	}
	public void setForms_switchable(Boolean forms_switchable) {
		this.forms_switchable = forms_switchable;
	}
	public NamedAPIResource getGrowth_rate() {
		return growth_rate;
	}
	public void setGrowth_rate(NamedAPIResource growth_rate) {
		this.growth_rate = growth_rate;
	}
	public List<PokemonSpeciesDexEntry> getPokedex_numbers() {
		return pokedex_numbers;
	}
	public void setPokedex_numbers(List<PokemonSpeciesDexEntry> pokedex_numbers) {
		this.pokedex_numbers = pokedex_numbers;
	}
	public List<NamedAPIResource> getEgg_groups() {
		return egg_groups;
	}
	public void setEgg_groups(List<NamedAPIResource> egg_groups) {
		this.egg_groups = egg_groups;
	}
	public NamedAPIResource getColor() {
		return color;
	}
	public void setColor(NamedAPIResource color) {
		this.color = color;
	}
	public NamedAPIResource getShape() {
		return shape;
	}
	public void setShape(NamedAPIResource shape) {
		this.shape = shape;
	}
	public NamedAPIResource getEvolves_from_species() {
		return evolves_from_species;
	}
	public void setEvolves_from_species(NamedAPIResource evolves_from_species) {
		this.evolves_from_species = evolves_from_species;
	}
	public APIResource getEvolution_chain() {
		return evolution_chain;
	}
	public void setEvolution_chain(APIResource evolution_chain) {
		this.evolution_chain = evolution_chain;
	}
	public NamedAPIResource getHabitat() {
		return habitat;
	}
	public void setHabitat(NamedAPIResource habitat) {
		this.habitat = habitat;
	}
	public NamedAPIResource getGeneration() {
		return generation;
	}
	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<PalParkEncounterArea> getPal_park_encounters() {
		return pal_park_encounters;
	}
	public void setPal_park_encounters(List<PalParkEncounterArea> pal_park_encounters) {
		this.pal_park_encounters = pal_park_encounters;
	}
	public List<FlavorText> getFlavor_text_entries() {
		return flavor_text_entries;
	}
	public void setFlavor_text_entries(List<FlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}
	public List<Description> getForm_descriptions() {
		return form_descriptions;
	}
	public void setForm_descriptions(List<Description> form_descriptions) {
		this.form_descriptions = form_descriptions;
	}
	public List<Genus> getGenera() {
		return genera;
	}
	public void setGenera(List<Genus> genera) {
		this.genera = genera;
	}
	public List<PokemonSpeciesVariety> getVarieties() {
		return varieties;
	}
	public void setVarieties(List<PokemonSpeciesVariety> varieties) {
		this.varieties = varieties;
	}
	
}
