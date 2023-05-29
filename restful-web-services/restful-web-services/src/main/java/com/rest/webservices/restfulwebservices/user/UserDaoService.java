package com.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Rohan",LocalDate.now().minusYears(25)));	
		users.add(new User(2,"Sarina",LocalDate.now().minusYears(23)));
		users.add(new User(2,"Tester",LocalDate.now().minusYears(20)));
		}
	
	public List<User> findAll(){
		return users;
	}

}
