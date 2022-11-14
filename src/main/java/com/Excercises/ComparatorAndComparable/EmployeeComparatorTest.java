package com.Excercises.ComparatorAndComparable;

import java.util.Arrays;

public class EmployeeComparatorTest {
	public static void main(String args []) {
		EmployeeComparator[] empArr = new EmployeeComparator[4];
		empArr[0] = new EmployeeComparator(10, "Mikey", 25, 10000);
		empArr[1] = new EmployeeComparator(20, "Arun", 29, 20000);
		empArr[2] = new EmployeeComparator(5, "Lisa", 35, 5000);
		empArr[3] = new EmployeeComparator(1, "Pankaj", 32, 50000);
		for (int i = 0; i < empArr.length; i ++) {
			System.out.println(empArr[i]);
		}
		System.out.println();
		Arrays.sort(empArr);
		for (int i = 0; i < empArr.length; i ++) {
			System.out.println(empArr[i]);
		}
		System.out.println();	
	}
}
