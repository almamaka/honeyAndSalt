package webler.szakdolgozat.honeyAndSalt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import webler.szakdolgozat.honeyAndSalt.entity.Recipe;

public interface HoneyAndSaltRepository extends JpaRepository<Recipe, Long> {
	List<Recipe> findByInstructionsContaining(String infix);

}
