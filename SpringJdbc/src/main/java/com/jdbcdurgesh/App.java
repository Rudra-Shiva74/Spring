package com.jdbcdurgesh;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbcdurgeshDao.Studentinterface;
import com.jdbcdurgeshentity.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbcdurgesh/config.xml");
		Studentinterface studentDao = context.getBean(Studentinterface.class);

//		int s = studentDao.insert(new Student("Abhishek Tiwari", "Kochas"));
//		Student st = studentDao.getStudent(2);
		List<Student> st = studentDao.getAllstudent();
		for (Student s : st) {
			System.out.println(s);
		}
		System.out.println(st);
	}
}
