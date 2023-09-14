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

	public int saveStudent(Student s) {
		String query = "insert into student values( " + s.getId() + ",'" + s.getName() + "','" + s.getCity() + "')";
		return jdbcTemplate.update(query);

	}

	public int updateStudent(Student s) {
		String query = "update student set name='" + s.getName() + "',city='" + s.getCity() + "' where id='" + s.getId()
				+ "' ";
		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(Student s) {
		String query = "delete from s where id='" + s.getId() + "' ";
		return jdbcTemplate.update(query);
	}
}
