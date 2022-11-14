package com.JavaSE.Java7.String.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
public class test {
   public static void main(String args []) {
	   ArrayList<Student > s = new ArrayList<Student>();
	   s.add(new Student("nitant", "black", 1));
	   s.add(new Student("lakhera", "white", 2));
	   s.add(new Student("akash", "green", 3));
	   s.add(new Student("akshat", "blue", 4));
	   s.add(new Student("puspraj", "dark light", 5));
	   s.add(new Student("patel", "black", 6));
       Collections.sort(s , new nameComparator());
       for(Student al :s) {
    	   System.out.println(al.name +" "+ al.color +" "+al.id);
       }
       
       System.out.println();
       System.out.println("By color");
       System.out.println();
       
       ArrayList<Student > list = new ArrayList<Student>();
	   list.add(new Student("nitant", "black", 1));
	   list.add(new Student("lakhera", "white", 2));
	   list.add(new Student("akash", "green", 3));
	   list.add(new Student("akshat", "blue", 4));
	   list.add(new Student("puspraj", "dark light", 5));
	   list.add(new Student("patel", "black", 6));
       Collections.sort(list , new colorComparator());
       for(Student st :list) {
    	   System.out.println(st.name +" "+ st.color +" "+st.id);
       }
   }
}
