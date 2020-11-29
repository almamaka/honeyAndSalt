package webler.szakdolgozat.honeyAndSalt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webler.szakdolgozat.honeyAndSalt.entity.Recipe;
import webler.szakdolgozat.honeyAndSalt.repository.HoneyAndSaltRepository;

@Service
public class HoneyAndSaltService {

	@Autowired
	private HoneyAndSaltRepository honeyRepo;

	public List<Recipe> getAll() {
		
		return honeyRepo.findAll();
	}

	public Recipe getOneRecipe(Long id) {
		
		return honeyRepo.getOne(id);
	}

	public void simpleSave(Recipe recipe) {
		
		honeyRepo.save(recipe);
	}
	
}
