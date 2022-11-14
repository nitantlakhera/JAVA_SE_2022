package com.JavaSE.Java7.OOPs.Aggregation;

public class Book {
 private String name;
 private double price;
 Author auther;
public Book(String name, double price, Author auther) {
	super();
	this.name = name;
	this.price = price;
	this.auther = auther;
}
public void getDetails() {
	System.out.println("name of the book :: " + name);
	System.out.println("price of the book :: " + price);
	System.out.println("auther of the book :: " + auther.getName());	
}
}
