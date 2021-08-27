package com.spring.MongoMicroService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.spring.MongoMicroService.model.Employees;

public interface EmployeesRepository extends MongoRepository<Employees, Integer> {
	

}
