package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired	
	private UserRepository userRepository;
	
	@PostMapping("/users/{id}")
	public User createUser(User user){
		return userRepository.save(user);
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable Long id){
		return userRepository.findOne(id);
	}
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/user")
	public User updateUser(User user){
		return userRepository.save(user);
	}
	
	@DeleteMapping("/users/{id}")
	public boolean deleteeUser(@PathVariable Long id){
		return userRepository.delete(id);
		return true;
	}
	
	
	
	
	


}
