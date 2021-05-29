package com.caym.pokeapi.models.pokemon.stats;

import java.util.List;

public class MoveStatAffect {

	List<MoveStatAffect> increase;
	List<MoveStatAffect> decrease;
	public List<MoveStatAffect> getIncrease() {
		return increase;
	}
	public void setIncrease(List<MoveStatAffect> increase) {
		this.increase = increase;
	}
	public List<MoveStatAffect> getDecrease() {
		return decrease;
	}
	public void setDecrease(List<MoveStatAffect> decrease) {
		this.decrease = decrease;
	}
}
