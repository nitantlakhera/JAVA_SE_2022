package com.JavaSE.Java7.Collections.HashMap.CustomKey;

import java.util.HashMap;

public class test {
   
	public static void main(String args[]) {
	   Student s= new Student(1,"nitant");
	   Student s1 = new Student(1,"nitant");
	   HashMap<Student, String> map =new HashMap<Student, String>();
	   map.put(s, "TCS");
	   map.put(s1, "CTS");
	   System.out.println(map);
   }

}