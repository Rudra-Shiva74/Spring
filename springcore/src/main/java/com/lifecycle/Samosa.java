package com.lifecycle;

public class Samosa {
	private double price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("set price");
		this.price = price;
	}

	public void init() {
		System.out.println("Init Method of samosa");
	}

	public void destroy() {
		System.out.println("destroy method of samosa");
	}
}
