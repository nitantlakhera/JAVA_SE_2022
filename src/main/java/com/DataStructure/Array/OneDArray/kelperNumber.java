package com.DataStructure.Array.OneDArray;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class kelperNumber {
   public static void main(String [] args) throws IOException {
	   int p =1;
	   int q=100;
	  if(p==1) {
		  System.out.println(p);
	  }
	  boolean found = false;
	  for(int rot =p ; rot<q ; rot++) {
	      String s1 = "";
	      String s2 = "";
	     int number = p*p;
	     String s = Integer.toString(number);
	     char []a =s.toCharArray();
	     if(a.length>1) {
	     for(int i =0; i<a.length ; i++) {
    	     if(i<a.length/2) {
    		    s1=s1+a[i];
    	     }else{
                s2 = s2+a[i];	  
     	     }  
         }
	    FileWriter re =  new FileWriter(System.currentTimeMillis()+"out.txt");
	    BufferedWriter out = new BufferedWriter(re);
	    out.write(s1+"  -> "+s2);
	    out.close();
	    int i = Integer.parseInt(s1);
	     int j = Integer.parseInt(s2);
	     int sum = i+j;  
	     if(sum ==p) {
	    	 System.out.println(p);
	    	 found=true;
	     }
        }
	    p++;
	  }
	  if(found == false) {
		  System.out.println("INVALID RANGE");
	  }
   }
}
