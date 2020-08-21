package com.todoapp_project.todoapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.todoapp_project.todoapp.dto.UserRegistrationDto;
import com.todoapp_project.todoapp.entity.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
