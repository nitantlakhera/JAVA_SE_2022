package com.JavaSE.Java7.immutableClass.immutable;
import java.util.ArrayList;
public final class Country {

	private final String countryName;
	private final ArrayList<String> nameOfState;

	public String getCountryName() {
		return countryName;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<String> getNameOfState() {
		return (ArrayList<String>)nameOfState.clone();
	}

	public Country(String countryName, ArrayList<String> nameOfState) {
		super();
		this.countryName = countryName;
		ArrayList<String> tempList = new ArrayList<String>();
		for (int i = 0; i < nameOfState.size(); i++) {
			tempList.add(nameOfState.get(i));
		}
		this.nameOfState = tempList;
	}
}