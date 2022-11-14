package com.JavaSE.Java7.Collections.Code;

import java.util.ArrayList;
import java.util.Collections;

public class comparable {
 public static void main(String args[]) {
	 Student s1 = new Student(1, "neha", 12);
	 Student s2 = new Student(2, "sonu", 23);
	 Student s3 = new Student(3, "monu", 22);
	 Student s4 = new Student(4, "menu", 8);
	 Student s5 = new Student(5, "ram",  10);
	 Student s6 = new Student(6, "saroj",11);
	 ArrayList<Student> list = new ArrayList<Student>();
	 list.add(s1);
	 list.add(s2);
	 list.add(s3);
	 list.add(s4);
	 list.add(s5);
	 list.add(s6);
	 Collections.sort(list);
	 for(Object i : list) {
    	System.out.println(i); 
     }
 }
}
