package com.JavaSE.Java7.Collections.HashMap.CustomKey;

public class Student {
   int  registrationNumber;
   String name;
   public Student(int registrationNumber, String name) {
	   this.registrationNumber = registrationNumber;
	   this.name = name;
   }
 
@Override
public String toString() {
	return "Student [registrationNumber=" + registrationNumber + ", name=" + name + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + registrationNumber;
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
	Student other = (Student) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (registrationNumber != other.registrationNumber)
		return false;
	return true;
}
}