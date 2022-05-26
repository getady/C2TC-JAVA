package com.tns.placement.management.service;

import com.tns.placement.management.entities.Student;
import com.tns.placement.management.repository.IStudentRepository;
import com.tns.placement.management.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements IStudentService{

	private IStudentRepository dao;

//	Step 1: Call the IStudentRepository or dao 
	public StudentServiceImpl() {
	dao = new StudentRepositoryImpl();	
    }

	
//  Step 2: Implement methods IStudentRepo
	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTranscation();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTranscation();
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
	Student student = dao.searchStudentById(id);
		return student;
	}


	@Override
	public Student deleteStudent(Student student) {
	dao.beginTransaction();
	dao.deleteStudent(student);
	dao.commitTranscation();
    return student;
	}

	

}

