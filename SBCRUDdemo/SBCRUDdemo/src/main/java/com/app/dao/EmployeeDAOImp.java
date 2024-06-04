package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.Employee;

import jakarta.persistence.EntityManager;


@Repository
public class EmployeeDAOImp implements EmployeeDAO {

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * @Autowired private EntityManager entityManager;
	 * 
	 * @Override public void save(Employee theEmployee) { // TODO Auto-generated
	 * method stub Employee dbEmployee =entityManager.merge(theEmployee);
	 * theEmployee.setId(dbEmployee.getId()); }
	 */
	/*
	 * @Autowired public EmployeeDAOImp(EntityManager entityManager) { super();
	 * this.entityManager = entityManager; }
	 * 
	 * @Override public List<Employee> findAll() { //create a query Query theQuery =
	 * entityManager.createQuery(null); //get the result List List<Employee>
	 * employees = theQuery.getResultList(); return employees; }
	 */

	/*
	 * @Override public Employee findById(int theId) { //get Employee Employee
	 * theEmployee = entityManager.find(Employee.class, theId); return theEmployee;
	 * }
	 * 
	 * @Override public void save(Employee theEmployee) { //save or update the
	 * employee Employee dbEmployee = entityManager.merge(theEmployee); //if id==0
	 * then save/insert else update //update with id from db....so we can get
	 * generated id for save and insert theEmployee.setId(dbEmployee.getId());
	 * 
	 * }
	 */

	/*
	 * @Override public void deleteById(int theId) { // TODO Auto-generated method
	 * stub Query theQuery =
	 * entityManager.createQuery("delete from Employee where id = :employeeId");
	 * theQuery.setParameter("employeeId", theId); theQuery.executeUpdate(); }
	 */
}
