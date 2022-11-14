package com.Excercises.OOPS;

public class hashCodeAndEuals {
      private int number;
      private String name;

      public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "hashCodeAndEuals [number=" + number + ", name=" + name + "]";
	}

	public hashCodeAndEuals(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String args[]) {
          hashCodeAndEuals hash = new hashCodeAndEuals(12, "neha");
          hashCodeAndEuals hash1 = new hashCodeAndEuals(12, "neha");
          
      }
}
