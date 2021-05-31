package com.caym.pokeapi.service.machine.services;

import java.util.Map;

import com.caym.pokeapi.models.machines.machines.Machine;
import com.caym.pokeapi.models.resource_list.NamedAPIResourceList;

public interface MachineService {
	NamedAPIResourceList Index(Map<String,String> qparams);
	Machine IdOrName(String idOrName);
}
