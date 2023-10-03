package com.hello.bean;

public class Bean {
	private String name;
	private int id;
	private String dob;
	private address Address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public address getAddress() {
		return Address;
	}

	public void setAddress(address address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Bean [name=" + name + ", id=" + id + ", dob=" + dob + ", Address=" + Address + "]";
	}

}
