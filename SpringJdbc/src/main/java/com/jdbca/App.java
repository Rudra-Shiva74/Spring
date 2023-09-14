package com.jdbca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbca/config.xml");
		StudentDao st = (StudentDao) context.getBean("edao");
		int status = st.saveStudent(new Student(89, "Abhishek", "ss"));
		if (status == 1) {
			System.out.println("Added");
		}
	}
}
