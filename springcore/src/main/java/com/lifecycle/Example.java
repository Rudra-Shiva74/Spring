package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String example;

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public Example(String example) {
		this.example = example;
	}

	public Example() {
	}

	@PostConstruct
	public void start() {
		System.out.println("Start the mehtod");
	}

	@PreDestroy
	public void end() {
		System.out.println("end the mehtod");
	}
}
