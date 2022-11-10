package com.greatlearning.empMgmtRestSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.empMgmtRestSecurity.service.EmployeeDeleteService;



@RestController
@RequestMapping("/employeeDeleteService")
public class EmployeeDeleteController {
	
	@Autowired
	EmployeeDeleteService employeeDeleteService;
	
	@DeleteMapping("/deleteAnEmployeeById")
	public String deleteAnEmployeeById(Long id) {
		return employeeDeleteService.deleteAnEmployeeById(id);
	}
	
}
