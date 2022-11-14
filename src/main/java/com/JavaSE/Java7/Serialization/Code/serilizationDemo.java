package com.JavaSE.Java7.Serialization.Code;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serilizationDemo {
   public static void main(String args []) throws IOException, ClassNotFoundException {
	   Save saveObject = new Save();
	   saveObject.i=1012;
      FileOutputStream serilize = new FileOutputStream("demo.txt");	   
 	  ObjectOutputStream out = new ObjectOutputStream(serilize);
	  out.writeObject(saveObject);
 	  out.close();
 	  serilize.close();
 	  
 	  FileInputStream decerialize = new FileInputStream("demo.txt");
      ObjectInputStream in = new ObjectInputStream(decerialize);
      Save object1 = (Save)in.readObject();
      in.close();
      decerialize.close();
      System.out.println("get it -> "  +object1.i);
   }
}
