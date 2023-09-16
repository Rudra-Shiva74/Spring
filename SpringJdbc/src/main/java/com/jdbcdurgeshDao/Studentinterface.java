package com.jdbcdurgeshDao;

import java.util.List;

import com.jdbcdurgeshentity.Student;

public interface Studentinterface {
	public int insert(Student student);

	public int update(Student student);

	public int delete(int st);

	public Student getStudent(int st);

	public List<Student> getAllstudent();

}
