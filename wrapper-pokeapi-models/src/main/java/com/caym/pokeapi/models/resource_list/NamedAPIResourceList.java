package com.caym.pokeapi.models.resource_list;

import java.io.Serializable;
import java.util.List;

import com.caym.pokeapi.models.utility.commonModels.NamedAPIResource;

public class NamedAPIResourceList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7719801460185491716L;
	Integer count;
	String next;
	Boolean previus;
	List<NamedAPIResource> results;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public Boolean getPrevius() {
		return previus;
	}
	public void setPrevius(Boolean previus) {
		this.previus = previus;
	}
	public List<NamedAPIResource> getResults() {
		return results;
	}
	public void setResults(List<NamedAPIResource> results) {
		this.results = results;
	}
}
