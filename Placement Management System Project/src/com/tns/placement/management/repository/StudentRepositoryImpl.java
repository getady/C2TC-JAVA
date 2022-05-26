package com.tns.placement.management.repository;


import javax.persistence.EntityManager;

import com.tns.placement.management.entities.Student;


public class StudentRepositoryImpl implements IStudentRepository {

	private EntityManager entityManager;
	
	// Step 1: Start JPA LifeCycle
	public StudentRepositoryImpl()   
    {
		entityManager=JPAUtil. getEntityManager();
	}

//  Step 2: Implement methods IStudentRepo
	@Override
	public Student addStudent(Student student) {
		entityManager.persist(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		entityManager.merge(student);
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student=entityManager.find(Student.class,id);
		return student;
	}


	@Override
	public Student deleteStudent(Student student) {
		entityManager.remove(student);
		return student;
	}


	@Override
	public void commitTranscation() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
}