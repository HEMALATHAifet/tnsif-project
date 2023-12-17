package com.hema.PlacementManagement;

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

import jakarta.persistence.NoResultException;

@RestController
public class UserController {
	@Autowired
	private User service;
	
	@GetMapping("/user")
	public List<UserService> list()
	{
		return service.listAll();
		
	}
	@PostMapping("/user")
	public void add(@RequestBody UserService usr)
	{
		service.save(usr);
	}
	@GetMapping("/user/{uid}")
	public ResponseEntity<UserService> get(@PathVariable Integer uid)
	{
		try
		{
			
			UserService usr=service.get(uid);	
			return new ResponseEntity<UserService>(usr,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<UserService>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/user/{uid}")
	public void delete(@PathVariable Integer uid)
	{
		service.delete(uid);
	}
	//update
	@PutMapping("/user/{uid}")
	public ResponseEntity<UserService> update(@PathVariable Integer uid,@RequestBody UserService update_u)
	{
		try 
		{
			UserService exist_usr=service.get(uid);
		    exist_usr.setUname(update_u.getUname());
		    exist_usr.setAddress(update_u.getAddress());
			service.update(exist_usr);
			return new ResponseEntity<UserService>(exist_usr,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<UserService>(HttpStatus.NOT_FOUND);
		}
	}
	

}












