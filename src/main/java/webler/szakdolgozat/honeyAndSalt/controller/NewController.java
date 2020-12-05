package webler.szakdolgozat.honeyAndSalt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import webler.szakdolgozat.honeyAndSalt.entity.Recipe;
import webler.szakdolgozat.honeyAndSalt.service.HoneyAndSaltService;

@Controller
public class NewController {

	@Autowired
	private HoneyAndSaltService honeyService;
	
	@GetMapping("newrecipe")
	public String viewEditRecipe(Model model) {
		return "newrecipe";
	}
	
	@PostMapping("newrecipe")
	public String viewEditRecipe(Recipe recipe) {
		honeyService.saveRecipe(recipe);
		return "redirect:listrecipes";
	}
}
