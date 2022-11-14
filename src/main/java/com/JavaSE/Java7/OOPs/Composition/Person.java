package com.JavaSE.Java7.OOPs.Composition;

public class Person {
private Job job;
public Person(Job job) {
	super();
	this.job = job;
}
public void getDetails() {
	System.out.println(job.getSalary());
}
}
