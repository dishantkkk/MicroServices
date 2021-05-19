package com.dishant.department.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Entity
@Table(name="department")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long departmentId;
	
	@Column(name="department_name")
	private String departmentName;
	
	@Column(name="department_address")
	private String departmentAddress;
	
	@Column(name="department_code")
	private String departmentCode;
}
