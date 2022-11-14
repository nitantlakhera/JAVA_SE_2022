package com.JavaSE.Java7.Collections.HashMap.CustomKey;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;

public class MainClass {
  @SuppressWarnings("deprecation")
public static void main(String args[]) {
	  HashMap<Employee, String > hashMap = new HashMap<Employee, String>();
	  Employee tcs = new Employee();
	  tcs.setId(1);
	  tcs.setName("Nitant");
	  tcs.setDob(new Date(1987,2,1));
	  tcs.setSalary(new BigDecimal(400000));
	  hashMap.put(tcs, "TCS");
	  
	 
	  Employee cg = new Employee();
	  cg.setId(1);
	  cg.setName("Sonu");
	  cg.setDob(new Date(1987,2,10));
	  cg.setSalary(new BigDecimal(4000));
	  hashMap.put(cg, "INFO");
	  
	  System.out.println(hashMap);
	  System.out.println(hashMap.keySet().iterator().next().getId());
  }
}
