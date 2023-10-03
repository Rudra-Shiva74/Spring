package spring.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.orm.entity.Student;
import spring.orm.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/home")
	public String home() {
		return "redirect:/";
	}

	@RequestMapping(path = "/handler", method = RequestMethod.POST)
	public String handler(Student student) {
		try {
			studentService.createStudent(student);
			return "redirect:/loginform";
		} catch (Exception e) {
			return "redirect:/";
		}
	}

	@GetMapping("/viewstudent")
	public ModelAndView viewstudent() {
		List<Student> students = this.studentService.getStudent();
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", students);
		mv.setViewName("viewstudent");
		return mv;
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		System.out.println(id);
		this.studentService.deleteUser(id);
		return "redirect:/viewstudent";
	}

	@RequestMapping("/edit")
	public ModelAndView viewonestudent(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView();
		Student st = this.studentService.getoneStudent(id);
		mv.addObject("student", st);
		mv.setViewName("editStudent");
		return mv;
	}

	@RequestMapping("/update")
	public String update(Student student) {
		System.out.println(student.toString());
		this.studentService.update(student);
		return "profile";
	}

	@RequestMapping("/loginform")
	public String loginpage() {
		return "Login";
	}

	@RequestMapping("/Login")
	public ModelAndView Login(Student student) {
		Student st = this.studentService.getoneLogin(student);
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", st);
		mv.setViewName("profile");
		return mv;
	}
}
