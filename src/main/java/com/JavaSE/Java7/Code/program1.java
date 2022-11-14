package com.JavaSE.Java7.Code;

public class program1 {
  public static void main(String args[]) {
	 int number = 1234321;
	 StringBuilder s = new StringBuilder();
	 s.append(number);
	 s.reverse();
	 if(number == Integer.parseInt(s.toString())) {
		 System.out.println("palindrom");
	 }else {
		 System.out.println("no");
	 }
   }
}
