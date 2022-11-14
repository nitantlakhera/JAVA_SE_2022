package com.DesignPattern.Factory;

public class factoryClass {
  public static mobiles getMobiles(String mobiles){
	  if(mobiles == null) {
		  return null;
	  }else if(mobiles.equals("samsung")){
		  return new samsung();
	  }else if(mobiles.equals("sony")) {
		  return new sony();
	  }else if(mobiles.equals("apple")) {
		  return new iphone();
	  }
	  return null;
  }
}