package com.greatlearning.empMgmtRestSecurity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.empMgmtRestSecurity.entity.Employee;
import com.greatlearning.empMgmtRestSecurity.service.EmployeeReadService;


@RestController
@RequestMapping("/employeeReadService")
public class EmployeeReadController {

	@Autowired
	EmployeeReadService employeeReadService;
	
	@GetMapping("/getAnEmployeeById")
	public Optional<Employee> getAnEmployeeById(Long id) {
		return employeeReadService.getAnEmployeeById(id);
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeReadService.getAllEmployees();
	}
	
	@GetMapping("/getAllEmployeesWithThisFirstName")
	public List<Employee> getAllEmployeesWithThisFirstName(String firstname) {
		return employeeReadService.getAllEmployeesWithThisFirstName(firstname);
	}
	
	@GetMapping("/getAllEmployeesCustomSortedByName")
	public List<Employee> getAllEmployeesCustomSortedByName(String order) {
		
		return employeeReadService.getAllEmployeesCustomSortedByName(order);
	}
	
//	@GetMapping("/accessDeniedMessage")
//	public String accessDeniedMessage() {
//		return "Access to the page denied!";
//	}
	
}
