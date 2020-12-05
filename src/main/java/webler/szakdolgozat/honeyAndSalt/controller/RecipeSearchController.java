package webler.szakdolgozat.honeyAndSalt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

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
//	
//	@PostMapping("/search")
//	public ModelAndView recipeSearch(ModelAndView model, String searchText) {
//		List<Recipe> results = searchService.searchRecipeInstructionsContains(searchText);
//		model.addObject("search", results);
//		return model;
//	}

	@GetMapping("/search")
	public String searchRecipes(Model model) {
		return "search";
	}
	
//	@PostMapping("/searchIngredients")
//	public ModelAndView recipeSearchByIngredienstContains(ModelAndView model, String searchText) {
//		List<Recipe> results = searchService.searchRecipeIngredientsContains(searchText);
//		model.addObject("search", results);
//		return model;
//	}
	
	@GetMapping("/searchingredients")
	public String recipeSearchByIngredientsContains(Model model) {
		return "searchingredients";
	}
	
	
	
	@PostMapping("/searchingredients")
	public ModelAndView recipeSearchByNameContains(ModelAndView model, String searchText) {
		List<Ingredients> resultsIng = searchService.searchIngredientsByNameContains(searchText);
		model.addObject("search", resultsIng);
		return model;
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
