package com.rahul.springboot.crud.springbootcrudapi.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rahul.springboot.crud.springbootcrudapi.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;



@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
    public List<Employee> get() {
        
        return entityManager.createQuery("from Employee", Employee.class).getResultList();
    }

	

	@Override
	public void save(Employee employee) {
		entityManager.merge(employee);
		
	}

	@Override
	public void delete(int id) {
		Employee employee= entityManager.find(Employee.class, id);
		entityManager.remove(employee);
		
	}

	@Override
	public Employee get(int id) {
		return entityManager.find(Employee.class, id);
	}

}
