package com.JavaSE.Java7.Collections.Code;
public class solution {
public static void main(String args[])
{
	String s = "i.am.aditya";
	String[] arr = s.split("\\.");
	for(int i=arr.length-1;i>=0;i--)
	{
		if(i==0)System.out.print(arr[i]);
		else System.out.print(arr[i]+".");
	}
	}
}