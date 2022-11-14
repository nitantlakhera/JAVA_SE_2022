package com.JavaSE.Java7.OOPs.Association;

import java.util.ArrayList;
import java.util.List;

public class exp {
  public static void main(String args[]) {
	  List<city> list = new ArrayList<city>();
	  state mp = new state();
	  mp.setStateName("Madhya Pradesh");
	  city city1 = new city();
	  city1.setCityName("Jabalpur");
	  city city2 = new city();
	  city2.setCityName("Bhopal");
	  list.add(city1);
	  list.add(city2);
	  mp.setCities(list);
	  System.out.println(mp.getCities()+ " " + mp.getStateName());
  }
}
