package com.parthiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parthiv.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls,Integer>{
	
}
