package webler.szakdolgozat.honeyAndSalt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//import webler.szakdolgozat.honeyAndSalt.service.HoneyAndSaltService;

@Controller
public class RecipeSearchController {
	
//	@Autowired
//	private HoneyAndSaltService honeyAndSaltService;
	
	@GetMapping("/mainpage")
	public String recipeSearch(Model model) {
		
		//model.addAttribute("search", honeyAndSaltService.getAll());
		return "mainpage";
	}
}
