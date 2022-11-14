package com.JavaSE.Java7.OOPs.Association;

public class city {
   private String cityName;

public String getCityName() {
	return cityName;
}

public void setCityName(String cityName) {
	this.cityName = cityName;
}

@Override
public String toString() {
	return "city [cityName=" + cityName + "]";
}

}
