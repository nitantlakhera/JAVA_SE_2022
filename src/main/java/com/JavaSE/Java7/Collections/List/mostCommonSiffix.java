package com.JavaSE.Java7.Collections.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class mostCommonSiffix {
	
  public static void main(String args []) throws IOException {
	System.out.println("read input");
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader buffereReader = new BufferedReader(reader);
	String[] s = buffereReader.readLine().split(",");
    ArrayList<String> list = new ArrayList<String>();
	for(String str: s) {
    	list.add(str);
    }
	if(new mostCommonSiffix().suffix(list)) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
  }
  public boolean suffix(ArrayList<String> list) {
	  String commonSuffix = null;
	  String str1 = list.get(0) ;
	  String str2 = list.get(1);
	  if(str1.trim().length() > str2.trim().length()) {
          String temp = str1.trim();
          str1 = str2.trim();
          str2 = temp;
  }
  for(int i=0;i<str1.length();i++) {
      String subStr = str1.substring(i,str1.length());
      if(str2.endsWith(subStr)) {
    	  commonSuffix = subStr;
          break;
      }
  }
  if(commonSuffix!=null) {
	  return true;
  }
    return false;
  }
}