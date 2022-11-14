package com.DesignPattern.Adapter;

public class phones {
   public static void main(String args[]) {
	   AndroidCharger androidCharger = new AndroidCharger();
	   IphoneCharger iPhoneCharger =  new IphoneCharger();
	   
	   OnePlus6T onePlus =  new OnePlus6T();
	   androidCharger.charge(onePlus);
	   
	   IphoneX iPhoneX = new IphoneX();
	   iPhoneCharger.charge(iPhoneX);
	   
	   System.out.println();
	   System.out.println("Using adapters:");
	   System.out.println();
	   
	   AndroidToIphoneAdapter IphoneAdapter = new AndroidToIphoneAdapter(onePlus);
	   iPhoneCharger.charge(IphoneAdapter);
	   
	   IPhoneToAndroidAdapter androidPhoneadapter =  new IPhoneToAndroidAdapter(iPhoneX);
	   androidCharger.charge(androidPhoneadapter);
	   
   }
}
