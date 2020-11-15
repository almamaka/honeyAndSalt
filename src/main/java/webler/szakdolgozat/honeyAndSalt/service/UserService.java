package webler.szakdolgozat.honeyAndSalt.service;

import webler.szakdolgozat.honeyAndSalt.entity.User;

public interface UserService {

	void save (User user);
	
	User findByUsername(String username);
}
