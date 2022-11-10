package com.greatlearning.empMgmtRestSecurity.service;

import java.util.List;

import com.greatlearning.empMgmtRestSecurity.entity.Employee;
import com.greatlearning.empMgmtRestSecurity.entity.Role;
import com.greatlearning.empMgmtRestSecurity.entity.User;



public interface EmployeeCreateService {

	String addAnEmployee(Employee emp);

	//String addAllEmployees(List<Employee> employees);

	Employee addEmployeeWithSaveAndFlush(Employee employee);
	
	public User saveUser(User user);
	public Role saveRole(Role role);

}