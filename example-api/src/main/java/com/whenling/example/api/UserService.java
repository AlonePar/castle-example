package com.whenling.example.api;

import com.whenling.example.domain.User;

public interface UserService {

	User findByUsername(String username);

	User findByEmail(String email);

	User findByMobile(String mobile);

	User findOne(Long id);

	String getPassword(User user);

	User update(User user);

	void changePassword(User user, String newEncodedPassword);

	User register(User user, String encodedPassword);
}
