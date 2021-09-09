package com.java.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.restapi.entity.User;
import com.java.restapi.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	 
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		userService.save(user);
		return user;
	}
	
	@GetMapping("/users")
	public List<User> getAll() {
		
		return userService.findAll();
	}
	
	@DeleteMapping("/user")
	public void deleteUser(@RequestParam(name ="id") Long id) {
		userService.deleteById(id);
	}
	
	@PutMapping("/user")
	public void updateUser(@RequestBody User user) {
		List<User> list = userService.findAll();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == user.getId()) {
				userService.save(user);
			}	
		}
		
	}
}
