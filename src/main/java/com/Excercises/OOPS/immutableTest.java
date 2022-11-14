package com.Excercises.OOPS;

import java.util.Date;

public class immutableTest {
	public static void main(String args []) 
	{
		immutableClass imm = new immutableClass(1, "test", new Date());
		System.out.println(imm);
		tryModification(imm.getImmutableField1(), imm.getImmutableField2(), imm.getMutableField());
		System.out.println(imm);
	}
	
	@SuppressWarnings("deprecation")
	private static void tryModification(Integer immutableField1, String integer, Date mutableField)
    {
        immutableField1 = 10000;
        integer = "test changed";
        mutableField.setDate(10);
    }
}
