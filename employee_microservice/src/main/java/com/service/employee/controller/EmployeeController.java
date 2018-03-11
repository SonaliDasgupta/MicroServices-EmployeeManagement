package com.service.employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.employee.model.Employee;
import com.service.employee.repo.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping(method = RequestMethod.POST)
	public Employee create(@RequestBody Employee employee){
		
		Employee result = employeeRepository.save(employee);
		return result;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{employeeId}")
	public Optional<Employee> get(@PathVariable String employeeId){
		return employeeRepository.findById(employeeId);
	}
	
	
}
