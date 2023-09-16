package com.jdbca;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String saveStudent(Student s) {
		String query = "insert into student values( " + s.getId() + ",'" + s.getName() + "','" + s.getCity() + "')";
		jdbcTemplate.update(query);
		return "Save Student";

	}

	public String updateStudent(Student s) {
		String query = "update student set name='" + s.getName() + "',city='" + s.getCity() + "' where id='" + s.getId()
				+ "' ";
		jdbcTemplate.update(query);
		return "Update Student";
	}

	public String deleteStudent(Student s) {
		String query = "delete  from student where id='" + s.getId() + "' ";
		jdbcTemplate.update(query);
		return "Delete Student";
	}
}
