package webler.szakdolgozat.honeyAndSalt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import webler.szakdolgozat.honeyAndSalt.entity.Recipe;
import webler.szakdolgozat.honeyAndSalt.service.HoneyAndSaltService;
import webler.szakdolgozat.honeyAndSalt.service.SearchService;

@Controller
public class RecipeSearchController {
	
	@Autowired
	private HoneyAndSaltService honeyAndSaltService;
	private SearchService searchService;
	
	@GetMapping("/mainpage")
	public String recipeMain(Model model) {
		
		//model.addAttribute("search", honeyAndSaltService.getAll());
		return "mainpage";
	}
	
	@PostMapping("/search")
	public ModelAndView recipeSearch(String searchText) {
		ModelAndView model = new ModelAndView("search");
		List<Recipe> results = searchService.searchRecipeInstructionsContains(searchText);
		model.addObject("search", results);
		return model;
	}
//	
//	@PostMapping("/mainpage")
//	public String recipeSearch(Model model, String searchText) {
//		List<Recipe> results = searchService.searchRecipeInstructionsContains(searchText);
//		model.addAttribute("searchResults", results);
//		return "redirect:/search";
//	
//	
	@GetMapping("/search")
	public String searchRecipes(Model model) {
//		List<Recipe> results = searchService.searchRecipeInstructionsContains("komment");
//		model.addAttribute("search", results);
		return "search";
	}
	
	@GetMapping("/listrecipes")
	public String listRecipes(Model model) {
		
		model.addAttribute("recipes", honeyAndSaltService.getAll());
		return "listrecipes";
	}
}
