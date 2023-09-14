package com.annotationconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Yourservice implements Service {

	@Override
	public void service() {
		System.out.println("Your Service");
	}
}
