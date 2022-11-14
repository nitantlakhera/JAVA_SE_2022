package com.Excercises.OOPS;

import java.util.ArrayList;
import java.util.List;

class Test {
	public List<Integer> get () {
		System.out.println("Parent ");
		return new ArrayList<Integer>();
	}
}

class Test1 extends Test {
	public List<Integer> get () {
		System.out.println("Child ");
		return new ArrayList<Integer>();
	}
}
public class Testing {

	public static void main(String args []) {
	   Test t = new Test();
       t.get();
	}
	

}