package service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import entities.User;

@Service
public interface UserService {

	//public ResponseEntity<User> createUser(User user);
	
	//public ResponseEntity<User> saveUser(User user);
	public User createUser(User user);
}
