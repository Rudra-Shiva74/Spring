package com.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("Abhishek Tiwari")
	private String Name;
	@Value("Rampur")
	private String Home;
	@Value("#{value}")
	private List<String> Number;

	public List<String> getNumber() {
		return Number;
	}

	public void setNumber(List<String> number) {
		Number = number;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Home=" + Home + ", Number=" + Number + "]";
	}

	public String getHome() {
		return Home;
	}

	public void setHome(String home) {
		Home = home;
	}
}
