package spring.orm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import spring.orm.entity.Student;

@Repository
public interface Studentinterface {
	public int insert(Student st);

	public int delete(int i);

	public List<Student> AllStudent();

	public Student getStudent(int i);

	public void Update(Student student);

	public Student getoneLogin(Student student);

}
