package webler.szakdolgozat.honeyAndSalt.service;

import org.springframework.validation.BindingResult;

import webler.szakdolgozat.honeyAndSalt.entity.User;

public interface UserService {

	void register(User user, BindingResult bindingResult);
	
	void save (User user);
	
	User findByUsername(String username);
}
