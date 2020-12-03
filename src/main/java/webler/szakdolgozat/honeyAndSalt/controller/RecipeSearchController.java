package webler.szakdolgozat.honeyAndSalt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import webler.szakdolgozat.honeyAndSalt.entity.Recipe;
import webler.szakdolgozat.honeyAndSalt.service.SearchService;

@Controller
public class RecipeSearchController {

	@Autowired
	private SearchService searchService;
	
	@GetMapping("/mainpage")
	public String recipeMain(Model model) {
		return "mainpage";
	}
	
	@PostMapping("/search")
	public ModelAndView recipeSearch(ModelAndView model, String searchText) {
		List<Recipe> results = searchService.searchRecipeInstructionsContains(searchText);
		model.addObject("search", results);
		return model;
	}

	@GetMapping("/search")
	public String searchRecipes(Model model) {
		return "search";
	}

}
