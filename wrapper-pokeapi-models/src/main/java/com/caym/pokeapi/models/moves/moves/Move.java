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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(Integer accuracy) {
		this.accuracy = accuracy;
	}
	public Integer getEffect_chance() {
		return effect_chance;
	}
	public void setEffect_chance(Integer effect_chance) {
		this.effect_chance = effect_chance;
	}
	public Integer getPp() {
		return pp;
	}
	public void setPp(Integer pp) {
		this.pp = pp;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	public ContestComboSets getContest_combos() {
		return contest_combos;
	}
	public void setContest_combos(ContestComboSets contest_combos) {
		this.contest_combos = contest_combos;
	}
	public NamedAPIResource getContest_type() {
		return contest_type;
	}
	public void setContest_type(NamedAPIResource contest_type) {
		this.contest_type = contest_type;
	}
	public APIResource getContest_effect() {
		return contest_effect;
	}
	public void setContest_effect(APIResource contest_effect) {
		this.contest_effect = contest_effect;
	}
	public NamedAPIResource getDamage_class() {
		return damage_class;
	}
	public void setDamage_class(NamedAPIResource damage_class) {
		this.damage_class = damage_class;
	}
	public List<VerboseEffect> getEffect_entries() {
		return effect_entries;
	}
	public void setEffect_entries(List<VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
	}
	public List<MoveFlavorText> getFlavor_text_entries() {
		return flavor_text_entries;
	}
	public void setFlavor_text_entries(List<MoveFlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}
	public NamedAPIResource getGeneration() {
		return generation;
	}
	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}
	public List<MachineVersionDetail> getMachines() {
		return machines;
	}
	public void setMachines(List<MachineVersionDetail> machines) {
		this.machines = machines;
	}
	public MoveMetaData getMeta() {
		return meta;
	}
	public void setMeta(MoveMetaData meta) {
		this.meta = meta;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<PastMoveStatValues> getPast_values() {
		return past_values;
	}
	public void setPast_values(List<PastMoveStatValues> past_values) {
		this.past_values = past_values;
	}
	public List<MoveStatChange> getStat_changes() {
		return stat_changes;
	}
	public void setStat_changes(List<MoveStatChange> stat_changes) {
		this.stat_changes = stat_changes;
	}
	public APIResource getSuper_contest_effect() {
		return super_contest_effect;
	}
	public void setSuper_contest_effect(APIResource super_contest_effect) {
		this.super_contest_effect = super_contest_effect;
	}
	public NamedAPIResource getTarget() {
		return target;
	}
	public void setTarget(NamedAPIResource target) {
		this.target = target;
	}
	public NamedAPIResource getType() {
		return type;
	}
	public void setType(NamedAPIResource type) {
		this.type = type;
	}
	
	
	
}

