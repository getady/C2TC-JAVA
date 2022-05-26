package com.tns.placement.management.repository;


import javax.persistence.EntityManager;

import com.tns.placement.management.entities.College;



public class CollegeRepositoryImpl implements ICollegeRepository{

	private EntityManager entityManager;
	
	// Step 1: Start JPA LifeCycle
	public CollegeRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

//  Step 2: Implement methods ICollegeRepo
	@Override
	public College addCollege(College college) {
		entityManager.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		entityManager.merge(college);
		return college;
	}

	@Override
	public College deleteCollege(College college) {
		entityManager.remove(college);
		return college;
	}
	

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();	
	}

	@Override
	public College searchCollege(int id) {
		College college = entityManager.find(College.class, id);
		return college;
	}

	}
