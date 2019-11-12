package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Login;
import com.example.demo.repository.LoginRepository;

public class LoginService {
	@Autowired
	private LoginRepository loginRepository;

	public Login createUser(Login login) {
		return loginRepository.save(login);
	}

}
