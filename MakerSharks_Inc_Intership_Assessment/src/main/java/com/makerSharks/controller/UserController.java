package com.makerSharks.controller;

import java.util.ArrayList;
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

import com.makerSharks.entity.User;
import com.makerSharks.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService service;
	

//	below we are creating and saving a user into a Database
	@PostMapping("/register")
	public ResponseEntity<User> create(@RequestBody User user){
		
		try {
			return new ResponseEntity<User>( service.create(user),HttpStatus.CREATED );
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>( null,HttpStatus.BAD_REQUEST);
	}
	
	
//	below we are Fetching all users from the database
	@GetMapping("/fetch")
	public ResponseEntity<List<User>>  fetchAll(){
		
		try {
			return new ResponseEntity<List<User>>(service.fetchAllUsers(),HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		
	}
	
	
//	below we are fetching users from database by their username
	@GetMapping("/fetch/{username}")
	public ResponseEntity<User>  fetchByUsename(@PathVariable String username){
		
		try {
			return new ResponseEntity<User>(service.fetchByUsername(username),HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>( null,HttpStatus.BAD_REQUEST);
		
	}
	
	
//	below we are fetching users from database by their ID
	@GetMapping("/fetch/{id}")
	public ResponseEntity<User>  fetchById(@PathVariable int id){
		
		try {
			return new ResponseEntity<User>(service.fetchByID(id),HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>( null,HttpStatus.BAD_REQUEST);
		
	}

}
