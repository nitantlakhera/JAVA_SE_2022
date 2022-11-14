package com.Excercises.OOPS;

public class ParentChild {
     public static void main(String args[]) {
    	 Parent p = new Child();
         p.show();
         p.display();
         
         Parent p1 = new Parent();
         
         Child c = new Child();
         c.display();
         
     }
}
