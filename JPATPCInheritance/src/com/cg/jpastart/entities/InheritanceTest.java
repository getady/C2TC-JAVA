package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em= factory.createEntityManager();
		em.getTransaction().begin();
		
		
		//create 1 employee 
		Employee employee = new Employee();
		employee.setName("Ather");
		employee.setSalary(20000);
		em.persist(employee);
		
		//create 1 manager
		Manager manager = new Manager();
		manager.setName("Naveed");
		manager.setSalary(100000);
		manager.setDepartmentName("HR");
		em.persist(manager);
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database. ");
		
		em.close();
		factory.close();
		
		
		
	}
	

}


