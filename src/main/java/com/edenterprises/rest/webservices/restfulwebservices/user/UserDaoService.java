package com.edenterprises.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static int usersCount = 0;
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(++usersCount, "Jordan", LocalDate.now().minusYears(32)));
		users.add(new User(++usersCount, "Izzy", LocalDate.now().minusYears(34)));
		users.add(new User(++usersCount, "Steve", LocalDate.now().minusYears(31)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
}
