package com.dbms.login.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbms.login.entities.User;
import java.util.List;


public interface UserRepo extends JpaRepository<User, String>{
	
		
	public Optional<User> findByEmail(String email);

}
