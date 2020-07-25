package com.learn.spring.certificate.gen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginRegisterController {
	
	@RequestMapping(value = "/register-user")
	public String RegisterUser() {
		return "User/RegisterUser";
	}
	
	@RequestMapping(value = "/save-user/{}", method = RequestMethod.POST)
	public String SaveNewUser() {
		return "";
	}
	
	@RequestMapping(value = "/login-user")
	public String LoginUser() {
		return "User/LoginUser";
	}
}
