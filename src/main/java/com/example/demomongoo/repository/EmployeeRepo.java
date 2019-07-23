package com.example.demomongoo.repository;

import com.example.demomongoo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee,String> {
}
