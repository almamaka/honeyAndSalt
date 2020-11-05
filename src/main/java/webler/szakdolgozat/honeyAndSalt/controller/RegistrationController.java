package webler.szakdolgozat.honeyAndSalt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webler.szakdolgozat.honeyAndSalt.entity.User;

@Controller
public class RegistrationController {

	@GetMapping("/registration")
	public String registrationHoneyAndSalt(Model model) {
				
		model.addAttribute("userForm", new User());
		return("registration");
	}
	
	
}
