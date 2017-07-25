package com.billpoon.service;

import com.billpoon.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
