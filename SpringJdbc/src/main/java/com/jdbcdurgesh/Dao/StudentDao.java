package com.jdbcdurgesh.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jdbcdurgesh.entity.Student;

public class StudentDao implements Studentinterface {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student st) {
		String query = "insert into student(name,city) values(?,?)";
		int rs = this.jdbcTemplate.update(query, st.getName(), st.getCity());
		return rs;
	}

	public int update(Student st) {
		String query = "update student set name=?,city=? where id=?";
		int rs = this.jdbcTemplate.update(query, st.getName(), st.getCity(), st.getId());
		return rs;
	}

	public int delete(int st) {
		String query = "delete from student where id=?";
		int rs = this.jdbcTemplate.update(query, st);
		return rs;
	}

	public Student getStudent(int st) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMap();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, st);
		return student;
	}

	public List<Student> getAllstudent() {
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMap());
		return students;
	}

}
