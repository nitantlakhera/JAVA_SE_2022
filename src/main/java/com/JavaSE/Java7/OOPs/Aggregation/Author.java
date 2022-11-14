package com.JavaSE.Java7.OOPs.Aggregation;

public class Author {
  private String name;
  private int age;
  private String place;

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public String getPlace() {
	return place;
}

public Author(String name, int age, String place) {
	super();
	this.name = name;
	this.age = age;
	this.place = place;
}

}
