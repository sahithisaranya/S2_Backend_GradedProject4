package com.greatlearning.empMgmtRestSecurity.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.empMgmtRestSecurity.repository.EmployeeRepository;
import com.greatlearning.empMgmtRestSecurity.service.EmployeeDeleteService;



@Service
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public String deleteAnEmployeeById(Long id) {
		employeeRepository.deleteById(id);
		return "Employee with id: "+id+" is deleted";
	}
}
