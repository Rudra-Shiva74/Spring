package spring.orm.dao;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import spring.orm.entity.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Student st) {
		Integer i = (Integer) this.hibernateTemplate.save(st);
		return i;
	}

	@Transactional
	public void update(Student st) {
		this.hibernateTemplate.update(st);
	}

	@Transactional
	public int delete(int i) {
		Student s = this.hibernateTemplate.get(Student.class, i);
		this.hibernateTemplate.delete(s);
		return i;
	}

	@Transactional
	public Student show(int i) {
		Student s = this.hibernateTemplate.get(Student.class, i);
		return s;
	}

	@Transactional
	public List<Student> showAll(Student st) {
		List<Student> s = this.hibernateTemplate.loadAll(Student.class);
		for (Student c : s) {
			System.out.println(c);
		}
		return s;
	}

}
