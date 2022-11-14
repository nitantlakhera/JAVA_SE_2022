package com.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Chennal {
  List<Subscriber> list = new ArrayList<Subscriber>();
  private String title;
  public void subscriber (Subscriber sub) {
	  list.add(sub);
  }
  public void unSubscribe(Subscriber sub) {
	  list.remove(sub);
  }
  public void nofifySubscriber (String title) {
	  for (Subscriber sub : list) {
		  sub.update(title);
	  }
  }
  public void upload (String title) {
	  this.title = title;
	  nofifySubscriber(title);
  }
}
