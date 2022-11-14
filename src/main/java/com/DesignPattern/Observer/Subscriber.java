package com.DesignPattern.Observer;

public class Subscriber {
  private String name;
  private Chennal chennal = new Chennal();
  public Subscriber(String name) {
	super();
	this.name = name;
  }
  public void update(String title) {
	  System.out.println("Hi " + name + "  "+title + " Video Uploaded");
  }
  public void subscribeChennal(Chennal ch) {
	  chennal = ch;
  }
}
