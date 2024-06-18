package com.makerSharks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makerSharks.entity.User;
import com.makerSharks.repo.UserRepo;


// this is our service class that why we declare it with service annotation
@Service
public class UserServiceImpl implements UserService {

	@Autowired // we use autowired annotation to automatic dependency injection
	private UserRepo repo;

	@Override
	public User create(User user) {
		
		return repo.save(user);
	}

	@Override
	public List<User> fetchAllUsers() {
		
		return repo.findAll();
	}

	@Override
	public User fetchByUsername(String Username) {

		return repo.findByUsername(Username);
	}

	@Override
	public User fetchByID(int id) {
		
		return repo.findById(id).orElseThrow(()->new RuntimeException("Given ID not found!!"));
	}
	
	
}
