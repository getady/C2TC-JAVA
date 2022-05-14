package com.tnsif.onetomany.entites;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create a new department
		Department department = new Department();
		department.setId(21);
		department.setName("Java Developer");
		
		Department department1 = new Department();
		department1.setId(22);
		department1.setName("ML");
		
		//create two instances of employees
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("Ady");
		e1.setSalary(60000);
		
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("Aleef");
		e2.setSalary(50000);
		
		//add both employees to department
		//Association happened here emp to dept
		
		department.addEmployee(e1);
		department1.addEmployee(e2);
		
		
		//save department and its employees using entity manager
		
		em.persist(department);
		em.persist(department1);
		
		System.out.println("Added department along with two employees to database.");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}