package com.dishant.user.VO;

import com.dishant.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Wrapping both user and Department
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {
	private User user;
	private Department department;

}
