package com.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowiring/annotation/config.xml");
		BeanB beanB = context.getBean(BeanB.class);
		System.out.println(beanB.getBeanA().getName());
	}
}
