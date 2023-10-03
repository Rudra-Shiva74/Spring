package com.app.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.app.entity.User;
import com.app.service.UserService;
import com.oracle.wls.shaded.org.apache.xalan.lib.Redirect;

import jakarta.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/hello")
public class Controll {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void DataforModel(Model model) {
		model.addAttribute("tittle2", "This is Abhishek Tiwari");
		model.addAttribute("tittle", "Hello Everyone my name is Abhishek Tiwari");
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String name(Model model) {
		model.addAttribute("name", "Abhi Tiwari");
		model.addAttribute("number", 7488048);
		List<String> name = new ArrayList<String>();
		name.add("Abhishek Rampur");
		name.add("Rudransh Tiwari");
		name.add("Shivansh Tiwari");
		model.addAttribute("list", name);
		return "index";
	}

	@RequestMapping("/about")
	public ModelAndView about(HttpServletRequest req) {
		String name = req.getParameter("name");
		String number = req.getParameter("number");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		List<String> ls = new ArrayList<String>();
		ls.add(name);
		ls.add(number);
		ls.add(city);
		ls.add(state);

		ModelAndView mv = new ModelAndView();
		LocalDateTime time = LocalDateTime.now();
		mv.addObject("name", "Abhishek Tiwari");
		mv.addObject("time", time);
		mv.addObject("student", ls);
		mv.setViewName("about");
		return mv;
	}

//	@RequestMapping("/handler")
//	public String handler(@RequestParam(name = "name", defaultValue = "Shivansh Tiwari") String name,
//			@RequestParam("number") String number, @RequestParam("city") String city,
//			@RequestParam("state") String state, Model model, User user) {
//		User user2 = new User();
//		user2.setName(name);
//		user2.setNumber(number);
//		user2.setCity(city);
//		user2.setState(state);
//		System.out.println(user2);
//		System.out.println(user);
//		model.addAttribute("name", name);
//		model.addAttribute("user", user2);
//		return "about";
//	}

	@RequestMapping("/handler")
	public String handler(@ModelAttribute User user) {
		this.userService.createUser(user);
		return "about";
	}

	@RequestMapping("/one")
	public RedirectView one() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("http://www.google.com");
		return redirectView;
	}
}
