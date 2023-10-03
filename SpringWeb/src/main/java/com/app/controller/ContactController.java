package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}

	@ModelAttribute
	public void DataforModel(Model model) {
		model.addAttribute("tittle2", "This is Abhishek Tiwari");
		model.addAttribute("tittle", "Hello Everyone my name is Abhishek Tiwari");
	}
	
}
