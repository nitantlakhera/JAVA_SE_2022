package com.JavaSE.Java7.OOPs.AbstractClass;

public class childClass extends AbstractClass {
	private int empId;
	public childClass(String name, int age , int id) {
		super(name, age);
	    this.empId =  id;
	}

	@Override
	public void work() {
		if(empId == 0) {
			System.out.println("Not working");
		}else {
			System.out.println("Working");
		}
	}
}
