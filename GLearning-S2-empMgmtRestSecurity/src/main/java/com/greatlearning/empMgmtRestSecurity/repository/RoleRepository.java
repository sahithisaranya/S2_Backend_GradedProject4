package com.greatlearning.empMgmtRestSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.empMgmtRestSecurity.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
