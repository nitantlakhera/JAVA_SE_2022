package com.JavaSE.Java7.String.comparableAndComparator;
import java.util.ArrayList;
import java.util.Collections;

public class comparable_test implements Comparable<comparable_test>{
     private String  name;
     private String collage_name;
     private int rollNumber;
     
     public comparable_test(String name , String collage_name, int rollNumber) {
	    this.name = name;
	    this.rollNumber =  rollNumber;
	    this.collage_name =  collage_name;
     }
	@Override
     public int compareTo(comparable_test o) {
		if(rollNumber == o.rollNumber) {
			return 0;
		}else if(rollNumber > o.rollNumber){
			return 1;
		}else {
			return -1;
		}
	}
	public static void main(String args []) {
		ArrayList<comparable_test> list = new ArrayList<comparable_test>();
		list.add(new comparable_test("A", "kumhari", 10));
		list.add(new comparable_test("B", "Damoh",   3));
		list.add(new comparable_test("C", "Jabalpur",20));
	    Collections.sort(list);
	    for(comparable_test c : list) {
	    	System.out.println(c.name + " " + c.collage_name +" "+ c.rollNumber  );
	    }
	}
}