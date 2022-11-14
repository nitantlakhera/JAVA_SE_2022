package com.JavaSE.Java7.String.comparableAndComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator_test implements Comparator<comparator_test> {
  private String name;
  private String collage_name;
  private int roll_number;
  
  public comparator_test(String name, String collage_name, int roll_number) {
	super();
	this.name = name;
	this.collage_name = collage_name;
	this.roll_number = roll_number;
 }
 public comparator_test() {}
 
 @Override
 public int compare(comparator_test o1, comparator_test o2) {
	if(o1.roll_number == o2.roll_number) {
		return 0;
	}else if(o1.roll_number > o2.roll_number){
		return +1;
	}else {
		return -1;
	}
 }
 
 public static void main(String args []) {
	   ArrayList<comparator_test > list =  new ArrayList<comparator_test>();
	   list.add(new comparator_test("nitant", "rgpv", 10));
	   list.add(new comparator_test("neha", " kgbv ", 15));
	   list.add(new comparator_test("nitant", "navoday", 20));
	   Collections.sort(list , new comparator_test());
       for(comparator_test c : list) { 
    	    System.out.println(c.collage_name+" " + c.name + " " +c.roll_number);
       }
    }
 }