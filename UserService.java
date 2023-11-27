package com.project.user.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.user.service.entities.User;


@Service
public interface UserService {
	//User Operations
	
	//Create User
	
	User saveUser(User user);
	
	//getSingle user with given userId
	
	User getUser(String userId);
	
	//get All users
	
	List<User> getAllUsers();
	
	
	//delete User with given userId
	Optional<User> deleteUser(String userId);
	
	
	//Update user with given userId
	User updateUser(User user);
}
