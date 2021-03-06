package com.stackroute.UserAuth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.UserAuth.model.User;
import com.stackroute.UserAuth.service.UserService;

@RestController
@RequestMapping
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@GetMapping("/api/v1/user/{username}")
	public ResponseEntity<User> getAllUsers(@PathVariable String username){
		return new ResponseEntity<>(userService.getUserById(username),HttpStatus.OK);
	}
	
	@PostMapping("/api/v1/new/user")
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<>(userService.addUser(user),HttpStatus.CREATED);
	}
	
	
	
}
