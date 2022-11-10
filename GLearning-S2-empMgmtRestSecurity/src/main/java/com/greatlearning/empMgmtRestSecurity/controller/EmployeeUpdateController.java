package com.greatlearning.empMgmtRestSecurity.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.empMgmtRestSecurity.entity.Employee;
import com.greatlearning.empMgmtRestSecurity.service.EmployeeUpdateService;

@RestController
@RequestMapping("/employeeupdateService")
public class EmployeeUpdateController {

	@Autowired
	EmployeeUpdateService employeeUpdateService;
	
	@PutMapping("/updateAnEmployee")
	public String updateAnEmployee(Long id,@RequestBody Employee theEmployee) {

		return employeeUpdateService.updateAnEmployee(id, theEmployee);

	}
	
}
