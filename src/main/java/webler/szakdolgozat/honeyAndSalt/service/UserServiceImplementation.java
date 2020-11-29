package webler.szakdolgozat.honeyAndSalt.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import webler.szakdolgozat.honeyAndSalt.entity.User;
import webler.szakdolgozat.honeyAndSalt.repository.RoleRepository;
import webler.szakdolgozat.honeyAndSalt.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService, Validator {

	@Autowired
    private UserRepository userRepository;
	
	@Autowired
	private SecurityService securityService;
	
	@Autowired
	private EmailSenderService emailSenderService;
	
    @Autowired
    private RoleRepository roleRepository;
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void register(User user, BindingResult bindingResult) {
    	
    	validate(user, bindingResult);
    	
    	if (bindingResult.hasErrors()){
    		return;
    	}
    	
    	save(user);
    	
    	securityService.autoLogin(user.getUsername(),  user.getPasswordConfirm());
    	
    	emailSenderService.sendRegistrationEmail(user);
    }
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
    
    @Override
	public boolean supports(Class<?> aClass) {
    	return User.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		User user = (User) o;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		if (user.getUsername().length() < 6 || user.getUsername().length() > 32) {
			errors.rejectValue("username", "Size.userForm.username");
		}
		if (findByUsername(user.getUsername()) != null) {
			errors.rejectValue("username", "Duplicate.userForm.username");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
			errors.rejectValue("password", "Size.userForm.password");
		}

		if (!user.getPasswordConfirm().equals(user.getPassword())) {
			errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
		}
	}
	
	@Override
	public User getLoggedInUser(String username) {
		return findByUsername(username);
	}
}
