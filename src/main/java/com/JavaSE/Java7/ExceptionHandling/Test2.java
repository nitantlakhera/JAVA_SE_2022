package com.JavaSE.Java7.ExceptionHandling;

class Parent {
	public void get() {
		try {
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finaly");
		}
		System.out.println("end of the code");
	}
}

class Child extends Parent {
	public void get(){
		try {
			
		} catch (ArithmeticException e) {
			
		} catch (NullPointerException e) {
			
		} finally {
			System.out.println("finally");
		}
	}

	@SuppressWarnings("finally")
	public int show () {
		try {
		  
		} catch (Exception e) {
		  	
		} catch (Throwable e) {
		  
		} finally {
			return 1;
		}
		//System.out.println("hello error"); CT because of unreachable statement.
	}
}

class Parent1{
	public void get() throws Throwable {
		
	}
}
class Child1 extends Parent1{
	public void get () throws Throwable {
		
	}
}

public class Test2 {
  public static void main(String args []) throws Exception {  
	 Parent p = new Child();
	 p.get();
  }
}