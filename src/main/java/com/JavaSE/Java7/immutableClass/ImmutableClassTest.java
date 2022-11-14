package com.JavaSE.Java7.immutableClass;

public final class ImmutableClassTest {
	private final int RN;
	private final String Name;
	private final String Address;
	public int getRN() {
		return RN;
	}
	public String getName() {
		return Name;
	}
	public String getAddress() {
		return Address;
	}
	public ImmutableClassTest(int rN, String name, String address) {
		super();
		RN = rN;
		Name = name;
		Address = address;
	}
}