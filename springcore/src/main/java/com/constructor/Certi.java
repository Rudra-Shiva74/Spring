package com.constructor;

public class Certi {
	private String certificateString;

	public Certi(String certificateString) {
		super();
		this.certificateString = certificateString;
	}

	@Override
	public String toString() {
		return this.certificateString;
	}

}
