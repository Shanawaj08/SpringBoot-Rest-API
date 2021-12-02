package com.sandy.springDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sandy.springDemo.entities.UserEntity;
import com.sandy.springDemo.service.UserService;

@RestController
public class UserController {
	
	@GetMapping()
	public String printHome() {
		return "Welcome to Springboot API Demo";
	}
	
	@Autowired
	UserService userService;
	
	@GetMapping("users") 
	public List<UserEntity> printAllUser() {
		List<UserEntity> users = userService.printAllUsers();
		return users;
	}
	
	@GetMapping("users/{id}")
	public UserEntity printUserById(@PathVariable("id") int id) {
		return userService.getUserById(id);
	}
	
	@PostMapping("users")
	public void postUser(@RequestBody UserEntity user) {
		userService.postUser(user);
	}
	
	@PutMapping("users")
	public void updateUser(@RequestBody UserEntity users) {
		userService.updateUser(users);
	}
	
	@DeleteMapping("users/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		userService.deleteUser(id);
	}
	

}
