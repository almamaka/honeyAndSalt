package webler.szakdolgozat.honeyAndSalt.service;

import org.springframework.validation.BindingResult;

import webler.szakdolgozat.honeyAndSalt.entity.User;

public interface UserService {

	void register(User user, BindingResult bindingResult);
	
	void save (User user);
	
	User getLoggedInUser(String username);
	
	User findByUsername(String username);
	
	Long getUserId(String username);
}
