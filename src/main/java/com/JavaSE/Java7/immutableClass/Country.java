package com.JavaSE.Java7.immutableClass;

import java.util.ArrayList;

public class Country {
	 private final String countryName; 
	 private final ArrayList<String> listOfStates;
	public String getCountryName() {
		return countryName;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<String> getListOfStates() {
		return (ArrayList<String>) listOfStates.clone();
	}

	public Country(String countryName, ArrayList<String> listOfStates) {
		super();
		this.countryName = countryName;
		ArrayList<String> tempList = new ArrayList<String>();
		for (int i = 0;i < listOfStates.size(); i ++) {
			tempList.add(listOfStates.get(i));
		}
		this.listOfStates = tempList;
	}
}