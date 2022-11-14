package com.JavaSE.Java7.String;

public class string_test {
  public static void main(String args[]) {
	  String s ="hello";
	  s.concat("_world");
	  System.out.println(s);
	  
	  String str = new String("nitant");
	  str.concat("_Lakhera");
	  System.out.println(str);
      StringBuilder sbuild = new StringBuilder();
      sbuild.append("hello");
      System.out.println(sbuild);
      
      s = s.concat("_nitant");
      System.out.println(s);
  }
}
