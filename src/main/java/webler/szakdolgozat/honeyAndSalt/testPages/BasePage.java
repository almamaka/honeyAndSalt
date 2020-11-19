package webler.szakdolgozat.honeyAndSalt.testPages;

import org.openqa.selenium.WebDriver;

public class BasePage {
	String baseUrl = "http://localhost:8080/";
	
	WebDriver driver;
	
	public BasePage (WebDriver driver) {
		this.driver = driver;
	}
}
