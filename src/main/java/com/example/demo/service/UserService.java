package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.dao.User;

@Service
public class UserService {
	public List<User> index() {
		User user = new User(1L,"nacer","kraa","nacer@gmail.com");
		List<User> l = new ArrayList<User>();
		l.add(user);
		l.add(user);
		return l;
	}

}
