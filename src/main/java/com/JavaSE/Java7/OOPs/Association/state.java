package com.JavaSE.Java7.OOPs.Association;

import java.util.List;

public class state {
private String stateName;
List<city> cities;

public String getStateName() {
	return stateName;
}
public void setStateName(String stateName) {
	this.stateName = stateName;
}
public List<city> getCities() {
	return cities;
}
public void setCities(List<city> cities) {
	this.cities = cities;
}

}
