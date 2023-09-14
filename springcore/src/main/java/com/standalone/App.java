package com.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/standalone/config.xml");
		Student st = context.getBean(Student.class);
//		System.out.println(st.getName());
//		System.out.println(st.getCourse());
//		System.out.println(st.getSubject());
//		System.out.println(st.getNumber());
		System.out.println(st.toString());

		System.out.println(st.getName().getClass().getName());
		System.out.println(st.getCourse().getClass().getName());
		System.out.println(st.getSubject().getClass().getName());
		System.out.println(st.getNumber().getClass().getName());
		System.out.println(st.getProperties().getClass().getName());
	}
}
