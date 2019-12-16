package com.spring.securityldap.service;

import java.util.List;

import com.spring.securityldap.dto.UserDto;
import com.spring.securityldap.model.User;

public interface UserService {

	List<UserDto> findAll();

	User findOne(long id);
}
