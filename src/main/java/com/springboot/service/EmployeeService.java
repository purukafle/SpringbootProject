package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.model.Employee;

@Service
public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	
		
	}


