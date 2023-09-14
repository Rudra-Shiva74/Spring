package com.annotationconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Myservice implements Service {

	@Override
	public void service() {
		System.out.println("My service");
	}
}
