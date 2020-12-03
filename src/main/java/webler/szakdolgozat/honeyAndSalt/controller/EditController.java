package webler.szakdolgozat.honeyAndSalt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import webler.szakdolgozat.honeyAndSalt.entity.Recipe;
import webler.szakdolgozat.honeyAndSalt.service.HoneyAndSaltService;

@Controller
public class EditController {

	@Autowired
	private HoneyAndSaltService honeyService;
	
	@GetMapping("edit/{id}")
	public String viewEditRecipe(Model model, @PathVariable("id") Long id) {
		model.addAttribute("recipe", honeyService.getOne(id));
		
		return "editrecipes";
	}
	
	@PostMapping("edit")
	public String viewEditRecipe(Recipe recipe) {
		honeyService.saveRecipe(recipe);
		return "redirect:/listrecipes";
	}
}
