package com.DesignPattern.Builder;

public class phoneBuilder {
 private String os ;
 private String processor;
 private String name;
 private double screenSize;
 private int battery;
 private int camera;
public String getOs() {
	return os;
}
public phoneBuilder setOs(String os) {
	this.os = os;
	return this;
}
public phoneBuilder setProcessor(String processor) {
	this.processor = processor;
    return this;
}
public  phoneBuilder setName(String name) {
	this.name = name;
     return this;
}
public phoneBuilder setScreenSize(double screenSize) {
	this.screenSize = screenSize;
   return this;
}
public phoneBuilder setBattery(int battery) {
	this.battery = battery;
	return this;
}

public phoneBuilder setCamera(int camera) {
	this.camera = camera;
	return this;
}
 public phone getPhone() {
	 return new phone(os, processor, name, screenSize, battery, camera);
 }
}


