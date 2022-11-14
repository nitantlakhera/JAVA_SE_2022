package com.Excercises.LogicalCode;

import java.util.ArrayList;
import java.util.Iterator;

public class Lambda {
	public static void main (String args []) 
	{
		Runnable obj = ()-> {
				for (int i = 0; i<10; i ++ ) 
			      {
			    	  System.out.println("helo " + i);
				  }
		 };
		 new Thread(obj).start();
		 
		 
		 
		 ArrayList<String> list = new ArrayList<>();
			list.add("XYZ");
			Iterator<String> itr = list.iterator();
			while (itr.hasNext()) {
				System.out.print(itr.next());
				list.add("ABC");
		}
	}	
}