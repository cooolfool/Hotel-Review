package com.project.user.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.user.service.entities.User;
import com.project.user.service.exceptions.ResourceNotFoundException;
import com.project.user.service.repositories.UserRepository;
import com.project.user.service.services.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	  private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		String randomUserID=UUID.randomUUID().toString();
		user.setUserId(randomUserID);
		userRepository.save(user);
		logger.info("Here is the newly created user: "+ user);
		return user;
	}

	@Override
	public User getUser(String userId) {
		User user;
		user = userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User is not present with given id : "+userId));
		logger.info("Here is the user with id :"+userId+"  "+user);
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		List<User>users;
		users=userRepository.findAll();
		logger.info("Here are the users:" + users);
		return users;
	}

	@Override
	public Optional<User> deleteUser(String userId) {
		Optional<User> user;
		user=userRepository.findById(userId);
		userRepository.deleteById(userId);
		return user;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		return user;
	}

}
