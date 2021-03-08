package com.cg.ngoportal.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.ngoportal.exception.NoSuchEmployeeException;
import com.cg.ngoportal.model.DonationDistribution;
import com.cg.ngoportal.model.Employee;
import com.cg.ngoportal.model.NeedyPeople;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private boolean loggedIn = false;
	private EntityManagerFactory emf ;
	private EntityManager em;

	public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub
		
		emf = Persistence.createEntityManagerFactory("project");
		em = emf.createEntityManager();
		
		
		
	}

	@Override
	public int login(Employee employee) throws SQLException, NoSuchEmployeeException {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		Employee e = em.find(Employee.class, employee.getEmployeeId());
		if (employee.getUsername().equals(e.getUsername())) {
			if(employee.getPassword().equals(e.getPassword())) {
				loggedIn = true;
				return 1;
				
			}
		}
		else {
			throw new NoSuchEmployeeException();
		}
		
		
		
		return 0;
	}

	@Override
	public int createNeedyPerson(NeedyPeople person) {
		if (loggedIn) {
			// TODO Auto-generated method stub
			em.getTransaction().begin(); // to start inserting in the table
			em.persist(person); //to add object data in the table
			em.getTransaction().commit(); //to commit the table
			
			return 1;   
		}
		return 0;
	}

	@Override
	public int deleteNeedyPerson(NeedyPeople person) {
		// TODO Auto-generated method stub
		
		if (loggedIn) {
			em.getTransaction().begin();
			NeedyPeople npd = em.find(NeedyPeople.class, person.getNeedyPersonId());
			em.remove(npd);
			em.getTransaction().commit();
			return 1;
			
		}
		return 0;
	}

	@Override
	public NeedyPeople readNeedyPeopleById(int id) {
		// TODO Auto-generated method stub
		NeedyPeople np;
		if (loggedIn) {
			np = em.find(NeedyPeople.class, id);
			return np;
		}
		
		return null;
	}

	@Override
	public List<NeedyPeople> readNeedyPeopleByName(String name) {
		if (loggedIn) {
			// TODO Auto-generated method stub
			Query query = em.createQuery("Select n from NeedyPeople n where n.needyPersonName like name");
			List<NeedyPeople> list = query.getResultList();
			return list;
		}
		return null;
	}

	@Override
	public List<NeedyPeople> readAllNeedyPeople() {
		if (loggedIn) {
			// TODO Auto-generated method stub
			Query query = em.createNamedQuery("Select n from NeedyPeople n");
			List<NeedyPeople> list = query.getResultList();
			return list;
		}
		return null;
	}

	@Override
	public String helpNeedyPerson(DonationDistribution distribute) {
		if (loggedIn) {
			// TODO Auto-generated method stub
			em.getTransaction().begin();
			em.persist(distribute);
			em.getTransaction().commit();
			return "Distributed";
		}
		return null;
	}

}
