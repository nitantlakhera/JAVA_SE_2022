package com.JavaSE.Java7.Clonable;

public class CloneExample implements Cloneable {
  int Id;
  String Name;

  public CloneExample(int id, String name) {
	super();
	Id = id;
	Name = name;
  }
  public CloneExample clone() throws CloneNotSupportedException {
	  return (CloneExample) super.clone();
  }
}
