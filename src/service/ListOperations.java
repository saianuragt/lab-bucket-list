package service;

import java.util.*;

import model.TouristPlace;

public class ListOperations{
	
	static List<TouristPlace> list=new ArrayList<TouristPlace>();
	
	public List<TouristPlace> add(TouristPlace places){
		list.add(places);
		return list;
	}
	
	public List<TouristPlace> remove(TouristPlace places){
		list.remove(places);
		return list;
	}
	
	public Object sortByDestination(List<TouristPlace> places) {
		Collections.sort(places,(m1,m2)->m1.getDestination().compareTo(m2.getDestination()));
		return places;
	}
	
	public Object sortByRank(List<TouristPlace> places) {
		Collections.sort(places,(m1,m2)->m1.getRank().compareTo(m2.getRank()));
		return places;
	}
	
	public Object reset(List<TouristPlace> places) {
		places.clear();
		return places;
	}
}