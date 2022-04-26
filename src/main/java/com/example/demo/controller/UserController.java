package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserService;

@RestController
public class UserController {
	@Autowired(required = true)
	UserService service;
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id){
		User user=service.getUser(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	@PostMapping("/user/add")
	public ResponseEntity<String> addUser(@RequestBody User user){
		service.addUser(user);
		return new ResponseEntity<String>("created",HttpStatus.OK);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> users=service.getAllUsers();
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	@PutMapping("/usermodify")
	public ResponseEntity<String> modify(@RequestBody User user){
		service.updateUser(user);
		return new ResponseEntity<String>("modified",HttpStatus.OK);
	}
	@DeleteMapping("/userdelete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		service.deleteUser(id);
		return new ResponseEntity<String>("Deleted",HttpStatus.OK);
	}

}
