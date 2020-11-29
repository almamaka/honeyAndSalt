package webler.szakdolgozat.honeyAndSalt.service;

import webler.szakdolgozat.honeyAndSalt.entity.User;

public interface EmailSenderService {

	void sendRegistrationEmail(User user);
}
