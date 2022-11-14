package com.JavaSE.Java7.Collections.HashMap.CustomKey;

import java.util.HashMap;

public class TCS {
   public static void main(String args[]) {
	   elaknit e1 = new elaknit("nitant" , 1342228);
	   elaknit e2 = new elaknit("elaknit", 1342228);
	   HashMap<elaknit, String> hashMap = new HashMap<elaknit, String>();
	   hashMap.put(e1,  "TCS");
	   hashMap.put(e2, "TCS");
	   System.out.println(hashMap.size() + " " + hashMap ); 
   }
}
