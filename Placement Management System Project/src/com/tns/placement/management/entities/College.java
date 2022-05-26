package com.tns.placement.management.entities;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	@Id
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	private String collegeName;
	private String location;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="college")
	private Set<Student> students = new HashSet<>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy="college")
	private Set<Certificate> certificates = new HashSet<>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy="college")
	private Set<Placement> placements = new HashSet<>();
	
	
	// Generate Getters and Setters....
	public Set<Placement> getPlacements() {
		return placements;
	}
	public void setPlacements(Set<Placement> placements) {
		this.placements = placements;
	}
	public Set<Certificate> getCertificates() {
		return certificates;
	}
	public void setCertificates(Set<Certificate> certificates) {
		this.certificates = certificates;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void addStudent1(Student student) {
    	student.setCollege(this);
    	this.getStudents().add(student);
    }
    public void addCertificate1(Certificate certificate) {
    	certificate.setCollege(this);
    	this.getCertificates().add(certificate);
    }
    public void addPlacement1(Placement placement) {
    	placement.setCollege(this);
    	this.getPlacements().add(placement);
    }
	

}