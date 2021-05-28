package com.caym.pokeapi.models.locations.palParkAreas;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Name;

public class PalParkArea {
	Integer id;
	String name;
	List<Name> names;
	List<PalParkEncounterSpecies> pokemon_encounters;
}
