package com.greatlearning.empMgmtRestSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.empMgmtRestSecurity.entity.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
