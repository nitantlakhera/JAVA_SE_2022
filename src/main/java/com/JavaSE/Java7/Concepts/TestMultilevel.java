package com.JavaSE.Java7.Concepts;

class Animal{  
	int a = 10;
	void eat(){
		System.out.println("eating...");
	}  
}  

class Dog extends Animal{  
	int b = 20;
	void bark(){
		System.out.println("barking...");
	}  
}

class BabyDog extends Dog {  
	int c = 30;
	void weep(){
		System.out.println("weeping...");
	}  
} 

public class TestMultilevel {
 public static void main(String args []) {
	 BabyDog b = new BabyDog();
	 b.bark();
	 b.eat();
	 b.weep();
 }
}
