package com.JavaSE.Java7.Collections.HashMap.CustomKey;

public class elaknit {
  private String name;
  private int empId;
  public elaknit(String name, int empId) {
	super();
	this.name = name;
	this.empId = empId;
}
  
@Override
public String toString() {
	return "elaknit [name=" + name + ", empId=" + empId + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empId;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	elaknit other = (elaknit) obj;
	if (empId != other.empId)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
   }
}