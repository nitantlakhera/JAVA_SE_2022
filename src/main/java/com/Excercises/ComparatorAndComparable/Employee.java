package com.Excercises.ComparatorAndComparable;

public class Employee implements Comparable<Employee>{
	private int id;
    private String name;
    private int age;
    private long salary;
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
	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return (this.id - o.id);
	}
}