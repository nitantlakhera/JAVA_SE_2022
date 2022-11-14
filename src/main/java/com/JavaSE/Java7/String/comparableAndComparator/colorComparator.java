package com.JavaSE.Java7.String.comparableAndComparator;

import java.util.Comparator;

public class colorComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.color.compareTo(o2.color);
	}
}
