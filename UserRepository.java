package com.project.user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.user.service.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
	
	//basic get and save methods are already present in JpaRepository, but manual ,methods can be created here

}
