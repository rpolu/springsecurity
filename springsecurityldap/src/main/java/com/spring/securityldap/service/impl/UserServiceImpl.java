package com.spring.securityldap.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.securityldap.dao.UserDao;
import com.spring.securityldap.dto.UserDto;
import com.spring.securityldap.model.User;
import com.spring.securityldap.service.UserService;

@Transactional
@Service(value = "userService")
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDao userDao;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public List<UserDto> findAll() {
		List<UserDto> users = new ArrayList<>();
		userDao.findAll().iterator().forEachRemaining(user -> users.add(user.toUserDto()));
		return users;
	}

	@Override
	public User findOne(long id) {
		return userDao.findById(id).get();
	}

}
