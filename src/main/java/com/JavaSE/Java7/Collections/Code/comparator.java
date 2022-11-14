package com.JavaSE.Java7.Collections.Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator {

	public static void main(String args[]) {
		 student1 s1 = new student1(1, "neha", 12);
		 student1 s2 = new student1(2, "sonu", 23);
		 student1 s3 = new student1(3, "monu", 22);
		 student1 s4 = new student1(4, "menu", 8);
		 student1 s5 = new student1(5, "ram",  10);
		 student1 s6 = new student1(6, "saroj",11);
		 ArrayList<student1> list = new ArrayList<student1>();
		 list.add(s1);
		 list.add(s2);
		 list.add(s3);
		 list.add(s4);
		 list.add(s5);
		 list.add(s6);
		 Comparator<student1> com = new Comparator<student1>() {

			@Override
			public int compare(student1 o1, student1 o2) {
			   if(o1.getAge() > o2.getAge()) {
				   return 1;
			   }
				return -1;
			}   
		 };
		 Collections.sort(list, com);
		 for(Object i : list) {
	    	System.out.println(i); 
	     }
	}
}
