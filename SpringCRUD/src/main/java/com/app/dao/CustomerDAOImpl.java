package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Customer;




@Repository
public class CustomerDAOImpl implements CustomerDAO {
//need to inject the session factory
	
	
	@Autowired
	private SessionFactory sessionFactory; 
	/*
	 * public CustomerDAOImpl(SessionFactory sessionFactory) { super();
	 * this.sessionFactory = sessionFactory; }
	 */
	
	@Override
	public List<Customer> getCustomer(){
		//get the current hibernate session
	Session currentSession = sessionFactory.getCurrentSession();
	//create query...sort by last name
	Query<Customer>query=currentSession.createQuery("from Customer order by lastName",Customer.class);
	List<Customer>customer =query.getResultList();
	//return the resukt
	return customer;
	}

	@Override

	public void saveCustomer(Customer theCustomer) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Customer theCustomer=currentSession.get(Customer.class, theId);
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Customer theCustomer=currentSession.get(Customer.class, theId);
		currentSession.delete(theCustomer);
		
	}



	
	
	
}
