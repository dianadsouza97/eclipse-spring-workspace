package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Login;

@RestController("/api")
public class LoginController {
	@Autowired
	private LoginService loginService;
	@RequestMapping("/login")
	public Login createUser(@RequestBody Login login) {
		return loginService.createUser(login);
	}
}
