package webler.szakdolgozat.honeyAndSalt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webler.szakdolgozat.honeyAndSalt.entity.Recipe;
import webler.szakdolgozat.honeyAndSalt.repository.HoneyAndSaltRepository;

@Service
public class SearchService {

	@Autowired
	private HoneyAndSaltRepository honeyRepo;
	
	public List<Recipe> searchRecipeInstructionsContains(String infix) {
		
		return honeyRepo.findByInstructionsContaining(infix);
	}
	
	public List<Recipe> searchRecipeNameContains(String infix) {
		
		return honeyRepo.findByNameContaining(infix);
	}
}
