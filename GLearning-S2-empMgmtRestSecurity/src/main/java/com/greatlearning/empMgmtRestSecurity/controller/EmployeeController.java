package com.greatlearning.empMgmtRestSecurity.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.empMgmtRestSecurity.entity.Role;
import com.greatlearning.empMgmtRestSecurity.entity.User;

@RestController
@RequestMapping("/")
public class EmployeeController{
	@GetMapping("/")
	public String getIntro() {
		return "Hello Employee!"; 
	}
}
