package com.greatlearning.empMgmtRestSecurity.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.greatlearning.empMgmtRestSecurity.entity.Employee;
import com.greatlearning.empMgmtRestSecurity.repository.EmployeeRepository;
import com.greatlearning.empMgmtRestSecurity.service.EmployeeReadService;


@Service
public class EmployeeReadServiceImpl implements EmployeeReadService {
	@Autowired
	EmployeeRepository readEmpRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return readEmpRepository.findAll();
		
	}
	
	@Override
	public List<Employee> getAllEmployeesWithThisFirstName(String firstname) {
		Employee employeeWithFirstName=new Employee();
		employeeWithFirstName.setFirstname(firstname);
		ExampleMatcher exampleMatcher=ExampleMatcher.matching().withMatcher("firstname", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id","lastname","email","salary");
		Example<Employee> example=Example.of(employeeWithFirstName,exampleMatcher);
		return readEmpRepository.findAll(example);
		
	}
	
	@Override
	public Optional<Employee> getAnEmployeeById(Long id) {
		return readEmpRepository.findById(id);
	}
	
	@Override
	public List<Employee> getAllEmployeesCustomSortedByName(String order){
		if(order.toLowerCase().compareTo("desc")==0)
			return readEmpRepository.findAll(Sort.by(Direction.DESC,"firstname"));
		return readEmpRepository.findAll(Sort.by(Direction.ASC,"firstname"));
	}
}
