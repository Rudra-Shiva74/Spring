package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/reference/config.xml");
		Abhi abhi = context.getBean("abhiref", Abhi.class);
		System.out.println(abhi.getName());
		System.out.println(abhi.getTiwari().getName());
	}
}
