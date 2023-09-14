package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/constructor/config.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person.toString());
		Addition addition = context.getBean("Addition", Addition.class);
		addition.Sum();
	}
}
