package com.greatlearning.empMgmtRestSecurity.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.greatlearning.empMgmtRestSecurity.entity.Employee;
import com.greatlearning.empMgmtRestSecurity.entity.Role;
import com.greatlearning.empMgmtRestSecurity.entity.User;
import com.greatlearning.empMgmtRestSecurity.repository.EmployeeRepository;
import com.greatlearning.empMgmtRestSecurity.repository.RoleRepository;
import com.greatlearning.empMgmtRestSecurity.repository.UserRepository;
import com.greatlearning.empMgmtRestSecurity.service.EmployeeCreateService;



@Service
public class EmployeeCreateServiceImpl implements EmployeeCreateService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	BCryptPasswordEncoder bcryptEncoder;

	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		bcryptEncoder.encode(user.getPassword());
		return userRepository.save(user);
	}

	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}
	
	@Override
	public String addAnEmployee(Employee emp) {
		employeeRepository.save(emp);
		employeeRepository.flush();
		return "Employee added successfully!";
	}

//	@Override
//	public String addAllEmployees(List<Employee> employees) {
//		employeeRepository.saveAll(employees);
//		employeeRepository.flush();
//		return "Employees saved successfully";
//		
//	}

	@Override
	public Employee addEmployeeWithSaveAndFlush(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}


//	
//	@Override
//	public String addAnEmployee(Employee emp) {
//		employeeRepository.save(emp);
//		employeeRepository.flush();
//		return "Employee added successfully!";
//	}
//	
//	@Override
//	public String addAllEmployees(List<Employee> employees) {
//		employeeRepository.saveAll(employees);
//		employeeRepository.flush();
//		return "List of employees added successfully!";
//	}
//	
//	@Override
//	public Employee addEmployeeWithSaveAndFlush(Employee employee) {
//		return employeeRepository.saveAndFlush(employee);
//	}
	
	
}
