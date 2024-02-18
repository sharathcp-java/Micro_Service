package com.gateway.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gateway.api.entity.UserDetail;

public interface UserRepository extends JpaRepository<UserDetail, Integer>{

	UserDetail findByUsername(String username);
	

}
