package com.Excercises.OOPS;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {
   public static void main(String args[]) {
	   Employee e1 = new Employee();
       Employee e2 = new Employee();
       e1.setId(100);
       e2.setId(100);       
       System.out.println(e1.equals(e2));
       
       Set<Employee> set = new HashSet<Employee>();
       set.add(e1);
       set.add(e2);
       System.out.println(set);
   }
}
