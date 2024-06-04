package com.app.dao;

import java.util.List;

import com.app.entity.Employee;

public interface EmployeeDAO {

	public void save(Employee theEmployee);
	public List<Employee>findAll();
	public Employee findById(int theId);
	public void deleteById(int theId);
	
}
