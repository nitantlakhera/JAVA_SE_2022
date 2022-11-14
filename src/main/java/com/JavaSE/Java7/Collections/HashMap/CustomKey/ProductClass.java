package com.JavaSE.Java7.Collections.HashMap.CustomKey;

import java.util.HashMap;

public class ProductClass {
	
	public static void main(String argds []) {
		HashMap<String , testClass> m = new HashMap<String, testClass>();
		testClass c = new testClass();
		c.setName("A");
		c.setProductCost(200001);
		
		testClass c1 = new testClass();
		c1.setName("A");
		c1.setProductCost(200001);
		m.put("TCS", c);
		m.put("INFO", c1);
		System.out.println(m.values().toArray().length);
		
		
	}	  

}

class testClass  {
	  public String name;
	  public int productCost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

}
