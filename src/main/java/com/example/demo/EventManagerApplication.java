package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@SpringBootApplication
public class EventManagerApplication implements CommandLineRunner {
	@Autowired	
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(EventManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(new User("Marsh","Mello"));
		userRepository.save(new User("Hard","Well"));
		userRepository.save(new User("Nicky","Romero"));
		userRepository.save(new User("Virat","Kohli", "vk18@gmail.com"));
		userRepository.save(new User("Rannvijay","Singh", "rs007@gmail.com"));
		userRepository.save(new User("Joel","Edwards", "je45@gmail.com"));
		userRepository.save(new User("Perrie","John", "Ph88@gmail.com"));
		
	}
}
