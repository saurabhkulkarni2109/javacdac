package com.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeDAO;
import com.app.dao.EmployeeRepository;
import com.app.entity.Employee;


@Service
public class EmployeeServiceImp implements EmployeeService {
	
	/*
	 * @Autowired private EmployeeDAO employeeDAO;
	 */
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	
	@Override
	@Transactional
	public Employee findById(int theId) {
		Optional<Employee>o =employeeRepository.findById(theId);
		if(o.isEmpty()) {
			return null;
		}else {
			Employee e = o.get();
			return e;
		}
	}
	
	@Override
	@Transactional
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeRepository.save(theEmployee);
		
	}
	

	@Override
	@Transactional
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(theId);
	}
	

}
