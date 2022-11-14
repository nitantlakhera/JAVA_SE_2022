package com.JavaSE.Java7.Interface;

interface drawable{
	public void draw();
}

class rectangle implements drawable {

	@Override
	public void draw() {
	  System.out.println("rectangle");	
	}
}

class circle implements drawable {
	@Override
	public void draw() {
		System.out.println("circle");
	}
}


public class Interface {
   public static void main(String args[]) {
	 drawable d = new circle();
	 d.draw();
	 d = new rectangle();
	 d.draw();
   }
}
