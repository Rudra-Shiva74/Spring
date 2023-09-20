package com.jdbcdurgesh.Dao;

import java.util.List;

import com.jdbcdurgesh.entity.Student;

public interface Studentinterface {
	public int insert(Student student);

	public int update(Student student);

	public int delete(int st);

	public Student getStudent(int st);

	public List<Student> getAllstudent();

}
