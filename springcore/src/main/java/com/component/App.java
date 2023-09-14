package com.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/component/config.xml");
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
