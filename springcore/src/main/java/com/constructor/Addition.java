package com.constructor;

public class Addition {
	private int num1;
	private int num2;

	public Addition(int num1, int num2) {
		System.out.println("int int");
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("num1=" + this.num1 + " And num2=" + this.num2);
	}

	public Addition(double num1, double num2) {
		System.out.println("double double");
		this.num1 = (int) num1;
		this.num2 = (int) num2;
		System.out.println("num1=" + this.num1 + " And num2=" + this.num2);
	}

	public Addition(String num1, String num2) {
		System.out.println("String String");
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
		System.out.println("num1=" + this.num1 + " And num2=" + this.num2);
	}

	public void Sum() {
		System.out.println("Sum is " + (this.num1 + this.num2));
	}
}
