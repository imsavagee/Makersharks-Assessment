package com.makerSharks.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.makerSharks.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
//	Below I defined a Custom Finder Method
	User findByUsername(String username);

}
