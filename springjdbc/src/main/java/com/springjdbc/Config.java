package com.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/student");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
		
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource());
		return template;
		
	}
	
	@Bean("Student")
	public Student getStudent() {
		Student student = new Student(jdbcTemplate());
		return student;
		
	}
	
	
	/*
	 * @Bean("Address") public Address getAddress(){ Address address = new
	 * Address("Sonaichiwadi","Satara",415209); return address; }
	 */
	
	/*
	 * @Bean("Student") public Student getStudent() { Student student = new
	 * Student(101, "Rutik Kale", getAddress(), 22); return student; }
	 */
}
