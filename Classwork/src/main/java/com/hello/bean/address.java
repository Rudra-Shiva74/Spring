package com.hello.bean;

public class address {
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "address [city=" + city + "]";
	}

}
