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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeff.UsersAPI.models.User;
import com.jeff.UsersAPI.repositories.UserRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value="userApi", description="demo userAPI REST controller with Swagger")
@RestController
@RequestMapping("/v2")
public class UserControllerV2 {

	@Autowired
	private UserRepository userRepository;
	
	
	
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Successfully retrieved users living in state parameter"),
			@ApiResponse(code = 400, message = "State parameter required")
		})
	@ApiOperation(value = "Get all users by state (param required)", response = User.class, responseContainer = "List")
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers(@RequestParam(value="state", required=true) String state){
		
		List<User> users;
		if (state != null) {
			users = userRepository.findByState(state);
			return new ResponseEntity<List<User>> (users, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@ApiResponses(value = {
		    @ApiResponse(code = 404, message = "User not found"),
		    @ApiResponse(code = 200, message = "Successfully retrieved user by Id")
		})
	@ApiOperation(value = "Get user by Id", response = User.class)
	@GetMapping("/users/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable(value="id") Long id){
		
		Optional<User> foundUser = userRepository.findById(id);
		
		if (!foundUser.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Optional<User>>(foundUser, HttpStatus.OK);
	}
	
	@ApiResponses(value = {
			@ApiResponse(code = 400, message = "Request incorrectly formatted"),
		    @ApiResponse(code = 200, message = "User successfully created")
		})
	@ApiOperation(value = "Create a new user")
	@PostMapping("/users")
	public ResponseEntity<Void> createUser(@RequestBody @Valid User user,
			BindingResult bindingResult){
	if (bindingResult.hasErrors()) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
	userRepository.save(user);
	return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@ApiResponses(value = {
			@ApiResponse(code = 400, message = "Request incorrectly formatted"),
			@ApiResponse(code = 404, message = "User not found"),
		    @ApiResponse(code = 200, message = "User successfully updated")
		})
	@ApiOperation(value = "Update an existing user by id")
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
	
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "User not found"),
		    @ApiResponse(code = 200, message = "User successfully deleted")
		})
	@ApiOperation(value = "Delete a user by id")
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
