package com.spring.securityldap.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.securityldap.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
}
