package com.annotationconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);

		Service service = context.getBean(Service.class);
		service.service();
		context.close();
	}
}
