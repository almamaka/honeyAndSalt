package webler.szakdolgozat.honeyAndSalt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import webler.szakdolgozat.honeyAndSalt.entity.User;
import webler.szakdolgozat.honeyAndSalt.service.UserService;


@Controller
public class UserController {

	@Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
    	userService.register(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }
        else {

        	return "redirect:/welcome";
        }
    }

    @GetMapping("/")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Nem megfelelő felhasználónév és jelszó.");

        if (logout != null)
            model.addAttribute("message", "Sikeres kijelentkezés.");

        return "index";
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        return "welcome";
    }
    
    @GetMapping("/userdata") 
    public String userDataShow(Model model) {
    	if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() == null) {
			return "redirect:/index";
		}
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		model.addAttribute("user", userService.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()));
    	return "userdata";
    }
}

