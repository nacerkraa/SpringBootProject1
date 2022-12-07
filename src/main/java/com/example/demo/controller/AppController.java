package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping(path="api/v1")
public class AppController {
	
	private final UserService userservise;
	
	@Autowired
	public AppController(UserService userservise) {
		this.userservise = userservise;
	}
	
	@GetMapping
	public List<User> Call() {
		return userservise.index();
	}
	
	
	
	

}
