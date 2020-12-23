package com.jeff.UsersAPI.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeff.UsersAPI.models.User;
import com.jeff.UsersAPI.repositories.UserRepository;

//vv this just means we're an API and don't return a view
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	
//	@GetMapping("/users")
//	public List<User> getUsers(){
//	return (List<User>) userRepository.findAllByState("Florida");
//	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers(@RequestParam(value="state", required=false) String state){
	List<User> users;
	if (state != null) {
	//return (List<User>) userRepository.findByState(state);
	users = userRepository.findByState(state);
	return new ResponseEntity<List<User>> (users, HttpStatus.OK);
	}
	//return (List<User>) userRepository.findAll();
	users = userRepository.findAll();
	return new ResponseEntity<List<User>> (users, HttpStatus.OK);
	}
	
	//TODO: update this one to use response entity
	@GetMapping("/users/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable(value="id") Long id, BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
	        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	    }
		Optional<User> foundUser = userRepository.findById(id);
		
		if (!foundUser.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Optional<User>>(foundUser, HttpStatus.OK);
	
	}
	
	@PostMapping("/users")
	public ResponseEntity<Void> createUser(@RequestBody @Valid User user,
			BindingResult bindingResult){
	if (bindingResult.hasErrors()) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
	userRepository.save(user);
	return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<Void> updateUser(@PathVariable(value="id") Long id, 
			@RequestBody @Valid User user, BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
	        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	    }
		
		Optional<User> foundUser = userRepository.findById(id);
		if (!foundUser.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		userRepository.save(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable(value="id") Long id){
		Optional<User> foundUser = userRepository.findById(id);
		if (!foundUser.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		userRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
