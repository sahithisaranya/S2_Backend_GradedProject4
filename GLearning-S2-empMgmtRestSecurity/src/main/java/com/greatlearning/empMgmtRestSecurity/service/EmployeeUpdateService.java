package com.greatlearning.empMgmtRestSecurity.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.greatlearning.empMgmtRestSecurity.entity.Employee;

public interface EmployeeUpdateService {
	String updateAnEmployee(@PathVariable long id,@RequestBody Employee theEmp);
}
