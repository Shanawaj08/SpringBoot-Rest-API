package com.sandy.springDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandy.springDemo.entities.UserEntity;
import com.sandy.springDemo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public List<UserEntity> printAllUsers() {
		
		List<UserEntity> users = userRepo.findAll();
		return users;
	}
	
	public UserEntity getUserById(int id) {
		return userRepo.findById(id).get();
	}
	
	public void postUser(UserEntity user) {
		userRepo.save(user);
	}
	
	public void updateUser(UserEntity users) {
		userRepo.save(users);
	}
	
	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}
}
