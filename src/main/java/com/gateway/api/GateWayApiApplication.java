package com.gateway.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gateway.api.entity.UserDetail;
import com.gateway.api.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class GateWayApiApplication {
	@Autowired
	private UserRepository repository;
	
	@PostConstruct
	public void initUsers() {
		List<UserDetail> user=Stream.of(
				new UserDetail(101,"user1","password1","user1@gmail.com"),
				new UserDetail(102,"user2","password2","user2@gmail.com"),
				new UserDetail(103,"user3","password3","user3@gmail.com"),
				new UserDetail(104,"user4","password4","user4@gmail.com"),
				new UserDetail(105,"user5","password5","user5@gmail.com")
				).collect(Collectors.toList());
		repository.saveAll(user);
	}



	public static void main(String[] args) {SpringApplication.run(GateWayApiApplication.class, args);}

}
