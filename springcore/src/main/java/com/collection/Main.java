package com.collection;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collection/config.xml");
		Employee employee = context.getBean("Emp", Employee.class);
		System.out.println(employee.getName());
		System.out.println(employee.getNumber());
		System.out.println(employee.getCourse());
		System.out.println(employee.getAddress());
		System.out.println(employee.getProperties());

//		for (String c : employee.getNumber()) {
//			System.out.println(c);
//		}
//		for (String c : employee.getAddress()) {
//			System.out.println(c);
//		}
	}
}
