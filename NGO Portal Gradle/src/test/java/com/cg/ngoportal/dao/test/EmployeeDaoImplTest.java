package com.cg.ngoportal.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeDaoImplTest {
	
	private EntityManagerFactory emf;
	private EntityManager em;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("Project");
		em = emf.createEntityManager();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEmployeeDaoImpl() {
		fail("Not yet implemented");
	}

	@Test
	void testLogin() {
		fail("Not yet implemented");
	}

	@Test
	void testCreateNeedyPerson() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteNeedyPerson() {
		fail("Not yet implemented");
	}

	@Test
	void testReadNeedyPeopleById() {
		fail("Not yet implemented");
	}

	@Test
	void testReadNeedyPeopleByName() {
		fail("Not yet implemented");
	}

	@Test
	void testReadAllNeedyPeople() {
		fail("Not yet implemented");
	}

	@Test
	void testHelpNeedyPerson() {
		fail("Not yet implemented");
	}

}
