package com.tns.placement.management.service;

import com.tns.placement.management.entities.User;
import com.tns.placement.management.repository.IUserRepository;
import com.tns.placement.management.repository.UserRepositoryImpl;

public class UserServiceImpl implements IUserService {

	IUserRepository dao;

//	Step 1: Call the IUserRepository or dao 
	public UserServiceImpl() {
		dao = new UserRepositoryImpl();
	}

	
//  Step 2: Implement methods IUserRepo
	@Override
	public User addUser(User user) {
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User deleteUser(User user) {
		dao.beginTransaction();
		dao.deleteUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User searchUserById(int id) {
		User user = dao.searchUserById(id);
		return user;
	}

}
