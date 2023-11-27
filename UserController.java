package com.project.user.service.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.user.service.entities.User;
import com.project.user.service.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	//create user
	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User user){
		userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
	
	//get user with given userId
	@GetMapping("/getUser/{userId}")
	public ResponseEntity<User> getUser(@PathVariable String userId){
		User user=userService.getUser(userId);
		return ResponseEntity.ok(user);
	}
	
	//get all users
	@GetMapping("/getUsers")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> users=userService.getAllUsers();
		return ResponseEntity.ok(users);
	}
	
}
