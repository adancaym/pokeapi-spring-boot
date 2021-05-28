package com.caym.pokeapi.models.items.item;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.APIResource;
import com.caym.pokeapi.models.utility.commonModels.GenerationGameIndex;
import com.caym.pokeapi.models.utility.commonModels.MachineVersionDetail;
import com.caym.pokeapi.models.utility.commonModels.Name;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;
import com.caym.pokeapi.models.utility.commonModels.VerboseEffect;
import com.caym.pokeapi.models.utility.commonModels.VersionGroupFlavorText;

public class Item {
	Integer id;
	String name; 
	Integer cost;
	Integer fling_power;
	NamedAPIResource fling_effect;
	List<NamedAPIResource> attributes;
	NamedAPIResource category;
	List<VerboseEffect> effect_entries;
	List<VersionGroupFlavorText> flavor_text_entries;
	List<GenerationGameIndex> game_indices;
	List<Name> names;
	ItemSprites sprites;
	List<ItemHolderPokemon> held_by_pokemon;
	APIResource baby_trigger_for;
	List<MachineVersionDetail> machines;
}
