package com.dbms.login.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dbms.login.entities.User;
import com.dbms.login.repositories.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
 
	public List<User> getUsers() {
		return repo.findAll();
	}
	
	public User createUser(User user) {
		user.setUserId(UUID.randomUUID().toString()); 
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return repo.save(user);
	}
	
}
