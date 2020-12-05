package webler.szakdolgozat.honeyAndSalt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import webler.szakdolgozat.honeyAndSalt.entity.Ingredients;

public interface IngredientsRepository extends JpaRepository<Ingredients, Long> {
	
	List<Ingredients> findByNameContaining(String infix);
}
