package com.caym.pokeapi.models.utility.commonModels;

public class MachineVersionDetail {

	APIResource machine;
	NamedAPIResource version_group;
	public APIResource getMachine() {
		return machine;
	}
	public void setMachine(APIResource machine) {
		this.machine = machine;
	}
	public NamedAPIResource getVersion_group() {
		return version_group;
	}
	public void setVersion_group(NamedAPIResource version_group) {
		this.version_group = version_group;
	}
}
