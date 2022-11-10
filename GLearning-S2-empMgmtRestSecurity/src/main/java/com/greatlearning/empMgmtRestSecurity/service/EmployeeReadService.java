package com.greatlearning.empMgmtRestSecurity.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.empMgmtRestSecurity.entity.Employee;


public interface EmployeeReadService {

	List<Employee> getAllEmployees();

	List<Employee> getAllEmployeesWithThisFirstName(String firstName);

	Optional<Employee> getAnEmployeeById(Long id);

	List<Employee> getAllEmployeesCustomSortedByName(String order);

}