package com.service.employee.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.service.employee.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
