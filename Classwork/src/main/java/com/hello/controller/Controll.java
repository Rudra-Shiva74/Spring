package com.hello.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.hello.service.Service;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@ComponentScan(basePackages = "com.classwork")
public class Controll {

	@RequestMapping("/")
	public String index() {
		return "input.jsp";
	}

	@RequestMapping("/Add")
	public ModelAndView Add(HttpServletRequest req) {
		int a = Integer.parseInt(req.getParameter("n1"));
		int b = Integer.parseInt(req.getParameter("n2"));

		Service lg = new Service();
		int sum = lg.Add(a, b);

		ModelAndView mv = new ModelAndView();
		mv.addObject("add", sum);
		mv.setViewName("output.jsp");
		return mv;
	}

	@RequestMapping("/google")
	public RedirectView google(@RequestParam("search") String search) {
		RedirectView rv = new RedirectView();
		rv.setUrl("https://www.google.com/search?q=" + search);
		return rv;
	}

}
