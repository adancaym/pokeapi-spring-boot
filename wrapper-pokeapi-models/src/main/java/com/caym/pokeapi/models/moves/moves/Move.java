package com.caym.pokeapi.models.moves.moves;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.APIResource;
import com.caym.pokeapi.models.utility.commonModels.MachineVersionDetail;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;
import com.caym.pokeapi.models.utility.commonModels.VerboseEffect;

public class Move {

	Integer id;
	String name;
	Integer accuracy;
	Integer effect_chance;
	Integer pp;
	Integer priority;
	Integer power;
	ContestComboSets contest_combos;
	NamedAPIResource contest_type;
	APIResource contest_effect;
	NamedAPIResource damage_class;
	List<VerboseEffect> effect_entries;
	List<MoveFlavorText> flavor_text_entries;
	NamedAPIResource generation;
	List<MachineVersionDetail> machines;
	MoveMetaData meta;
	List<Name> names;
	List<PastMoveStatValues> past_values;
	List<MoveStatChange> stat_changes;
	APIResource super_contest_effect;
	NamedAPIResource target;
	NamedAPIResource type;
	
}

