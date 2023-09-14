package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		System.out.println("Here we use ApplicationContext/ioc");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/config.xml");

		Collage Obj = context.getBean("faculty", Collage.class);

		Obj.name();

		System.out.println(Obj.collegeName());

	}
}
