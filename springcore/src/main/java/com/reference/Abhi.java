package com.reference;

public class Abhi {
	private String name;
	private Tiwari tiwari;

	public Abhi(String name, Tiwari tiwari) {
		super();
		this.name = name;
		this.tiwari = tiwari;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tiwari getTiwari() {
		return tiwari;
	}

	public void setTiwari(Tiwari tiwari) {
		this.tiwari = tiwari;
	}

	public Abhi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Abhi [name=" + name + ", tiwari=" + tiwari + "]";
	}

}
