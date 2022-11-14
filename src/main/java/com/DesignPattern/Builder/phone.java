package com.DesignPattern.Builder;

public class phone {
	private String os ;
	 private String processor;
	 private String name;
	 private double screenSize;
	 private int battery;
	 private int camera;
	public phone(String os, String processor, String name, double screenSize, int battery, int camera) {
		super();
		this.os = os;
		this.processor = processor;
		this.name = name;
		this.screenSize = screenSize;
		this.battery = battery;
		this.camera = camera;
	}
	@Override
	public String toString() {
		return "phone [os=" + os + ", processor=" + processor + ", name=" + name + ", screenSize=" + screenSize
				+ ", battery=" + battery + ", camera=" + camera + "]";
	}

	 
}
