package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BeanB {
	@Autowired
	private BeanA beanA;
	private String name;

	public void bbb() {
		System.out.println(this.beanA.getName());
	}

//	public void setBeanA(BeanA beanA) {
//		this.beanA = beanA;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public BeanB(BeanA beanA) {
//		super();
//		this.beanA = beanA;
//	}

}
