package com.JavaSE.Java7.Collections.HashCodeEquals;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashCodeAndEuals {
     public static void main(String args []) {
    	 Employee e = new Employee(1, "nitant");
    	 Employee e1 = new Employee(1, "nitant");
    	 HashMap<Employee, String> map = new HashMap<Employee, String>();
    	 map.put(e, "TCS");
    	 map.put(e1, "TCS");
         for (Entry<Employee, String> entry : map.entrySet()) {
        	 System.out.println(entry.getKey() + " " + entry.getValue());
         }
     }
}
