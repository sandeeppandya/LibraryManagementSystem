package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {

	@GetMapping("/")
	public String homePage()
	{
		return "home";
	}
	
	@GetMapping("/register")
	public String doRegister()
	{
		return "register";
	}
	
	@GetMapping("/users")
	public String getUserList()
	{
		return "userList";
	}
	
	@ResponseBody
	@GetMapping("/adminApi")
	public String getOnlyAdminApi()
	{
		return "This is ADMIN API";
	}
	
	@ResponseBody
	@GetMapping("/adminUserApi")
	public String getUserAdminApi()
	{
		return "This is ADMIN and USER API";
	}
	
	@ResponseBody
	@GetMapping("/userApi")
	public String getUserApi()
	{
		return "This is USER API";
	}
	
//	@GetMapping("/login")
//	public String doLogin()
//	{
//		return "register";
//	}
}
