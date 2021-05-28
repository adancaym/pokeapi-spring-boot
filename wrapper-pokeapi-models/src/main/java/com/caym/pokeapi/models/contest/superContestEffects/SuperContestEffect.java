package com.caym.pokeapi.models.contest.superContestEffects;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.FlavorText;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class SuperContestEffect {

	Integer id;
	Integer appeal;
	FlavorText flavor_text_entries;
	List<NamedAPIResource> moves;
}
