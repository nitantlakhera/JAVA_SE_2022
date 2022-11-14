package com.JavaSE.Java7.immutableClass;

import java.util.ArrayList;

public class CountryMain {
	public static void main(String args []) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("MP");
		list.add("UP");
		list.add("MH");
		Country c = new Country("India", list);
		System.out.println(c.getCountryName()+" "+c.getListOfStates());
	    c.getListOfStates().add("KL");
	    list.add("GJ");
	    System.out.println("Updated List Of Update " + c.getListOfStates());
	}
}
