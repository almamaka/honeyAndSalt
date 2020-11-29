package webler.szakdolgozat.honeyAndSalt.entity;

import java.util.List;
import java.util.Map;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Mail {

	private String from;
	private String mailTo;
	private String subject;
	private List<Object> attachments;
	private Map<String, Object> props;
	private String template;
	
}
