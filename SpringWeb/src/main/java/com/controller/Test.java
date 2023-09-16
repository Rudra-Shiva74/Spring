package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

	@RequestMapping("/index")
	public String name() {
		System.out.println("This is Abhishek Tiwari");
		return "index";
	}
}
