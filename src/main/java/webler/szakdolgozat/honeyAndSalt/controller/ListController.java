package webler.szakdolgozat.honeyAndSalt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webler.szakdolgozat.honeyAndSalt.entity.User;
import webler.szakdolgozat.honeyAndSalt.service.HoneyAndSaltService;

@Controller
public class ListController {

	@Autowired
	private HoneyAndSaltService honeyService;
	
	@GetMapping("/listrecipes")
	public String listRecipes(Model model) {
		if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() == null) {
			return "redirect:/index";
		}
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		model.addAttribute("recipes", honeyService.getAll());
		model.addAttribute("user", SecurityContextHolder.getContext().getAuthentication().getName());
		return "listrecipes";
	}
}