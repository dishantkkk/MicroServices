package com.dishant.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dishant.user.entity.User;
import com.dishant.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

import com.dishant.user.VO.Department;
import com.dishant.user.VO.ResponseTemplate;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside saveUser of UserService");
		return userRepository.save(user);
	}

	public ResponseTemplate getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment of UserService");
		ResponseTemplate vo = new ResponseTemplate();
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/find/" + user.getDepartmentId(), Department.class);
		vo.setUser(user); 
		vo.setDepartment(department);
		return vo;

	}
}
