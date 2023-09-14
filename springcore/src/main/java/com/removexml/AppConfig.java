package com.removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Student getStudent() {
		return new Student(getPerson());
	}

	@Bean
	public Person getPerson() {
		return new Person();
	}
}
