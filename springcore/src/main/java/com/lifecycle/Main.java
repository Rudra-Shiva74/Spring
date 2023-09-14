package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/config.xml");

//		Samosa sm = context.getBean(Samosa.class);
//		System.out.println(sm.toString());
//
//		Pepsi ps = context.getBean(Pepsi.class);
//		System.out.println(ps.toString());

		Example ex = context.getBean(Example.class);
		System.out.println(ex.getExample());
		context.registerShutdownHook();
	}
}
