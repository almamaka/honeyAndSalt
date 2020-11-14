package webler.szakdolgozat.honeyAndSalt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webler.szakdolgozat.honeyAndSalt.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
