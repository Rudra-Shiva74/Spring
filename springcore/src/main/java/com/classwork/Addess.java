package com.classwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Addess {
	@Autowired
	private Home number;

	public Home getNumber() {
		return number;
	}

	public void setNumber(Home number) {
		this.number = number;
	}

	public void name() {
		System.out.println("Hello");
	}
}
