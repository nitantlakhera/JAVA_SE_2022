package com.JavaSE.Java7.Code.HashCodeAndEquals;

import java.util.HashSet;
import java.util.Set;

public class Test {
   public static void main(String args[]) {
	   Employee e1 = new Employee();
	   e1.setAddress("BHOPAL");
	   e1.setId(10);
	   e1.setName("ELAKNIT");
	   Employee e2 = new Employee();
	   e2.setAddress("BHOPAL");
	   e2.setId(10);
	   e2.setName("ELAKNIT");
	   System.out.println(e1.equals(e2));
	   Set<Employee> set = new HashSet<Employee>();
	   set.add(e1);
	   set.add(e2);
	   System.out.println(set);
   }
}
