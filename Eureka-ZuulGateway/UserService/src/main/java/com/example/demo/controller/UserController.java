package com.example.demo.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class UserController {
	@LoadBalanced
    @RequestMapping(value = "/getPublicAddress", method = RequestMethod.GET)

	public String Display() {
		return "Welcome User";
	}
}
