package com.maven.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  // to create a table
@Table(name="Doctor")

public class Student {
	
	@Id                  //without giving primary key ....we are giving id..
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	@Column(name="Learners_name",length=20,nullable = false,unique = true)
	
	
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
