package com.removexml;

public class Student {

	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Student(Person person) {
		super();
		this.person = person;
	}

	public void Study() {
		getPerson().name();
		System.out.println("Abhishek is Reading book");
	}
}
