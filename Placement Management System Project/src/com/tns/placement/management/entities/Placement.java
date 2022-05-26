package com.tns.placement.management.entities;


import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="placement")
public class Placement implements Serializable {
      
	private static final long serialVersionUID=1L;
      
    @Id
  	private int id;
    private String name;
    @ManyToOne
	@JoinColumn(name = "college_id")
    private College college;
    private LocalDate date;
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
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}    
}
