package com.JavaSE.Java7.Collections.Code;

public class student1 {
	int rollno;  
	String name;  
	int age;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "student1 [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	public student1(int rollno2, String name2, int age2) {
	this.rollno = rollno2;
	this.name = name2;
	this.age = age2;
	}
	
}
