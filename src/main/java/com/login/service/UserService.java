package com.login.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.login.dao.UserRegistrationDto;
import com.login.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
