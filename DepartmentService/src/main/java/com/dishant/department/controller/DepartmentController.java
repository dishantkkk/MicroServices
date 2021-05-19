package com.dishant.department.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dishant.department.entity.Department;
import com.dishant.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department)
	{
		log.info("Inside saveDepatment method of DepartmentController");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("find/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId)
	{
		log.info("Inside findDepatmentById method of DepartmentController");
		return departmentService.findDepartmentById(departmentId);
		
	}

}
