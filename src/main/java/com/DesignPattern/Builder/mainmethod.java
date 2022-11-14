package com.DesignPattern.Builder;

public class mainmethod {
  public static void main(String args[]) {
	  phone ph = new phoneBuilder().setOs("androide").setScreenSize(123).getPhone();
	  System.out.println(ph);	  
  }
}
