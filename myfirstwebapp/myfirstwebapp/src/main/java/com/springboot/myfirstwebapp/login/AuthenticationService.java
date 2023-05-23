package com.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
public boolean authenticate(String username, String password) {
	boolean isValidUser= username.equalsIgnoreCase("rohan");
	boolean isValidPass= password.equalsIgnoreCase("admin");
	
	return isValidUser && isValidPass;
}
}
