package com.Excercises.ComparatorAndComparable;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{
	private int id;
    private String name;
    private int age;
    private long salary;
	public EmployeeComparator(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeComparator [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge() - o2.getAge();
	}
}
