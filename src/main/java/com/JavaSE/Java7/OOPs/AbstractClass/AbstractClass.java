package com.JavaSE.Java7.OOPs.AbstractClass;

public abstract class AbstractClass {

private String name;
private int age;

public AbstractClass(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public abstract void work();
@Override
public String toString() {
	return "AbstractClass [name=" + name + ", age=" + age + "]";
}
public void changeName(String newName) {
	this.name = newName;
}
}
