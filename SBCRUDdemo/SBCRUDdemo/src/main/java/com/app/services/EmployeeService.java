package com.app.services;

import java.util.List;

import com.app.entity.Employee;

public interface EmployeeService {
	public void save(Employee theEmployee);
	public List<Employee>findAll();
	public Employee findById(int theId);
	public void deleteById(int theId);
}
