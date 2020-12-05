package webler.szakdolgozat.honeyAndSalt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import webler.szakdolgozat.honeyAndSalt.entity.Ingredients;
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

	@GetMapping("/search")
	public String searchRecipes(Model model) {
		return "search";
	}

	@PostMapping("/searchingredients")
	public ModelAndView recipeSearchByNameContains(ModelAndView model, String searchText) {
		List<Ingredients> resultsIng = searchService.searchIngredientsByNameContains(searchText);
		model.addObject("search", resultsIng);
		return model;
	}
	
	@GetMapping("/searchingredients")
	public String recipeSearchByIngredientsContains(Model model) {
		return "searchingredients";
	}
	
	@PostMapping("/search")
	public ModelAndView recipeSearchByEverything(ModelAndView model, String searchText) {
		List<Recipe> results = new ArrayList<>();
		results.addAll(searchService.searchRecipeInstructionsContains(searchText));
		results.addAll(searchService.searchRecipeNameContains(searchText));

		model.addObject("search", results);
		return model;
	}
}
