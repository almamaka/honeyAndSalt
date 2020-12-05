package webler.szakdolgozat.honeyAndSalt.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import webler.szakdolgozat.honeyAndSalt.entity.Ingredients;
import webler.szakdolgozat.honeyAndSalt.entity.Recipe;
import webler.szakdolgozat.honeyAndSalt.repository.HoneyAndSaltRepository;
import webler.szakdolgozat.honeyAndSalt.repository.IngredientsRepository;

@Service
public class SearchService {

	@Autowired
	private HoneyAndSaltRepository honeyRepo;
	
	@Autowired
	private IngredientsRepository ingrRepo;
	
	public List<Recipe> searchRecipeInstructionsContains(String infix) {
		
		return honeyRepo.findByInstructionsContaining(infix);
	}
	
	public List<Recipe> searchRecipeNameContains(String infix) {
		
		return honeyRepo.findByNameContaining(infix);
	}
	
	public List<Recipe> searchRecipeByName(String recipeName) {
		
		return honeyRepo.findByName(recipeName);
	}
	
	public List<Ingredients> searchIngredientsByNameContains(String infix) {
		
		return ingrRepo.findByNameContaining(infix);
	}

}
