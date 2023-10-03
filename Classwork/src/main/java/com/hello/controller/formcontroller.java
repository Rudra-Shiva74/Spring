package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hello.bean.Bean;

@Controller
public class formcontroller {

	@RequestMapping("/formabhi")
	public String name() {
		return "complexform.jsp";
	}

	@RequestMapping("/formfill")
	public String formfill(@ModelAttribute("per") Bean bean, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Some Error Occures");
		}
		System.out.println(bean);
		return "complexform.jsp";
	}
}
