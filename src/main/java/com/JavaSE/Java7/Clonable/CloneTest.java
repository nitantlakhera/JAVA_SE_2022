package com.JavaSE.Java7.Clonable;

public class CloneTest {
	public static void main(String args []) 
	{
		CloneExample cc = new CloneExample(120, "raja");
		System.out.println(cc.Name);
		try {
			CloneExample cc1 = cc.clone();
			System.out.println(cc1.Name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}