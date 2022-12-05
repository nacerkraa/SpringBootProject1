package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.User;

@RestController
public class AppController {
	
	@GetMapping("/")
	public List<User> index() {
		User user = new User(1L,"nacer","kraa");
		List<User> l = new ArrayList<User>();
		l.add(user);
		l.add(user);
		return l;
	}

}
