package com.autowiring;

public class BeanB {
	private BeanA beanA;
	private String name;

	public BeanB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeanA getBeanA() {
		return beanA;
	}

	public void setBeanA(BeanA beanA) {
		this.beanA = beanA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BeanB(BeanA beanA) {
		super();
		this.beanA = beanA;
	}

}
