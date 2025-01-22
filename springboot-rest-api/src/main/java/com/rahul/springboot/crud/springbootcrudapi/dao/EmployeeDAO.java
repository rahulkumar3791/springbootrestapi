package com.rahul.springboot.crud.springbootcrudapi.dao;

import java.util.List;

import com.rahul.springboot.crud.springbootcrudapi.model.Employee;

public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);

}
