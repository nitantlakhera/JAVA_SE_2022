package com.JavaSE.Java7.Generics;

import java.util.ArrayList;
import java.util.List;

public class generics {
   public static void main(String args []) {
	   //withoutGenerics();
	   withGenerics();   
   }
   public static void withGenerics() {
	   List<String> list = new ArrayList<String>();
	   list.add("abc");
	   //list.add(new Integer(5));// CT error is better that run time exception
       for (Object o : list) {
		   System.out.println(o);
	   }
   }
   public static void withoutGenerics () {
	   List list = new ArrayList();
	   list.add("abc");
	   list.add(new Integer(5));
	   for (Object o : list) {
		   String s = (String) o;
		   System.out.println(s);
	   }   
   }
}