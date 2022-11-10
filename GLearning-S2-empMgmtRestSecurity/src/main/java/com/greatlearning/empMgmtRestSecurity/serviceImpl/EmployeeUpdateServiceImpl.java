package com.greatlearning.empMgmtRestSecurity.serviceImpl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.empMgmtRestSecurity.entity.Employee;
import com.greatlearning.empMgmtRestSecurity.repository.EmployeeRepository;
import com.greatlearning.empMgmtRestSecurity.service.EmployeeUpdateService;

@Service

public class EmployeeUpdateServiceImpl implements EmployeeUpdateService{

	@Autowired
	EmployeeRepository empUpdateRepository;

	@Override
	public String updateAnEmployee(long id, Employee theEmp) {
		Optional<Employee> updateEmployee=empUpdateRepository.findById(id);
		
		if(updateEmployee.isEmpty())
			return "Employee not found!";
		updateEmployee.get().setFirstname(theEmp.getFirstname());
		updateEmployee.get().setLastname(theEmp.getLastname());
		updateEmployee.get().setEmail(theEmp.getEmail());
		updateEmployee.get().setSalary(theEmp.getSalary());
		
		empUpdateRepository.save(updateEmployee.get());
		return "Employee details updated!";
	}

	

//public static final EmployeeUpdateService employeeUpdateService = null;
//	
//	
//	
}
