package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class Faculty implements Collage {

	public String collegeName() {
		return "CUTM, PKD";
	}

	public void name() {

		System.out.println("I am a Faculty");
	}
}
