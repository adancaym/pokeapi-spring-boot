package com.caym.pokeapi.models.moves.moves;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;
import com.caym.pokeapi.models.utility.commonModels.VerboseEffect;

public class PastMoveStatValues {

	Integer accuracy;
	Integer effect_chance;
	Integer power;
	Integer pp;
	List<VerboseEffect> effect_entries;
	NamedAPIResource type;
	NamedAPIResource version_group;
}
