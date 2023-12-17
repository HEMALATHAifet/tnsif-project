package com.hema.PlacementManagement;
//service class

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class User {
	@Autowired
	private UserRepository repo;
	//Get all the records from the table
	public List<UserService> listAll()
	{
		return repo.findAll();	
	}
    //save the values to the table
	public void save(UserService usr)
	{
		repo.save(usr);
	}

	//retrieving the particular record
	public UserService get(Integer uid)
	{
		return repo.findById(uid).get();
	}
	
	//delete the particular record
	public void delete(Integer uid)
	{
		repo.deleteById(uid);
	}
	//update the record
	public void update(UserService usr)
	{
		repo.save(usr);
	}
	
}
