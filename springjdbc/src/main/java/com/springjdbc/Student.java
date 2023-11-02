package com.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class Student {

	/*
	 * private int id; private String name; private Address address; private int
	 * age;
	 */
	
	/*
	 * public Student(int id, String name, Address address, int age) { super();
	 * this.id = id; this.name = name; this.address = address; this.age = age; }
	 */

	/*
	 * public Student() { super(); // TODO Auto-generated constructor stub }
	 * 
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public Address getAddress() { return address; }
	 * 
	 * public void setAddress(Address address) { this.address = address; }
	 * 
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 * 
	 * @Override public String toString() { return "Student [id=" + id + ", name=" +
	 * name + ", address=" + address + ", age=" + age + "]"; }
	 */
	
	private JdbcTemplate jdbcTemplate;

	public Student(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	void insertData() {
		String sql = "insert into info(id, name, address, age) values(?,?,?,?)";
		int i =jdbcTemplate.update(sql,101,"Rutik","Karad",21);
		System.out.println(i +"record is inserted......");
	}
	
	
	
}
