package com.parthiv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parthiv.model.UserDtls;
import com.parthiv.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;
	@Override
	public UserDtls createUser(UserDtls user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}
	
}
