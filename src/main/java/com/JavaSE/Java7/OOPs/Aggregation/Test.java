package com.JavaSE.Java7.OOPs.Aggregation;

public class Test {
public static void main(String args[]) {
	Author auther =  new Author("JK Jain", 23, "Bhopal");
	Book book = new Book("Physics", 100, auther);
	book.getDetails();
}
}
