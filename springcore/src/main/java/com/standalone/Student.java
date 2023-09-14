package com.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private String Name;
	private List<String> Subject;
	private Map<String, String> course;
	private Set<String> Number;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Subject=" + Subject + ", course=" + course + ", Number=" + Number
				+ ", properties=" + properties + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<String> getSubject() {
		return Subject;
	}

	public void setSubject(List<String> subject) {
		Subject = subject;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	public Set<String> getNumber() {
		return Number;
	}

	public void setNumber(Set<String> number) {
		Number = number;
	}
}
