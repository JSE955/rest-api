package com.edenterprises.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Jordan", LocalDate.now().minusYears(32)));
		users.add(new User(2, "Izzy", LocalDate.now().minusYears(34)));
		users.add(new User(3, "Steve", LocalDate.now().minusYears(31)));
	}
}
