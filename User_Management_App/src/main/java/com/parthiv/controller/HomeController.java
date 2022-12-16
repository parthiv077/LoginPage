package com.parthiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.parthiv.model.UserDtls;
import com.parthiv.service.UserService;
import com.parthiv.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@PostMapping("/createUser")
	public String createuser(@ModelAttribute UserDtls user)
	{
		System.out.println(user);
		UserDtls userDtls=userService.createUser(user);
		return "register";
	}
}
