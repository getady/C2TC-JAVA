package com.tns.placement.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity							// marks this class as an entity.
@Table(name = "placement")		// @Table for mentioning the table in database....

public class Placement implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id							//default access strategy that Hibernate will use for the mapping.
	private int id;
	private String name;
	private String college;
	private String date;
	private String qualification;
	private int year;
	

	// Generate Getters and Setters....
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


	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String string) {
		this.date = string;
	}

	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
