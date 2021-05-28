package com.caym.pokeapi.models.resource_list;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class NamedAPIResourceList {
	Integer count;
	String next;
	Boolean previus;
	List<NamedAPIResource> results;
}
