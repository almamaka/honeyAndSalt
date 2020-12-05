package webler.szakdolgozat.honeyAndSalt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import webler.szakdolgozat.honeyAndSalt.entity.Recipe;
import webler.szakdolgozat.honeyAndSalt.entity.User;
import webler.szakdolgozat.honeyAndSalt.service.HoneyAndSaltService;
import webler.szakdolgozat.honeyAndSalt.service.UserServiceImplementation;

@Controller
public class FavouritesController {
	
	@Autowired
	private HoneyAndSaltService honeyService;
	
	@Autowired
	private UserServiceImplementation usi;
	
	@GetMapping("like/{id}")
	public String like(@PathVariable("id") Long id) {
		
		User loggedInUser = usi.getLoggedInUser(SecurityContextHolder.getContext().getAuthentication().getName());
		Recipe recipe = honeyService.getOneRecipe(id);
		
		recipe.getUsers().add(loggedInUser);
		loggedInUser.getLikedRecipes().add(recipe);
		
		honeyService.simpleSave(recipe);
		
		return "redirect:/favourites";
	}
	
	@GetMapping("unlike/{id}")
	public String unLike(@PathVariable("id") Long id) {
		
		User loggedInUser = usi.getLoggedInUser(SecurityContextHolder.getContext().getAuthentication().getName());
		Recipe recipe = honeyService.getOneRecipe(id);
		
		recipe.getUsers().remove(loggedInUser);
		loggedInUser.getLikedRecipes().remove(recipe);
		
		honeyService.simpleSave(recipe);
		
		return "redirect:/favourites";
	}
	
	@GetMapping("/favourites")
	public String recipeFavourites(Model model) {
		if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() == null) {
			return "redirect:/index";
		}
		
		User loggedInUser = usi.getLoggedInUser(SecurityContextHolder.getContext().getAuthentication().getName());
		List<Recipe> favouriteRecipes = loggedInUser.getLikedRecipes();
		model.addAttribute("recipes", favouriteRecipes);
		model.addAttribute("user", SecurityContextHolder.getContext().getAuthentication().getName());
		return "favourites";
	}
	
}
