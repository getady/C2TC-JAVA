package com.tnsif.singleinh;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestInheritance {

	public static void main(String[] args) 
	{
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fac.createEntityManager();
		em.getTransaction().begin();
		
		//create 1 emp
		EMP emp = new EMP();
		emp.setEmpname("Ab");
		emp.setSalary(20000);
		em.persist(emp);
		
		
		//create 1 mgr
		Manager mgr = new Manager();
		mgr.setEmpname("Ady");
		mgr.setSalary(800000);
		mgr.setDeptname("Tech");
		em.persist(mgr);
		
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one emp and mgr.....");
		
		
		em.close();
		fac.close();
		
		
		
		
	}

}
