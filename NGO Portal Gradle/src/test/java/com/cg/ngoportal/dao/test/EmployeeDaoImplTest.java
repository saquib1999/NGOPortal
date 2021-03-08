package com.cg.ngoportal.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.ngoportal.dao.EmployeeDaoImpl;
import com.cg.ngoportal.exception.NoSuchEmployeeException;
import com.cg.ngoportal.model.Employee;

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
	emf = Persistence.createEntityManagerFactory("Project");
	em = emf.createEntityManager();
	Employee e1 = new Employee(1, null, null, null, null, "abcd", "abcd");
	EmployeeDaoImpl ed = new EmployeeDaoImpl();
	try {
		assertEquals(1, ed.login(e1));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchEmployeeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
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
