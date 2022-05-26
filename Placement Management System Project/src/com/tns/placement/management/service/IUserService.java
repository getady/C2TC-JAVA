package com.tns.placement.management.service;

import com.tns.placement.management.entities.User;

public interface IUserService {

	public User addUser(User user); //C
	public User updateUser(User user); //U
	public User deleteUser(User user); //D 
	public User searchUserById(int id); //R
}
