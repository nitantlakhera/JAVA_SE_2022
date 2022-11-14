package com.JavaSE.Java7.OOPs;

public final class immutableClass {
    private final int id;
    private final String name;
   
    public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public immutableClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static void main(String args[]) {
		String s = "elaknit";
		int i = 10;
		immutableClass imm = new immutableClass(i, s);
		System.out.println(imm.getId() +" "+ imm.getName());
	}
}