package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class Student implements Collage {
	
	public String collegeName() {
		return "CUTM, PKD";
	}

	public void name() {
		System.out.println("I am a Student");
	}

}
