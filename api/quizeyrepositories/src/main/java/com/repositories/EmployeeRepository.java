package com.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.models.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
