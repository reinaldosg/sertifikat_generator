package com.learn.spring.certificate.gen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@RequestMapping(value = "/login-user", method = RequestMethod.GET)
	public String LoginUser() {return "User/LoginUser";}

	@RequestMapping(value = "/login-user", method = RequestMethod.POST)
	public String LoginUserCheck(Model model, String error, String logout) {

		if (error != null) {
			model.addAttribute("errorMsg", "Your username and password are invalid.");
			return "User/LoginUser";
		}

		if (logout != null) {
			model.addAttribute("msg", "You have been logged out successfully.");
			return "User/LoginUser";
		}

		return "Header/welcome-page";
	}
}
