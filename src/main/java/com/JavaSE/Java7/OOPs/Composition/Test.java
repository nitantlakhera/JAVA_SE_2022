package com.JavaSE.Java7.OOPs.Composition;

public class Test {
public static void main(String agrs []) {
	Job job = new Job("Java Developer ",  10000L, 12);
	Person person = new Person(job);
	person.getDetails();
}
}
