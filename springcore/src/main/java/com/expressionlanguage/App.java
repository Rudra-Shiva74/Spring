package com.expressionlanguage;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/expressionlanguage/config.xml");
		Variable var = context.getBean(Variable.class);
		System.out.println(var);

	}
}
