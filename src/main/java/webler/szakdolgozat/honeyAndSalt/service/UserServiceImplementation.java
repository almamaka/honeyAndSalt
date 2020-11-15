package webler.szakdolgozat.honeyAndSalt.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import webler.szakdolgozat.honeyAndSalt.entity.User;
import webler.szakdolgozat.honeyAndSalt.repository.RoleRepository;
import webler.szakdolgozat.honeyAndSalt.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
    private UserRepository userRepository;
	
    @Autowired
    private RoleRepository roleRepository;
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
