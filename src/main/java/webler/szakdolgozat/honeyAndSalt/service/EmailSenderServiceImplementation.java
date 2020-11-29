package webler.szakdolgozat.honeyAndSalt.service;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import lombok.extern.log4j.Log4j2;
import webler.szakdolgozat.honeyAndSalt.entity.Mail;
import webler.szakdolgozat.honeyAndSalt.entity.User;

@Log4j2
@Service
public class EmailSenderServiceImplementation implements EmailSenderService {
	
	@Value("${mail.sender.email}")
	private String senderEmail;
	
	@Autowired
	private JavaMailSender emailSender;

	@Autowired
	private SpringTemplateEngine templateEngine;
	
	private void sendEmail(Mail mail) throws MessagingException {
		MimeMessage message = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,
				MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
					StandardCharsets.UTF_8.name());
		Context context = new Context();
		context.setVariables(mail.getProps());

		String html = templateEngine.process(mail.getTemplate(), context);
		helper.setTo(mail.getMailTo());
		helper.setText(html, true);
		helper.setSubject(mail.getSubject());
		helper.setFrom(mail.getFrom());
		emailSender.send(message);
	}

	@Override
	public void sendRegistrationEmail(User user){

		Map<String, Object> model = new HashMap<>();
		model.put("userName", user.getUsername());
		model.put("sign", "Salt and Honey Ügyfélszolgálat");

		Mail registrationEmail = Mail.builder()
				.mailTo(user.getEmail())
				.from(senderEmail)
				.subject("Sikeres regisztráció!")
				.props(model)
				.template("mail/template-registration")
				.build();

		try {
			sendEmail(registrationEmail);
		} catch (MessagingException e) {
			log.error("Error sending registration email: ", e);
		}

	}
}
