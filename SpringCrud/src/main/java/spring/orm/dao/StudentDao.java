package spring.orm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import spring.orm.entity.Student;

@Component
public class StudentDao implements Studentinterface {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student st) {
		Integer i = (Integer) this.hibernateTemplate.save(st);
		return i;
	}

	@Transactional
	public int delete(int i) {
		Student st = this.hibernateTemplate.get(Student.class, i);
		this.hibernateTemplate.delete(st);
		return i;
	}

	public List<Student> AllStudent() {
		List<Student> student = new ArrayList<Student>();
		student = this.hibernateTemplate.loadAll(Student.class);
		return student;
	}

	public Student getStudent(int i) {
		Student st = this.hibernateTemplate.get(Student.class, i);
		return st;
	}

	@Transactional
	public void Update(Student student) {
		Student st = this.hibernateTemplate.get(Student.class, student.getId());
		st.setName(student.getName());
		st.setGender(student.getGender());
		st.setEmail(student.getEmail());
		st.setState(student.getState());
		st.setState(student.getState());
		this.hibernateTemplate.update(st);
	}

}
