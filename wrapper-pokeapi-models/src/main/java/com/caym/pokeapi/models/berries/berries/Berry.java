package com.caym.pokeapi.models.berries.berries;

import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class Berry {

	Integer id;
	String name;
	Integer growth_time;
	Integer max_harvest;
	Integer natural_gift_power;
	Integer size;
	Integer smoothness;
	Integer soil_dryness;
	NamedAPIResource firmness;
	List<BerryFlavorMap> flavors;
	NamedAPIResource item;
	NamedAPIResource natural_gift_type;
	
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
	public Integer getGrowth_time() {
		return growth_time;
	}
	public void setGrowth_time(Integer growth_time) {
		this.growth_time = growth_time;
	}
	public Integer getMax_harvest() {
		return max_harvest;
	}
	public void setMax_harvest(Integer max_harvest) {
		this.max_harvest = max_harvest;
	}
	public Integer getNatural_gift_power() {
		return natural_gift_power;
	}
	public void setNatural_gift_power(Integer natural_gift_power) {
		this.natural_gift_power = natural_gift_power;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getSmoothness() {
		return smoothness;
	}
	public void setSmoothness(Integer smoothness) {
		this.smoothness = smoothness;
	}
	public Integer getSoil_dryness() {
		return soil_dryness;
	}
	public void setSoil_dryness(Integer soil_dryness) {
		this.soil_dryness = soil_dryness;
	}
	public NamedAPIResource getFirmness() {
		return firmness;
	}
	public void setFirmness(NamedAPIResource firmness) {
		this.firmness = firmness;
	}
	public List<BerryFlavorMap> getFlavors() {
		return flavors;
	}
	public void setFlavors(List<BerryFlavorMap> flavors) {
		this.flavors = flavors;
	}
	public NamedAPIResource getItem() {
		return item;
	}
	public void setItem(NamedAPIResource item) {
		this.item = item;
	}
	public NamedAPIResource getNatural_gift_type() {
		return natural_gift_type;
	}
	public void setNatural_gift_type(NamedAPIResource natural_gift_type) {
		this.natural_gift_type = natural_gift_type;
	}
	
}
