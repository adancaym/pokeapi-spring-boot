package com.caym.pokeapi.models.pokemon.pokeathlonStats;

import java.util.List;

public class NaturePokeathlonStatAffectSets {

	List<NaturePokeathlonStatAffect> increase;
	List<NaturePokeathlonStatAffect> decrease;
	public List<NaturePokeathlonStatAffect> getIncrease() {
		return increase;
	}
	public void setIncrease(List<NaturePokeathlonStatAffect> increase) {
		this.increase = increase;
	}
	public List<NaturePokeathlonStatAffect> getDecrease() {
		return decrease;
	}
	public void setDecrease(List<NaturePokeathlonStatAffect> decrease) {
		this.decrease = decrease;
	}
}
