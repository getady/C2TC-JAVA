package com.tns.placement.management.service;

import com.tns.placement.management.entities.Student;

public interface IStudentService {
	
	public Student addStudent(Student student);    //create
	public Student updateStudent(Student student);   //update
	public Student searchStudentById(int id);         //Retrieval
	public Student deleteStudent(Student student);    //Delete

}
