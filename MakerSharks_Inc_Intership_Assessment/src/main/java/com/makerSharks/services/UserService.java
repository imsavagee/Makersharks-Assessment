package com.makerSharks.services;

import java.util.List;

import com.makerSharks.entity.User;

//this is our interface to provide loose coupling in our application

public interface UserService {
	
//	below are the abstract method which we further use in UserServiceImpl class
	
	User create(User user);
	List<User> fetchAllUsers();
	User fetchByUsername(String username);
	User fetchByID(int id);


}
