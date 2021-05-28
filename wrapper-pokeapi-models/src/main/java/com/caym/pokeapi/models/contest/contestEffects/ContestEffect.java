package com.caym.pokeapi.models.contest.contestEffects;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.Effect;
import com.caym.pokeapi.models.utility.commonModels.FlavorText;

public class ContestEffect {

	Integer id;
	Integer appeal;
	Integer jam;
	List<Effect> effect_entries;
	List<FlavorText> flavor_text_entries;
}
