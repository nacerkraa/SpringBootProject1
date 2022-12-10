package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.repository.UserRepository;




@Configuration
public class UserConfig {
	

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return args -> {
			User achraf = new User(2L, "achraf@gmail.com", "Mouhamed", "Acharaf");
			User ahmed = new User(3L, "ahemd@gmail.com", "Ahmed", "alrade");
			
			userRepository.saveAll(List.of(achraf,ahmed));
		};
		
	}

}
