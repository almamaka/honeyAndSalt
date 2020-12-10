package webler.szakdolgozat.honeyAndSalt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import webler.szakdolgozat.honeyAndSalt.service.HoneyAndSaltService;
import webler.szakdolgozat.honeyAndSalt.service.SearchService;

@Controller
public class ListController {

	@Autowired
	private HoneyAndSaltService honeyService;
	
	@Autowired
	private SearchService searchService;
	
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
	
	@GetMapping("/{name}")
	public String viewEditRecipe(Model model, @PathVariable("name") String name) {
		if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() == null) {
			return "redirect:/index";
		}
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		model.addAttribute("recipes", searchService.searchRecipeByName(name));
		model.addAttribute("user", SecurityContextHolder.getContext().getAuthentication().getName());
		System.out.println(searchService.searchRecipeByName(name));
		
		return "listrecipes";
	}
}
