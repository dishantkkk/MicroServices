package com.dishant.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dishant.user.entity.User;
import com.dishant.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

import com.dishant.user.VO.ResponseTemplate;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Inside saveUser of UserController");
		return userService.saveUser(user);
	}

	@GetMapping("/{id}")
	public ResponseTemplate getUserWithDepartment(@PathVariable("id") Long userId) {
		log.info("Inside getUserWithDepartment of UserController");
		return userService.getUserWithDepartment(userId);
	}

}
