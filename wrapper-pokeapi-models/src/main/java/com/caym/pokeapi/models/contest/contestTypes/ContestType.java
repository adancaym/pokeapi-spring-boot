package com.caym.pokeapi.models.contest.contestTypes;

import java.util.List;

import com.caym.pokeapi.models.contest.contestEffects.ContestName;
import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class ContestType {

	Integer id;
	String name;
	NamedAPIResource berry_flavor;
	List<ContestName> names;
}
