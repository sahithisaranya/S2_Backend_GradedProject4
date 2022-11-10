package com.greatlearning.empMgmtRestSecurity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="roles")
public class Role {
	 @Id
	    @Column(name = "roleid")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    
	 @Column(name="name")
	    private String name;
}
