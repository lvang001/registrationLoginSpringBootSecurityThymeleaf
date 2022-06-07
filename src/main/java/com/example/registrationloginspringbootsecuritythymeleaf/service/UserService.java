package com.example.registrationloginspringbootsecuritythymeleaf.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.registrationloginspringbootsecuritythymeleaf.model.User;
import com.example.registrationloginspringbootsecuritythymeleaf.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save( UserRegistrationDto registrationDto);
}
