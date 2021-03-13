package com.heytusar.trymongo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heytusar.trymongo.exception.ResourceNotFoundException;
import com.heytusar.trymongo.model.Employee;
import com.heytusar.trymongo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);
	
    private EmployeeRepository employeeRepository;
    
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
    	this.employeeRepository = employeeRepository;
    }
	
    public List <Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    public Employee findById(Long employeeId) throws ResourceNotFoundException {
    	Employee employee = employeeRepository.findById(employeeId)
    			.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		;
		return employee;
    }
    
    public Employee save(Employee employee) {
    	log.info("employee --------------------------------> " + employee);
    	employeeRepository.save(employee);
    	return employee;
    }
    
    public void delete(Employee employee) {
    	employeeRepository.delete(employee);
    }
}
