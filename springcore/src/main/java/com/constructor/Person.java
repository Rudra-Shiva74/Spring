package com.constructor;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private String addess;
	private Certi certi;
	private List<String> number;

	public Person(String name, int id, String addess, Certi certi, List<String> number) {
		super();
		this.name = name;
		this.id = id;
		this.addess = addess;
		this.certi = certi;
		this.number = number;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.id + " : " + this.addess + " : " + this.certi.toString() + " : " + this.number;
	}

}
