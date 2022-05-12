package com.tnsif.onetoone.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args)
	{
       EntityManagerFactory fac=Persistence.createEntityManagerFactory("JPA-PU");
       EntityManager em=fac.createEntityManager();
       em.getTransaction().begin();

       Student stud=new Student();
       stud.setSname("ady ikhlass");
       Address add=new Address();
       add.setDno(143);
       add.setStreet("BMRE CORNER");
       add.setCity("Hyderabad");
       add.setPincode(500001);
       
       stud.setAddress_id(add);
       
       em.persist(stud);
       
       System.out.println("Data inserted in database.............");
       
       em.getTransaction().commit();
       
       em.close();
       fac.close();
	}

}


