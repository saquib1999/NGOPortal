package com.cg.ngoportal.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
		EntityManager em = factory.createEntityManager();
		
		Employee e1 = new Employee(1, "abcd", null, null, null, "abcd", "abcd");
		em.getTransaction().begin();
		em.persist(e1);
		em.getTransaction().commit();
		System.out.println("created");
	
}
}
