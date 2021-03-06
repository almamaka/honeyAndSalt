package webler.szakdolgozat.honeyAndSalt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import webler.szakdolgozat.honeyAndSalt.entity.Recipe;

public interface HoneyAndSaltRepository extends JpaRepository<Recipe, Long> {
	List<Recipe> findByInstructionsContaining(String infix);
	
	List<Recipe> findByNameContaining(String infix);

	List<Recipe> findByName(String recipeName);
	
	List<Recipe> findByIngredientsContaining(String infix);

	Recipe findOneByName(String name);
}
