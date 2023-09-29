package com.dbms.login.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbms.login.entities.User;
import com.dbms.login.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getUsers() {
		System.out.println("geting users");
		return this.userService.getUsers();
	}
	
	@GetMapping("/current-user")
	public String getLogggedInUsers(Principal principal) {
		return principal.getName();
	}
}
