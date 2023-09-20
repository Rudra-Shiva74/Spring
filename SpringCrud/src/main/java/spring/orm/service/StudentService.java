package spring.orm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.orm.dao.StudentDao;
import spring.orm.dao.Studentinterface;
import spring.orm.entity.Student;

@Service
public class StudentService {
	@Autowired
	private Studentinterface studentinterface;

	public int createStudent(Student st) {
		int i = this.studentinterface.insert(st);
		return i;
	}

	public int deleteUser(int i) {
		int rs = this.studentinterface.delete(i);
		return rs;
	}

	public List<Student> getStudent() {
		return studentinterface.AllStudent();
	}

	public Student getoneStudent(int i) {
		return studentinterface.getStudent(i);
	}

	public int update(Student student) {
		this.studentinterface.Update(student);
		return student.getId();
	}
}
