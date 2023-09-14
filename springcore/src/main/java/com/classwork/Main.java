package com.classwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		BeanConfig beanConfig = context.getBean(BeanConfig.class);
		Addess addess = beanConfig.addess();
		addess.name();
		addess.getNumber().name();
	}
}