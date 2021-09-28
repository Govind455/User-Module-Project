package com.users.users.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.users.model.User;
import com.users.users.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> getUsers() {
		List<User> user = new ArrayList<>();
		userRepository.findAll()
		.forEach(user::add);
		return user;
	}

	public User getOneUser(long id) {
		return userRepository.findById(id);
	}

	public void uploadUser(User user) {
		userRepository.save(user);
	}

	public void uploadUser(long id, User user) {
		
//		User user1 = new User();
		
		User user1 = userRepository.findById(id);
		
		user1.setId(user.getId());
		user1.setAge(user.getAge());
		user1.setName(user.getName());
		
		userRepository.save(user1);
	}

	public void deleteUser(long id) {
		userRepository.deleteById(id);
	}
	
	public void deleteAllUser() {
		userRepository.deleteAll();
	}
}
