package com.classwork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public Addess addess() {
		return new Addess();
	}

	@Bean
	public Home home() {
		return new Home();
	}
}
