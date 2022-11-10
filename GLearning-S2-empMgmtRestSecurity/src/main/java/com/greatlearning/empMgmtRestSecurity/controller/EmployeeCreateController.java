package com.greatlearning.empMgmtRestSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.empMgmtRestSecurity.entity.Employee;
import com.greatlearning.empMgmtRestSecurity.entity.Role;
import com.greatlearning.empMgmtRestSecurity.entity.User;
import com.greatlearning.empMgmtRestSecurity.service.EmployeeCreateService;



@RestController
@RequestMapping("/employeeCreateService")
public class EmployeeCreateController {

	@Autowired
	EmployeeCreateService createService;
	
	@PostMapping("/addAnEmployee")
	public String addAnEmployee(Employee employee) {
		return createService.addAnEmployee(employee);
	}
	
//	@PostMapping("/addListOfEmployees")
//	public String addListOfEmployees(@RequestBody List<Employee> employees) {
//		return createService.addAllEmployees(employees);
//	}
	
	@PostMapping("/addEmployeeWithSaveAndFlush")
	public Employee addEmployeeWithSaveAndFlush(Employee employee) {
		return createService.addEmployeeWithSaveAndFlush(employee);
	}
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user){
		return createService.saveUser(user);
	}
	
	@PostMapping("/role")
	public Role saveRole(@RequestBody Role role) {
		return createService.saveRole(role);
	}
}
