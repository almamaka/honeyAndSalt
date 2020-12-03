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

	public Recipe getOne(Long id) {
		return honeyRepo.getOne(id);
	}

	public void saveRecipe(Recipe recipe) {
		if (recipe.getId() != null) {
			Recipe original = getOne(recipe.getId());
			original.setName(recipe.getName());
			original.setCookTime(recipe.getCookTime());
			original.setPrepTime(recipe.getPrepTime());
			original.setInstructions(recipe.getInstructions());
			recipe = original;
		}
		
		honeyRepo.save(recipe);

	}
	
	public void deleteRecipe(Long id) {
		honeyRepo.deleteById(id);
	}
}
