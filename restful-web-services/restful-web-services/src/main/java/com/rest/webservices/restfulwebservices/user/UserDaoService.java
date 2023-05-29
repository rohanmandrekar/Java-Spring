package com.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	private static int usersCount=0;
	static {
		users.add(new User(++usersCount,"Rohan",LocalDate.now().minusYears(25)));	
		users.add(new User(++usersCount,"Sarina",LocalDate.now().minusYears(23)));
		users.add(new User(++usersCount,"Tester",LocalDate.now().minusYears(20)));
		}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findUserById(int id){
		Predicate<? super User> predicate = user-> user.getId()==(id);
		return users.stream().filter(predicate).findFirst().get();
		
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
		
	}

}
