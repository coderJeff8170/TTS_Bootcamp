package com.jeff.UsersAPI.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeff.UsersAPI.models.User;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {
	
	List<User> findAllByState(String state);
	
	List<User> findAll();
	
	User findById(String id);

	List<User> findByState(String state);
}
