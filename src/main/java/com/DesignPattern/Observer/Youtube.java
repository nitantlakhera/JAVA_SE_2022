package com.DesignPattern.Observer;

public class Youtube {
  public static void main(String args[]) {
	  Chennal ch = new Chennal();
	  Subscriber s1 = new Subscriber("elaknit");
	  Subscriber s2 = new Subscriber("sonu");
	  Subscriber s3 = new Subscriber("neha");
	  Subscriber s4 = new Subscriber("monu");
	  Subscriber s5 = new Subscriber("vikash");
	  Subscriber s6 = new Subscriber("narendra");
	  ch.subscriber(s1);
	  ch.subscriber(s2);
	  ch.subscriber(s3);
	  ch.subscriber(s4);
	  ch.subscriber(s5);
	  ch.subscriber(s6);
	  ch.upload("JAva programming");
  }
}
