package webler.szakdolgozat.honeyAndSalt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import webler.szakdolgozat.honeyAndSalt.entity.Recipe;
import webler.szakdolgozat.honeyAndSalt.entity.User;
import webler.szakdolgozat.honeyAndSalt.service.HoneyAndSaltService;

@Controller
public class FavouritesController {
	
	@Autowired
	private HoneyAndSaltService honeyService;
	
	@GetMapping("like/{id}")
	public String like(@PathVariable("id") Long id) {
		
		User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Recipe recipe = honeyService.getOneRecipe(id);
		
		recipe.getUsers().add(loggedInUser);
		loggedInUser.getLikedRecipes().add(recipe);
		
		honeyService.simpleSave(recipe);
		
		return "redirect:/listrecipes";
	}
	
	@GetMapping("unlike/{id}")
	public String unLike(@PathVariable("id") Long id) {
		
		User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Recipe recipe = honeyService.getOneRecipe(id);
		
		recipe.getUsers().remove(loggedInUser);
		loggedInUser.getLikedRecipes().remove(recipe);
		
		honeyService.simpleSave(recipe);
		
		return "redirect:/listrecipes";
	}
	
	@GetMapping("/favourites")
	public String recipeFavourites(Model model) {
		return "favourites";
	}
	
}
