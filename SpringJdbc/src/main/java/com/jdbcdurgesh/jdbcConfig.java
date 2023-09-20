package com.jdbcdurgesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jdbcdurgesh.Dao.StudentDao;

@Configuration
public class jdbcConfig {

	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/youtube");
		ds.setUsername("root");
		ds.setPassword("ShivaRudra@7488");
		return ds;
	}

	@Bean("jdbcTemplate")
	public JdbcTemplate geTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

	@Bean("studentdao")
	public StudentDao getStudentDao() {
		StudentDao studentDao = new StudentDao();
		studentDao.setJdbcTemplate(geTemplate());
		return studentDao;
	}
}
