package webler.szakdolgozat.honeyAndSalt.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
	protected String url = baseUrl + "/";
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private By usernameField = By.id("username");
	private By passwordField = By.id("pwd");
	private By loginButton = By.id("btn");
	
	public LoginPage goTo() {
		driver.get(url);
		return this;
	}
	
	public void signIn(String user, String password) {
		type(usernameField, user);
		type(passwordField, password);
		click(loginButton);
	}
	
	
}
