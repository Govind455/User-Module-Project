package com.users.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.users.users.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	public User findById(long id);

}
