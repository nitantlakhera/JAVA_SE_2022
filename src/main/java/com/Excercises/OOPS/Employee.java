package com.Excercises.OOPS;

public class Employee {
	private Integer id;
    private String firstname;
    private String lastName;
    private String department;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
    
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o == this) {
			 return true;
		}
		if (getClass() == o.getClass()) {
			return true;
		}
		Employee e = (Employee) o;
		if (e.getId() == this.getId()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = result * prime + getId();
		return result;
	}
}
