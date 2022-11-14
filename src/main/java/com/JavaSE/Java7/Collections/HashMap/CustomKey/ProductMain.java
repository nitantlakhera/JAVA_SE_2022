package com.JavaSE.Java7.Collections.HashMap.CustomKey;

import java.util.HashMap;

public class ProductMain {
  public static void main(String args[]) {
	  String companyName="TCS";
	  HashMap<Product, String> hashMap = new HashMap<Product, String>();
	  Product product_1 = new Product();
	  product_1.setId(112);
	  product_1.setName("4G");
	  hashMap.put(product_1, companyName);
	  Product product_2 = new Product();
	  companyName = "Ericsson";
	  product_2.setId(112);
	  product_2.setName("4G");
	  hashMap.put(product_2, companyName);
	  System.out.println(hashMap);
  }
}
