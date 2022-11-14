package com.Algorithm.DsaImplementation.DynamicPrograming;

public class PrintName5Times {
	public static void main (String args[]) {
		//PrintName5Times.print(5, "Nitant");		
	 	//PrintName5Times.print1(5, "Sonu", 0);
	    PrintName5Times.print2(5, 0, "Neha");
	}
	
	
	public static void print(int times, String name) {
		if (times == 0) {
			return;
		} 
		System.out.println(name);
		times = times - 1;
		print(times, name);
	}
	
	public static void print1 (int times, String name, int index) {
		if (index == times) {
			return;
		}
		index = index + 1;
		System.out.println(name);
		print1(times, name, index);
	}
	
	public static int print2(int times, int count, String names) {
		if (times == count) {
			return count;
		}
		count = count + 1;
		System.out.println(names);
		return print2(times, count, names);
	}
}
