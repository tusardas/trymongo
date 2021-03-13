package com.heytusar.trymongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.heytusar.trymongo.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
