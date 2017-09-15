package com.reparo.basicSpringDOI;

public class Address {

	String area;
	String city;
	String country;

	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", country=" + country + "]";
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
