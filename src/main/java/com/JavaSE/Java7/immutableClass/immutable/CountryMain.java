package com.JavaSE.Java7.immutableClass.immutable;

import java.util.ArrayList;

public class CountryMain {
	public static void main(String args []) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("MP");
		list.add("UP");
		list.add("MH");
		Country c = new Country("India" , list);
		System.out.println(c.getCountryName() + " " + c.getNameOfState());
	    System.out.println("Adding karala");
	    c.getNameOfState().add("KL");
	    System.out.println(c.getCountryName() + " " + c.getNameOfState());
	    System.out.println("Adding Gijrat");
	    list.add("GJ");
	    System.out.println(c.getCountryName() + " " + c.getNameOfState());
	}
}
