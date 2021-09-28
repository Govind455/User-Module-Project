package com.users.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.users.users.model.User;
import com.users.users.service.UserService;

public class UserController {
	
	@Autowired
	private UserService userService;
	
	//this method use to access all user details 
	@GetMapping("/user")
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	//this method use to access particular one user details
	@GetMapping("/user/{id}")
	public User getOneUser(@PathVariable long id){
		return userService.getOneUser(id);
	}
	
	//this method use to create user 
	@PostMapping("/user")
	public void uploadUser(@RequestBody User user) {
		 userService.uploadUser(user);
	}
	
	//this method use to update user
	@PutMapping("/user/{id}")
	public void updateUser(@PathVariable long id,@RequestBody User user)
	{
		userService.uploadUser(id,user);
	}
	
	//this method use to delete user from 
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable long id) {
		userService.deleteUser(id);
	}
	
	//this method use to delete all user from db 
	public void deleteAllUser() {
		userService.deleteAllUser();
	}
}
