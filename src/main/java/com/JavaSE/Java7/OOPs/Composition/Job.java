package com.JavaSE.Java7.OOPs.Composition;

public class Job {
private String role;
private double salary;
private int id;
public Job(String role, double salary, int id) {
	super();
	this.role = role;
	this.salary = salary;
	this.id = id;
}
public String getRole() {
	return role;
}
public double getSalary() {
	return salary;
}
public int getId() {
	return id;
}
}
