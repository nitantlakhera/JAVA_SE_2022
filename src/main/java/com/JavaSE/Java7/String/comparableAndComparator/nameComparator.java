package com.JavaSE.Java7.String.comparableAndComparator;

import java.util.Comparator;

public class nameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}
