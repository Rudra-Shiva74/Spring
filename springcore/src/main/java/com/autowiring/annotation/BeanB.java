package com.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BeanB {
	@Autowired
	private BeanA beanA;

	private String name;

	public BeanB(BeanA beanA) {
		super();
		this.beanA = beanA;
	}

	public BeanB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeanA getBeanA() {
		return beanA;
	}

//	@Qualifier("beanA2")
	public void setBeanA(BeanA beanA) {
		this.beanA = beanA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
