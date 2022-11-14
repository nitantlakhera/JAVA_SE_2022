package com.Excercises.OOPS;

import java.util.Date;

public final class immutableClass {
	private final Integer immutableField1;
	 
    private final String immutableField2;
 
    private final Date mutableField;

	public immutableClass(Integer immutableField1, String immutableField2, Date mutableField) {
		super();
		this.immutableField1 = immutableField1;
		this.immutableField2 = immutableField2;
		this.mutableField = mutableField;
	}

	public Integer getImmutableField1() {
		return immutableField1;
	}

	public String getImmutableField2() {
		return immutableField2;
	}

	public Date getMutableField() {
		return mutableField;
	}

	@Override
	public String toString() {
		return "immutableClass [immutableField1=" + immutableField1 + ", immutableField2=" + immutableField2
				+ ", mutableField=" + mutableField + "]";
	}
	
	public static immutableClass getInstances (Integer immutableField1, String immutableField2, Date mutableField) {
		return new immutableClass(immutableField1, immutableField2, mutableField);
	}
}
